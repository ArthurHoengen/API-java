package br.org.arthurhoengen.api.entitys;

import java.util.LinkedList;
import java.util.List;

import br.org.arthurhoengen.api.receita.Categoria;

public class Receita{
    private String nome;
    private double precoEstimado;
    private Categoria categoria;
    private String descricao;

    private List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoEstimado() {
        return precoEstimado;
    }

    public void setPrecoEstimado() {
        this.precoEstimado = 0.0;
        for(int i = 0; i < this.ingredientes.size() -1; i++){
            Ingrediente ingrediente = ingredientes.get(i);
            this.precoEstimado += ingrediente.getPreco();
        };
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void addIngrediente(Ingrediente ingrediente){
        if(!ingredientes.contains(ingrediente)){
            ingredientes.add(ingrediente);
        }
    }

    public Ingrediente removeIngrediente(Ingrediente ingrediente){
        if(ingredientes.contains(ingrediente)){
            ingredientes.remove(ingrediente);
            return ingrediente;
        }
        return null;
    }

}
