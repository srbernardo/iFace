package Usuario;

public class Usuario {
    private String nome = null;
    private String sobrenome = null;
    private String login = null;
    private int senha = 0;
    private int idade = 0;
    public int amigos = 0;
    public String[] pedidos = new String[1000];
    public String[] menssagens = new String[1000];

    public String getNome() {
        return this.nome;
    }
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

    public void setNome(String nome) {
        this.nome = nome;
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
}