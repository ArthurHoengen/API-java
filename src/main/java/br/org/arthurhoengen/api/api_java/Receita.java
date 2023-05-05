package br.org.arthurhoengen.api.api_java;

public class Receita{
    private String nome;
    private String ingredientes;
    private float precoEstimado;
    private String categorias;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public float getPrecoEstimado() {
        return precoEstimado;
    }

    public void setPrecoEstimado(float precoEstimado) {
        this.precoEstimado = precoEstimado;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
