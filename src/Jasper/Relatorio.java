/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jasper;

/**
 *Classe criada para conectar com o Jasper
 * @author Egideon
 *@since  Criada no dia 27/06/2018   
 */
public class Relatorio {
    public int Codfilme;
    public String Nome;
    public String Assiste;

    public int getCodfilme() {
        return Codfilme;
    }

    public void setCodfilme(int Codfilme) {
        this.Codfilme = Codfilme;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getAssiste() {
        return Assiste;
    }

    public void setAssiste(String Assiste) {
        this.Assiste = Assiste;
    }
    
    

}//Fim da classe
