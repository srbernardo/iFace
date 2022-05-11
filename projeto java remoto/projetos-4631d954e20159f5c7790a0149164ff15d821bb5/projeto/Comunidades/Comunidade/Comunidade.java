package Comunidades.Comunidade;

public class Comunidade {
    private String nome = null;
    private String descricao = null;
    private String dono = null;    
    public String[] membros = new String[1000];

    public String getNome() {
        return this.nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public String getDono() {
        return this.dono;
    }   

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
}