import java.util.Scanner;
/**
 * 
 * @author Jaime Sebastian.
 */
public class Nodo {
    Scanner teclado = new Scanner (System.in);
    private String dato;
    private Object sig;
  
    
    static class Nodo_dos {
        String dato;
        Nodo sig;
    }
 Nodo fin = null;
 Nodo inicio = null;
    
public void Agregar () {
         Nodo temp;
         String msg;
         System.out.println("Agrega cualquier dato que gustes");
         if (fin == null) {
             fin = new Nodo();
             fin.dato = teclado.nextLine();
             fin.sig = null;
         } else {
             temp = new Nodo();
             temp.dato = teclado.nextLine();
             temp.sig = fin;
             fin = temp;
         }
     }

public void Mostrar () {
    Nodo actual = fin;
    actual = fin;
    if (fin != null) {
    while (actual != null) {
        System.out.print(" Dato " + "[" + actual.dato + "]");
        actual = (Nodo) actual.sig;
    }
    } else {
     System.out.println("\n El nodo no cuenta con ningun valor \n");
        }
}

public void EliminarUlt (){
    if(fin != null) {
       System.out.println ("El ultimo dato fue eliminado");
       fin = (Nodo) fin.sig;
    } else {
            System.out.println ("No existe ningun dato para eliminarlo");
         }
}
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int opt = 0;
    String dato;
    Nodo n = new Nodo();
    do {
        System.out.println("\n Menu elige alguna de las opciones \n"
                + " 1- Agregale un dato \n"
                + " 2- Muestra los datos que se agregaron \n"
                + " 3- Elimina el dato \n"
                + " 4- Salida \n");
        switch (opt = sc.nextInt()) {
            case 1:
            n.Agregar();
            break;
            
            case 2:
            n.Mostrar();
            break;
            
            case 3:
            n.EliminarUlt();
        } 
    } while (opt !=4);
    }
}

