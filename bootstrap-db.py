import sys
import argparse
import sqlite3


policiais = [(1,'jose',2),
           (2,'marcos',1),
           (3,'joao',3),
           (4,'ronaldo',4),
           (5,'luiz',3),
           (6,'julio',1),
           (7,'renata',1),
           (8,'fabio',1),
           (9,'diego',2),
           (10,'rui',3),
           (11,'maria',1)]

patentes = [(1,'soldado'),
            (2,'cabo'),
            (3,'sargento'),
            (4,'tenente')]

viaturas = [(1,'suaidas678','GXY8721',1960,'147', 1, 'Fiat'),
            (2,'gnmdfkj678','HYJ8721',1970,'Corolla', 1, 'Toyota'),
            (3,'jndskf876','GBH7895',1980,'Hilux', 1, 'Toyota'),
            (4,'msdf652d2','ABC1234',1990,'Punto', 1, 'Fiat'),
            (5,'nfsdk7233','BVA9876',2000,'Palio', 1, 'Fiat'),
            (6,'fns652hdsj','AAB8990',2010,'Uno', 1, 'Fiat')]

status_viaturas = [(1,'Disponivel'),
            (2,'Em manutencao'),
            (3,'Em atendimento'),
            (4,'Em deslocamento')]

servicos_emergencia = [(1,'SAMU',192),
                      (2,'Bombeiros',193),
                      (3,'Policia Civil',191)]

tipos_incidentes = [(1,'Roubo'),
                    (2,'Furto'),
                    (3,'Terrorismo'),
                    (4,'Afogamento')]

incidentes = [(1,1,'2014-10-22 10:10:10','observando algo',222,'Casa','Rua jose ronaldo luis','Alvorada','Centro','Contagem','MG'),
              (2,2,'2014-08-12 10:12:11','observando2 algo',221,'apto','Rua jose ronaldo luis','Alvorada','Centro','Esmeraldas','MG'),
              (3,3,'2014-11-26 12:16:12','observando3 algo',222,'apto','Rua jose ronaldo luis','Alvorada','Centro','BH','MG'),
              (4,1,'2014-12-24 20:17:13','observando4 algo',223,'apto','Rua luis luis','Alvorada','Centro','BH','MG'),
              (5,2,'2014-11-20 00:10:14','observando5 algo',224,'Casa','Rua jose ronaldo luis','Alvorada','Centro','Lavras','MG'),
              (6,1,'2014-08-16 15:10:15','observando6 algo',2256,'Casa','Rua jose ronaldo luis','Alvorada','Centro','Contagem','MG')]


def create_parser(): # {{{
    # pylint: disable=R0912

    parser = argparse.ArgumentParser()
    parser.add_argument('--outdb',
                        dest='outdb',
                        metavar='FILE',
                        type=str,
                        required=True,
                        help='File where to create database')

    return parser
# }}}


def main():
    parser = create_parser()
    opts = parser.parse_args()

    conn = sqlite3.connect(opts.outdb)
    curr = conn.cursor()

    curr.execute('''create table policial (matricula int not null,
                                          nome text not null,
                                          patente int not null,
                                          PRIMARY KEY(matricula),
                                          FOREIGN KEY(patente)
                                          REFERENCES patente(numero));''')

    curr.execute('''create table patente (numero int not null,
                                          nome text not null,
                                          PRIMARY KEY(numero));''')

    curr.execute('''create table viatura (numero int not null,
                                          renavam text not null,
                                          placa text not null,
                                          ano int not null,
                                          modelo text not null,
                                          status int not null,
                                          fabricante text not null,
                                          PRIMARY KEY(numero),
                                          FOREIGN KEY(status)
                                          REFERENCES status_viatura(numero));''')

    curr.execute('''create table status_viatura (numero int not null,
                                          nome text not null,
                                          PRIMARY KEY(numero));''')

    curr.execute('''create table servico_emergencia (numero int not null,
                                          nome text not null,
                                          telefone text not null,
                                          PRIMARY KEY(numero));''')

    curr.execute('''create table tipo_incidente (numero int not null,
                                          descricao text not null,
                                          PRIMARY KEY(numero));''')
  
    curr.execute('''create table incidente (numero int not null,
                                          tipo int not null,
                                          data datetime not null,
                                          observacao text not null,
                                          num_rua int null,
                                          complemento text null,
                                          logradouro text not null,
                                          bairro text not null,
                                          regiao text not null,
                                          cidade text not null,
                                          uf text not null,
                                          PRIMARY KEY(numero),
                                          FOREIGN KEY(tipo)
                                          REFERENCES tipo_incidente(numero));''')


    for matricula, nome, patente in policiais:
        curr.execute('INSERT INTO policial VALUES (?, ?, ?)',
            (matricula, nome, patente))


    for numero, nome in patentes:
        curr.execute('INSERT INTO patente VALUES (?, ?)',
            (numero, nome))

    for numero, renavam, placa, ano, modelo, status, fabricante in viaturas:
        curr.execute('INSERT INTO viatura VALUES (?, ?, ?, ?, ?, ?, ?)',
            (numero, renavam, placa, ano, modelo, status, fabricante))

    for numero, nome in status_viaturas:
        curr.execute('INSERT INTO status_viatura VALUES (?, ?)',
            (numero, nome))

    for numero, nome, telefone in servicos_emergencia:
        curr.execute('INSERT INTO servico_emergencia VALUES (?, ?, ?)',
            (numero, nome, telefone))

    for numero, descricao in tipos_incidentes:
        curr.execute('INSERT INTO tipo_incidente VALUES (?, ?)',
            (numero, descricao))

    for numero, tipo, data, observacao, num_rua, complemento, logradouro, bairro, regiao, cidade, uf in incidentes:
        curr.execute('INSERT INTO incidente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)',
            (numero, tipo, data, observacao, num_rua, complemento, logradouro, bairro, regiao, cidade, uf))

    conn.commit()
    conn.close()


if __name__ == '__main__':
    sys.exit(main())