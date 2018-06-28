/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.util.List;
import JDBC.ConnectionFactory;
import JavaBeans.Filmes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *Classe criada para gerar objetos para acessar o banco de dados
 * @author Egideon
 *@since  Criada no dia 23/06/2018   
 */
public class FilmesDAO {
   
    private final Connection conecta;

//Construtor
  public FilmesDAO(){
      this.conecta = new ConnectionFactory().conecta();
      
  } 
  
  //Método de cadastro de Filme
  public void cadastrarFilme(Filmes obj ){
      try {
         //Passo 1 - criar comando SQL
         String cmdsql = "insert into clientes(nome, assiste) values (?,?)";
         
         //Passo 2 - organizar o cmdsql e executar
         PreparedStatement stmt = conecta.prepareStatement(cmdsql);
         stmt.setString(1, obj.getNome());
         stmt.setString(2, obj.getAssiste());
         //Passo 3 - executar o comando
         stmt.execute();
         
         //Passo 4 - fechar conexão
         stmt.close();
         
      } catch (SQLException erro) {
           throw new  RuntimeException(erro);
      }
  }
  
    //Listar os Filmes

    /**
     *
     * @return
     * @throws java.sql.SQLException
     */
      

    

    
public List<Filmes> ListarFilmes() {

        try{

            List<Filmes> lista = new ArrayList<Filmes>();

            String cmdSql = "Select * from Clientes";

            PreparedStatement stmt = conecta.prepareStatement(cmdSql);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

              Filmes c = new Filmes();
                c.setNome(rs.getString("Nome"));
                c.setAssiste(rs.getString("Assiste"));
               
                

                lista.add(c);

            }

        return lista;

        }catch (SQLException erro){
            throw new RuntimeException(erro);
        }

}

}
  
        
       //Método para excluir 
          
    

//Fim da classe
