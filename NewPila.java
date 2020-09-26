
import java.util.Scanner;

public class NewPila {
    char NewPila[] = new char[26];
    int tope = 0;

    public void Mostrar() {
        //Aqui llenara la pila con el abecedario acomodado de forma aleatoria.
        char letra = 'A'; 
        for (int s = 0; s < 26; s++) {
            if (tope < 26) {
                //La sentencia random hara que nuestro abecedario se presente de forma aleatoria en nuestra pila.
                NewPila[tope] = (char) (letra + Math.random() * 26);
                tope++;
            } else {
                System.out.println("La pila ahora esta llena");
                break;
            }
        }
        System.out.println("Datos agregados correctamente");
    }

    public void Presentar() {
        //Aqui mostrara la pila con todos los datos correspondientes
        for (int i = tope - 1; i >= 0; i--) {
            System.out.print(" " + NewPila[i]);
        }
    }

    public void Suprimir() {
        //Aqui eliminara los datos de la pila tantas vecez quieras.
        tope--;
        System.out.println("dato eliminado...");
    }

    public void Ingresar(char z) {
        //Aqui podras agregar los datos que quieras pueden ser letras, numeros o simbolos.
        NewPila[tope] = z; //$ *
        tope++;
        System.out.println("dato agregado a la memoria de la pila de manera correcta..");
    }
    public void ordenar (){
        //Aqui realizara un ordenamiento de los datos que se encuentren en la pila
        int opc;
        System.out.println("La pila va a realizar un ordenamiento de los datos");
        for (int s = 0; s < 26; s++) {
            for (int a = 0; a <s; a++) {
            if (NewPila[s] < NewPila[a]) {
                opc = NewPila[s];
                NewPila[s] = NewPila[a];
                NewPila[a] = (char) opc;
            }
        }
        }
    }

    public static void main(String[] args) {
        NewPila s = new NewPila();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            //Aqui se muestra el menu de las opciones que tienes disponibles
            System.out.println("\n!!ELIGE UNA DE LAS SIGUIENTES OPCIONES!!\n"
                    + "1-Mostrar que la pila se lleno correctamente\n"
                    + "2-Presentar como la pila se ha llenado correctamente\n"
                    + "3-Suprimir datos\n"1
                    + "4-Ingresar un nuevo dato\n"
                    + "5-Ordenar de manera correcta los datos\n"
                    + "6-Salir del programa\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    s.Mostrar();
                    break;
                case 2:
                    s.Presentar();
                    break;
                case 3:
                    s.Suprimir();
                break;
                case 4:
                    System.out.println("ingresa el dato que quieras");
                    char z=sc.next().charAt(0);
                    s.Ingresar(z);
                break;
                case 5:
                    System.out.println("Los datos estan ordenados correctamente");
                    s.ordenar();
                    break;
            }
        } while (opt != 6);
    }
}
    
