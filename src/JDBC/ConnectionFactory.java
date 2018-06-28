/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBC;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Classe criada para conectar com banco de dados
 * @author Egideon
 *@since  Criada no dia 23/06/2018   
 */
/*public class ConnectionFactory {
  public static void main(String[] args) throws SQLException {
      try (Connection connection = new ConnectionFactory().getConnection()) {
          System.out.println("Conexão aberta!");
      }
     }

    

    public  class ConnectionFactory {

        public  Connection getConnection() {
         try {
            return DriverManager.getConnection("jdbc:mysql://localhost/filmes","root","");
         }
         catch(SQLException excecao) {
            throw new RuntimeException(excecao);
                 }
        }

    }

}//Fim da classe
*/

public class ConnectionFactory {

    public  static Connection conecta() {
        try {

            return DriverManager.getConnection("jdbc:mysql://localhost/Filmes", "root", "");

        } catch (SQLException erro) {

            throw new RuntimeException(erro);
        }
    }

}