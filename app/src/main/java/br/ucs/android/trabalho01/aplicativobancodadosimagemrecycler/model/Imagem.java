package br.ucs.android.trabalho01.aplicativobancodadosimagemrecycler.model;

public class Imagem {

    private int id;
    private String nome;
    private String descricao;
    private String caminho;

    public Imagem() { }

    public Imagem(String nome, String descricao, String caminho) {
        this.nome = nome;
        this.descricao = descricao;
        this.caminho = caminho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

}


