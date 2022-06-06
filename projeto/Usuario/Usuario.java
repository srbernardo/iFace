package Usuario;

import java.util.ArrayList;

import Heranca.Nome.Nome;

public class Usuario extends Nome{
    private String sobrenome = null;
    private String login = null;
    private int senha = 0;
    private int idade = 0;
    private int amigos = 0;
    public ArrayList<String> pedidos = new ArrayList<String>();
    public ArrayList<String> mensagens = new ArrayList<String>();

    
    public String getSobreNome() {
        return this.sobrenome;
    }
    public String getLogin() {
        return this.login;
    }
    public int getSenha() {
        return this.senha;
    }
    public int getIdade() {
        return this.idade;
    }
    public int getAmigos() {
        return this.amigos;
    }
    
    public void setSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAmigos(int quantidade) {
        this.amigos += quantidade;
    }
}