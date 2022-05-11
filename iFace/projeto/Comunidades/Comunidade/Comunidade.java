package Comunidades.Comunidade;

import java.util.ArrayList;

import Heranca.Nome.Nome;

public class Comunidade extends Nome{
    private String descricao = null;
    private String dono = null;    
    public ArrayList<String> membros = new ArrayList<String>();


    public String getDescricao() {
        return this.descricao;
    }
    public String getDono() {
        return this.dono;
    }   

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
}