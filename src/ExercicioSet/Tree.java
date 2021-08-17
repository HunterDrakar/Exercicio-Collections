package ExercicioSet;

import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        numeros.remove(3);

        numeros.add(23);

        System.out.println(numeros);

        int tamanhofila = numeros.size();

        System.out.println(tamanhofila);

        boolean estavazia = numeros.isEmpty();

        System.out.println(estavazia);



    }

}
