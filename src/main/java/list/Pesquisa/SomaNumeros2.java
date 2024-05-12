package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros2 {
    List<Integer> listaDeNumeros;
    public int valorSoma;

    public SomaNumeros2() {
        this.listaDeNumeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Lista de Números=" + listaDeNumeros;
    }

    public void adicionarNumero(int numero){
        listaDeNumeros.add(numero);
    }

    public int calcularSoma(){
        for (int valor: listaDeNumeros){
            valorSoma = valorSoma + valor;
        }
        return valorSoma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for (int numero : listaDeNumeros){
            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        if(!listaDeNumeros.isEmpty()){
            int menorNumero = Integer.MAX_VALUE;
            for(int numero : listaDeNumeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirNumeros(){
        System.out.println(listaDeNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros2 manipularNumeros = new SomaNumeros2();
        manipularNumeros.adicionarNumero(15);
        manipularNumeros.adicionarNumero(8);
        manipularNumeros.adicionarNumero(73);
        manipularNumeros.adicionarNumero(22);
        manipularNumeros.exibirNumeros();
        System.out.println("O valor total da soma dos valores é: " + manipularNumeros.calcularSoma());
        System.out.println("O maior número é: " + manipularNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + manipularNumeros.encontrarMenorNumero());
    }


}



