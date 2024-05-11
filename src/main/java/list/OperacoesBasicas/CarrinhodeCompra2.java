package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompra2 {
    public List<Item2> listaItens;
    public double valorTotal = 0;

    public CarrinhodeCompra2() {
        this.listaItens = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "{" +
                "Nome = " + listaItens +
                ", Valor = " + valorTotal +
                '}';
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade){
        listaItens.add(new Item2(nome, preco, quantidade));
    }


    public void removerItem(String nome) {
        List<Item2> itemRemover = new ArrayList<>();
        for(Item2 i : listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
        }
        listaItens.removeAll(itemRemover);
    }


    public void calcularValorTotal(){

        for(Item2 item : listaItens){
            valorTotal = valorTotal + item.getPreco();
        }
        System.out.println("Valor total R$: "+ valorTotal);
    }


    public void exibirItens(){
        System.out.println(listaItens);
    }

    public int quantidadeItens(){
        return listaItens.size();
    }

    public static void main(String[] args) {
        CarrinhodeCompra2 carrinho = new CarrinhodeCompra2();
        System.out.println(carrinho);
        carrinho.adicionarItem("Lavar a louça", 14.50, 1);
        System.out.println(carrinho);
        carrinho.adicionarItem("Lavar a roupa", 22.30, 3);
        carrinho.adicionarItem("Jogar bola", 47.92, 2);
        carrinho.adicionarItem("Lavar a louça", 08.50, 1);
        carrinho.calcularValorTotal();
        System.out.println("Quantidade de itens: " + carrinho.quantidadeItens());
        System.out.println(carrinho);
        carrinho.removerItem("Lavar a louça");
        carrinho.calcularValorTotal();
        System.out.println(carrinho);
        System.out.println("Quantidade de itens: " + carrinho.quantidadeItens());
    }



}
