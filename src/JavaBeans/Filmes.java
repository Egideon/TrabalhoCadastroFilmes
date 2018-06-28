/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBeans;

import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *Classe criada para...
 * @author Egideon
 *@since  Criada no dia 23/06/2018   
 */
public class Filmes {
    //Atributos
    private String assiste;
    private int codfilme;
    private String nome;
    public int getCodfilme;
    
    public Filmes filmes;
    //Getter and Setter
    public Filmes getFilmes() {
        return filmes;
    }

    public void setFilmes(Filmes filmes) {
        this.filmes = filmes;
    }
    
    public void adicionarFilmes(Filmes filmes){

        this.filmes = filmes;
    }
    
    public void getRelatorio(List<Filmes> lista) {
            JasperPrint print = null;
            JRDataSource dataSource = new JRBeanCollectionDataSource(lista);
                try {
                    print = JasperFillManager.fillReport("C:\\Users\\va_re\\JaspersoftWorkspace\\MyReports\\RelatórioCadastro.jasper", null, dataSource);
                    JasperPrintManager.printReport(print, true);
                } catch (Exception erro) {
                    System.out.println("Erro" + erro);
                }

            }
    
    
    //Getter and Setter

    public String getAssiste() {
        return assiste;
    }

    public void setAssiste(String assiste) {
        this.assiste = assiste;
    }

    public int getCodfilme() {
        return codfilme;
    }

    public void setCodfilme(int codfilme) {
        this.codfilme = codfilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGetCodfilme() {
        return getCodfilme;
    }

    public void setGetCodfilme(int getCodfilme) {
        this.getCodfilme = getCodfilme;
    }
   



}//Fim da classe
