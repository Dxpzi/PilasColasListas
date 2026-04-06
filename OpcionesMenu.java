import java.util.Scanner;

public class OpcionesMenu {

    public int Menu(Scanner sc, String cadena) {

        Validaciones m = new Validaciones();

        int opt = 0;

        System.out.println("Bienvenido a la segunda unidad de nacho lee");
        System.out.println("donde mi mamá me mima es más díficil");
        System.out.println("¿Qué desea realizar?");
        System.out.println("1) Llenar " + cadena);
        System.out.println("2) Mostrar " + cadena);
        System.out.println("3) Modificar " + cadena);
        System.out.println("4) Eliminar" + cadena);
        System.out.println("5) Salir");

        opt = m.ValidarEntero(sc);
        
        return opt;
    }
}
    

