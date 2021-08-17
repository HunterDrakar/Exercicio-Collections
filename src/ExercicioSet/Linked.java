package ExercicioSet;

import java.util.LinkedHashSet;

public class Linked {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        numeros.remove(3);

        numeros.add(23);

        System.out.println(numeros);

        int tamanhonumeros = numeros.size();

        System.out.println(tamanhonumeros);

        boolean estavazio = numeros.isEmpty();

        System.out.println(estavazio);


    }

}
