package Exercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        System.out.println(nomes);

        nomes.set(2, "Roberto");

        String nome = nomes.get(0);

        System.out.println(nome);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Joao");

        int tamanho = nomes.size();

        System.out.println(tamanho);

        Boolean temJulian = nomes.contains("Juliana");

        System.out.println(temJulian);

        List<String> listadois = new ArrayList<>();

        listadois.add("Ismael");
        listadois.add("Rodrigo");

        ArrayList concatenaçãolista = new ArrayList(nomes.size() + listadois.size());

        concatenaçãolista.addAll(nomes);
        concatenaçãolista.addAll(listadois);

        System.out.println(concatenaçãolista);

        Collections.sort(nomes);

        System.out.println(nomes);

        boolean estaVazia = nomes.isEmpty();

        System.out.println(estaVazia);


    }
}
