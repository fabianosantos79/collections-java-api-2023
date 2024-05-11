package main.java.list.OperacoesBasicas;

public class Item2 {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    //Constructor
    public Item2(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                ", preco= " + preco +
                ", quantidade= " + quantidade;
    }
}
