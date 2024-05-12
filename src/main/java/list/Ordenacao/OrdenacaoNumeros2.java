package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros2 {
    List<Integer> listNumber;

    public OrdenacaoNumeros2() {
        this.listNumber = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumber.add(numero);
    }

    @Override
    public String toString() {
        return "Lista " + listNumber;
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listOrdened = new ArrayList<>(listNumber);
        Collections.sort(listOrdened);
        return listOrdened;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listOrdenedDesc = new ArrayList<>(this.listNumber);
        listOrdenedDesc.sort(Collections.reverseOrder());
        return listOrdenedDesc;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros2 ordenaNumber = new OrdenacaoNumeros2();
        System.out.println(ordenaNumber);
        ordenaNumber.adicionarNumero(27);
        ordenaNumber.adicionarNumero(11);
        ordenaNumber.adicionarNumero(5);
        ordenaNumber.adicionarNumero(874);
        ordenaNumber.adicionarNumero(61);
        System.out.println(ordenaNumber);
        System.out.println(ordenaNumber.ordenarAscendente());
        System.out.println(ordenaNumber.ordenarDescendente());
    }
}
