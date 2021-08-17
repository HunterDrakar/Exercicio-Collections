package ExercicioSet;

import java.util.Set;

public class HashSet {

    public static void main(String[] args) {

        Set<Integer> numeros = new java.util.HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        numeros.remove(3);

        numeros.add(23);

        System.out.println(numeros);

        int tamanhoset = numeros.size();

        System.out.println(tamanhoset);

        boolean estavazio = numeros.isEmpty();

        System.out.println(estavazio);


    }

}
