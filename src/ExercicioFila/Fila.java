package ExercicioFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        System.out.println(fila);

        String primeiroFila = fila.peek();

        System.out.println(primeiroFila);

        String saidafila = fila.poll();

        System.out.println(saidafila);

        fila.add("Daniel");

        System.out.println(fila);

        int tamanhofila = fila.size();

        System.out.println(tamanhofila);

        boolean estavazio = fila.isEmpty();

        System.out.println(estavazio);

        boolean temcarlos = fila.contains("Carlos");

        System.out.println(temcarlos);









        for (String client: fila){
            System.out.println(client);
        }

        Iterator<String> iteratorFila = fila.iterator();

        while (iteratorFila.hasNext()){
            System.out.println(iteratorFila.next());
        }

    }
}
