package viaturas.dbPersistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import viaturas.controller.Bairro;
import viaturas.controller.Cidade;
import viaturas.controller.Endereco;
import viaturas.controller.Incidente;
import viaturas.controller.Logradouro;
import viaturas.controller.Regiao;
import viaturas.controller.TipoIncidente;

public class Dbadim {
	
	private Connection conn;
    private Statement stm; 
 
    /**
     * Realisa uma conexão co o banco
     * @param arquivo onde se encontra o arquivo do banco
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void SQLite(String arquivo) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
        this.stm = this.conn.createStatement();
    }
	 
    /**
     * Realisa uma cosulta.
     * @param sql -  string do sql.
     * @return
     * @throws SQLException
     */
    public ResultSet consultar(String sql) throws SQLException {
         
        ResultSet rs = stm.executeQuery(sql);
        return rs;
    }
    
    /**
     * Retorna o metadata da de um resultado da caosulta.
     * @param ResultConsulta
     * @return retorn um tipo ResultSetMetaData de uma cosulta.
     * @throws SQLException
     */
    public ResultSetMetaData getMetadadoConsulta(ResultSet ResultConsulta) throws SQLException{
    	ResultSetMetaData rm = ResultConsulta.getMetaData();
    	return rm;    	
    }
    
    /**
     * Insere uma linha na tabela insidente 
     * @param incid
     */
   public void inserIncidente (Incidente incid){
	   
	   int numero = incid.getNumero();
	   int tipo = incid.getTipo().getId();
	   String data = incid.getData().toString();
	   String observacao =  incid.getDescricaoOcorrencia();
	   int num_rua = incid.getEndereco().getNumero();
	   String complemento = incid.getEndereco().getComplemento();
	   String logradouro =  incid.getEndereco().getLogradouro().toString();
	   String bairro = incid.getBairro().toString();
	   String regiao = incid.getRegiao().toString();
	   String cidade = incid.getCidade().getDescricao();
	   String uf = incid.getCidade().getUf();
	   
	   try {
           this.stm = this.conn.createStatement();
           
           this.stm.executeUpdate("INSERT INTO incidente VALUES (" + numero + "," + tipo + "," + "'" + data + "'"+ "," +
           "'"+ observacao + "'"+ "," + num_rua + "," + "'" + complemento + "'" + "," + "'" + logradouro + "'" + "," +
        	"'" + bairro + "'" + "," + "'" + regiao + "'"+ "," + "'" + cidade + "'" + "," + "'" + uf + "'" +")");
           
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
   
   /**
    * Atualiza um incidente
    * @param incid :  objeto com os novos dados do incidente.
    */
   public void modificarIncididente (Incidente incid){
	   int numero = incid.getNumero();
	   int tipo = incid.getTipo().getId();
	   String data = incid.getData().toString();
	   String observacao =  incid.getDescricaoOcorrencia();
	   int num_rua = incid.getEndereco().getNumero();
	   String complemento = incid.getEndereco().getComplemento();
	   String logradouro =  incid.getEndereco().getLogradouro().toString();
	   String bairro = incid.getBairro().toString();
	   String regiao = incid.getRegiao().toString();
	   String cidade = incid.getCidade().getDescricao();
	   String uf = incid.getCidade().getUf();
	   
	   try{
	   this.stm.executeUpdate("UPDATE incidente SET " + "tipo = " + tipo +
			   ", data = " + "'" + data + "'" + ", observacao = " + "'"+ observacao + "'" +
			   ", num_rua = " + "'" + num_rua + "'" + ", complemento = " + "'"+complemento+"'" + 
			   ",logradouro = " + "'"+logradouro+"'" +  ", bairro = " + "'"+ bairro +"'" +
			   ", regiao = " + "'"+ regiao +"'" +  ", cidade =" + "'"+ cidade + "'" + 
			   ",uf = " + "'"+ uf +"'" + "WHERE numero = " + numero);
	   }catch (SQLException e){
		   e.printStackTrace();
		   
	   }
   }
   
   /**
    * Busca um incidete atraves de seu ID.
    * @param numero :  Id do Incidente
    * @return : objeto do inicidente solicitado
    * @throws SQLException
    */
	public Incidente buscarIncidente (int numero) throws SQLException{
	   
	   Incidente aux = new Incidente();
	   TipoIncidente tinci = new TipoIncidente();
	   Endereco end = new Endereco();
	   Logradouro log = new Logradouro();
	   Bairro bar =  new Bairro();
	   Regiao reg = new Regiao();
	   Cidade cid = new Cidade();
	   
	   ResultSet rs = stm.executeQuery("SELECT * FROM incidente WHERE numero = " + numero);
	   
	   tinci.setDescricao(rs.getString("observacao"));
	   tinci.setId(numero);
	   aux.setTipo(tinci);
	   
	   end.setComplemento(rs.getString("complemento"));
	   end.setNumero(rs.getInt("num_rua"));
	   log.setDescricao(rs.getString("logradouro"));
	   end.setLogradouro(log);
	   aux.setEndereco(end);
	   
	   bar.setDescricao(rs.getString("bairro"));
	   aux.setBairro(bar);
	   
	   reg.setDescricao(rs.getString("regiao"));
	   aux.setRegiao(reg);
	   
	   cid.setDescricao(rs.getString("cidade"));
	   aux.setCidade(cid);
	   
	   aux.setNumero(numero);
	   
	   
	   //Date a = (Date) rs.getDate ("data");
	  /// String b = a.toString();
	  // @SuppressWarnings("deprecation")
	//Date c = new Date(b);
	   
	   
	 
	 //  aux.setData(c);
	  
	   return aux;  
   }
   
   /**
    * Imprime o resultado de uma busca.
    * @param resultado :  resutado de uma busca. Objeto SQL.
    * @throws SQLException
    */
   
   public void imprimirBusca(ResultSet resultado) throws SQLException{
	   
	   ResultSetMetaData metadado = resultado.getMetaData();
	   int numColunas = metadado.getColumnCount();
	   for (int i = 1; i < numColunas; i++){
		   System.out.print(metadado.getColumnLabel(i)+"      ");
		   
	   }
	   
	   System.out.println();
	   
	   while (resultado.next()){
		   for (int i = 1; i < numColunas; i++){
			   System.out.print(resultado.getString(i) + "      ");
		   }
		   System.out.println();
	   }	   
   }
    
   /**
    * Returnaa todas as viaturas disoniveis.
    * @return todas as viaturas disponiveis.
    */
   public ResultSet buscarViaturasDisponiveis(){
	   try {
		ResultSet rs = stm.executeQuery("SELECT * FROM viatura WHERE status = 1");
		 return rs;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;		  
   }
   
   /**
    * Retorna todas as viaturas.
    * @return
    */
   public ResultSet listarViaturas(){
	   
	try {
		ResultSet rs = stm.executeQuery("SELECT * FROM viatura");
		return rs;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	   
   }
   
   /**
    * Muda o estatus de uma viatura
    * @param idViatura : id da viatura
    * @param status :  status da viatura
    */
   public void mudarStatusViatura(int idViatura, int status){
	   try {
		this.stm.executeUpdate("UPDATE viatura SET status = " + status + " WHERE numero = " + idViatura);
	} catch (SQLException e) {
		e.printStackTrace();
	}
   }
   
}
