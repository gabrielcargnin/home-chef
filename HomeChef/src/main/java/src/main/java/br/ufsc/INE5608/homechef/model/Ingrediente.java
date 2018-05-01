package src.main.java.br.ufsc.INE5608.homechef.model;

public class Ingrediente {

    protected Integer idIngrediente;
    protected String nome;
    protected Double preco;
    protected Unidade unidade;

    public Integer getIdIngrediente() {
        return idIngrediente;
    }

    public Ingrediente setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Ingrediente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Double getPreco() {
        return preco;
    }

    public Ingrediente setPreco(Double preco) {
        this.preco = preco;
        return this;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public Ingrediente setUnidade(Unidade unidade) {
        this.unidade = unidade;
        return this;
    }

}
