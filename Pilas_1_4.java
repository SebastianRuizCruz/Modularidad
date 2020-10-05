
import java.util.Scanner;

public class Pilas_1_4 {
    char Pilas_1_4[] = new char[26];
    int tope = 0;

    public void Mostrar() {
        if (tope <26){
            for(tope=0; tope<26;tope++){
                //Con la siguiente condicion nos dejara llenar de manera aleatoria la pila pero sin
                //que se repitan las letras del abecedario
                Pilas_1_4[tope]=(char)(Math.random() * 26 + 'A');
                for (int s=0; s <tope; s++){
                    if (Pilas_1_4[tope]== Pilas_1_4[s]){
                            
                        tope--;
                    }
                }
            } 
         }else{
        }
        System.out.println("Datos agregados correctamente");
    }
    
    public void Presentar() {
        //Aqui mostrara la pila con todos los datos correspondientes
        for (int i = tope - 1; i >= 0; i--) {
            System.out.print(" " + Pilas_1_4[i]);
        }
    }

    public void Suprimir() {
        //Aqui eliminara los datos de la pila tantas vecez quieras.
        tope--;
        System.out.println("dato eliminado...");
    }

    public void Ingresar(char z) {
        //Aqui podras agregar los datos que quieras pueden ser letras, numeros o simbolos.
        Pilas_1_4[tope] = z; //$ *
        tope++;
        System.out.println("dato agregado a la memoria de la pila de manera correcta..");
    }
    public void ordenar (){
        //Aqui realizara un ordenamiento de los datos que se encuentren en la pila
        int opc;
        System.out.println("La pila va a realizar un ordenamiento de los datos");
        for (int s = 0; s < 26; s++) {
            for (int a = 0; a <s; a++) {
            if (Pilas_1_4[s] < Pilas_1_4[a]) {
                opc = Pilas_1_4[s];
                Pilas_1_4[s] = Pilas_1_4[a];
                Pilas_1_4[a] = (char) opc;
            }
        }
        }
    }

    public static void main(String[] args) {
        Pilas_1_4 s = new Pilas_1_4();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            //Aqui se muestra el menu de las opciones que tienes disponibles
            System.out.println("\n!!ELIGE UNA DE LAS SIGUIENTES OPCIONES!!\n"
                    + "1-Mostrar que la pila se lleno correctamente\n"
                    + "2-Presentar como la pila se ha llenado correctamente\n"
                    + "3-Suprimir datos\n"
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
   
