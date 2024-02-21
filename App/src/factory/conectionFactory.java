
package factory;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author momed003
 */
public class conectionFactory {
    private static final String USERDB="root";
    private static final String PASSWORD="";
    private static final String URL_PATH="jdbc:mysql://localhost:3306/dbContactos"; 
   
    //criando a conexao
  public static Connection connection() throws Exception{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection com=DriverManager.getConnection(URL_PATH,USERDB,PASSWORD);
      return com;
  }
    public static void main(String[] args) throws Exception {
        //chamamos o metodo que e utilizado para criar a connexao
        Connection com=connection();
        
        if(com!=null){
            System.out.println("200-connexao efectuada com sucesso");
            com.close();
        }
    }
}
