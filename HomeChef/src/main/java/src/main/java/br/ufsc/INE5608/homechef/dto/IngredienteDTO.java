package src.main.java.br.ufsc.INE5608.homechef.dto;

public class IngredienteDTO {

    protected String idIngrediente;
    protected String nome;
    protected String preco;
    protected String unidade;
    protected String unidadePreco;
    protected String quantidadePreco;

    public String getIdIngrediente() {
        return idIngrediente;
    }

    public IngredienteDTO setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public IngredienteDTO setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getPreco() {
        return preco;
    }

    public IngredienteDTO setPreco(String preco) {
        this.preco = preco;
        return this;
    }

    public String getUnidade() {
        return unidade;
    }

    public IngredienteDTO setUnidade(String unidade) {
        this.unidade = unidade;
        return this;
    }

    public String getUnidadePreco() {
        return unidadePreco;
    }

    public IngredienteDTO setUnidadePreco(String unidadePreco) {
        this.unidadePreco = unidadePreco;
        return this;
    }

    public String getQuantidadePreco() {
        return quantidadePreco;
    }

    public IngredienteDTO setQuantidadePreco(String quantidadePreco) {
        this.quantidadePreco = quantidadePreco;
        return this;
    }
}
