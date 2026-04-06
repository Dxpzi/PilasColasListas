import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    Validaciones v = new Validaciones();

    public Stack<ObjDato> LLenarPila(Stack<ObjDato> p, Scanner sc) {

        boolean Preguntar = true;

        while (Preguntar) {

            ObjDato o = new ObjDato();          
            System.out.println("Digite el numero");

            int numero = v.ValidarEntero(sc);

            // Guardar el número en el objeto.
            o.setNumero(numero);
            //Lo ingresamos en la pila
            p.push(o);

            System.out.println("Desea continuar 1) Sí, 2) No");
            int opt = sc.nextInt();

            if (opt == 2) {
                Preguntar = false;
            }
        }
        return p;
    }
    // Llena una cola (Queue).
    public Queue<ObjDato> LLenarCola(Queue<ObjDato> c, Scanner sc) {

        boolean Preguntar = true;

        while (Preguntar) {

            ObjDato o = new ObjDato();
            System.out.println("Digite el número");

            int numero = v.ValidarEntero(sc);

            o.setNumero(numero);
            //En vez de push, usa offer
            c.offer(o);
            System.out.println("Desea continuar 1) Sí , 2) No");
            int opt = sc.nextInt();

            if (opt == 2) {
                Preguntar = false;
            }
        }
        return c;
    }

    public LinkedList<ObjDato> LLenarLista(LinkedList<ObjDato> l, Scanner sc) {

        boolean Preguntar = true;

        while (Preguntar) {

            ObjDato o = new ObjDato();
            System.out.println("Digite el número");

            int numero = v.ValidarEntero(sc);

            o.setNumero(numero);
            // Ingresa el objeto o dentro de la variable l
            l.add(o);

            System.out.println("Desea continuar 1) Sí , 2) No");    
            int opt = sc.nextInt();

            if (opt == 2) {
                Preguntar = false;
            }
        }
        return l;
    }
    // Una pila que contiene objetos ObjDato.
    public void MostrarPila(Stack<ObjDato> p) {
        // Recorre la estructura, va elemento por elemento.
        for (ObjDato o : p) {
            // Muestra el número guardado.
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }

    public void MostrarCola(Queue<ObjDato> c) {

        for (ObjDato o : c) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }

    public void MostrarLista(LinkedList<ObjDato> l) {
        
        for (ObjDato o : l) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }

}
