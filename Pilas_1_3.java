import java.util.Scanner;

public class Pilas_1_3 {
   int pila = 0;
   int tope = 0;
   int dato = 0;

   int Pila[] = new int[99999];

    public void Llenar_A_B
        (int se) {
        //Aqui se van a llenar las pilas A_B
        if ((pila & tope) < se) {
            System.out.println("Las pilas se llenaron correctamente ");
            for (int m = 0; pila < se; m++) {
                Pila[pila] = (int) (100 * Math.random());
                pila++;
            }
            for (int m = 0; tope < se; m++) {
                //La pila tendra datos del 1 al 200
                tam1[tope] = (int) (Math.random() * 100 + 100);
                tope++;
            }
        } else {
            System.out.println("Se llenaron con el paso anterior");
        }
    }
    int tam1[] = new int[99999];
        
    public void Mostrar_A_B() {
        //Se va a mostrar los datos de las Pilas_A_B
        if ((pila & tope) > 0) {
            System.out.println("La pila A esta entre (1-100)");
            for (int i = pila - 1; i >= 0; i--) {
                System.out.print(Pila[i]+" ");
            }
            System.out.println("\n La pila B esta entre (100-200)");
            for (int i = tope - 1; i >= 0; i--) {
                System.out.print(tam1[i]+" ");
            }
        } else {
            System.out.print("Las pilas no se han llenado");
        }
    }
       int tam2[] = new int[99999]; 
    public void Vaciar_A_B(int se) {
        //Aqui se vaciaran los datos que se encuentren en las pilas
        if ((pila & tope) > 0) {
            System.out.println("Se vaciaron exitosamente las pilas");
           for (int z = 0; z < se; z++) {
               pila--;
           }
           for (int z = 0; z < se; z++) {
               tope--;
           }
        } else {
            System.out.println("No hay pilas para vaciar");
        }
    }

        
    public void Unir_A_B(int se) {
       //Se uniran los datos de las pilas
        for (int m = 0; m < se; m++) {
            dato--;
        }
        if ((pila & tope) > 0) {
            System.out.println("Las pilas se unieron exitosamente");
            for (int i = 0; dato < se; i++) {
                tam3[i] = (tam1[i] + tam2[i]);
                dato++;
            }
        } else {
            System.out.println("No existe ninguna pila");
        }
    }
    int tam3[] = new int[99999];
        
    public void Mostrar_C (){
        //Mostraremos la suma de la Pila_A_B en la Pila_C
        if (dato > 0) {
            System.out.print("Imprimir Pila_C\n");
            for (int m = dato - 1; m >= 0; m--) {
                System.out.print(tam3[m]+" ");
            }
            System.out.print("\n");
        } else {
            System.out.println("No existe ninguna Pila_C");
        }
    }

    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);
        Pilas_1_3 SM = new Pilas_1_3();
        System.out.println("Que tamaño deseas darle a a pila:\n");
        int se = Sebas.nextInt();
        
        int opc;
        //Aqui tienen todas las opciones que pueden seleccionar
        do {
            System.out.println("\nELIGE UNA DE LAS SIGUIENTES OPCIONES!!!\n"
                    + "1- Llenar Pila_A_B aleatoriamente\n"
                    + "2- Mostrar datos Pilas_A_B\n"
                    + "3- Vaciar las Pilas_A_B\n"
                    + "4- Unir los datos de pilas_A_B para mostrar pila_C\n"
                    + "5- Mostrar Pila_C\n"
                    + "5- Salir del programa\n");
            switch (opc = Sebas.nextInt()) {
                case 1:
                    SM.Llenar_A_B(se);
                    break;
                case 2:
                    SM.Mostrar_A_B();
                    break;
                case 3:
                    SM.Vaciar_A_B(se);
                    break;
                case 4:
                    SM.Unir_A_B(se);
                    break;
                case 5:
                    SM.Mostrar_C();
                    break;
            }
        } while (opc != 6);

    }
}

    