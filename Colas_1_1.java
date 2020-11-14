import java.util.Scanner;

/**
 * @author Ruiz Cruz Jaime Sebastian
 */
public class Colas_1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fin = 0, delante = 0, var, auxiliar, tamaño = 0;
        char cola[] = new char[26];
do {

            System.out.println("** Opciones **");
            System.out.println("**Selecciona alguna de las siguientes Opciones**");
            System.out.println("Opcion_1-Cola Forma Manual");
            System.out.println("Opcion_2-Cola de Abecedario");
            System.out.println("Opcion_3-Cola de Abecedario desordenado");
            System.out.println("Opcion_4-Union de colas A y B");
            System.out.println("Opcion_5-Cola con Abecedario desordenado sin repetir letras");
            

            switch (var = sc.nextInt()) {
 case 1:

                    System.out.println("¿Que tamaño quieres darle a la cola...");
                    char col_1[] = new char[tamaño = sc.nextInt()];

                    do {

                        System.out.println("**Cola Forma Manual**");
                        System.out.println("**Selecciona una opcion**\n"
                                + "Opcion_1-Encolar un valor\n"
                                + "Opcion_2-Mostrar los valores de la cola\n"
                                + "Opcion_3-Desencola\n");

                        switch (var = sc.nextInt()) {
            case 1:
                                if (fin < tamaño) {
                                    System.out.println("Dale un valor a la cola");
                                    col_1[fin] = sc.next().charAt(0);
                                    fin++;
                                } else {
                                    System.out.println("La cola ya esta llena");
                                }
                                break;
            case 2:
                                if (fin > 0) {
                                    System.out.println("La cola contiene esos valores:\n");
                                    for (int i = delante; i < tamaño; i++) {
                                        System.out.print(" " + col_1[i]);

                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola no contiene ningun valor");
                                }
                                break;
            case 3:
                                if (fin > 0) {
                                    System.out.println("Se ha quitado un valor\n");
                                    for (int i = delante; i < tamaño - 1; i++) {
                                        col_1[i] = col_1[i + 1];
                                    }
                                    fin--;
                                } else {
                                    System.out.println("La cola no contiene valores para eliminar");
                                }

                                break;
                        }
                    } while (var != 4);
                    break;
            case 2:
                    do {
                        System.out.println("**Cola del Abecedario**");
                        System.out.println("**Elije la opcion que quieras**\n"
                                +"Opcion_1-Llenar la cola con el abecedario\n"
                                + "Opcion_2-Mostrar los valores de la cola\n"
                                + "Opcion_3-Desencolar un valor\n"
                                + "Opcion_4-Encolar un valor\n");
                                 
                        switch (var = sc.nextInt()) {
                            case 1:
                                if (fin <= 26) {
                                    System.out.println("Se ha agregado valores con el abecedario\n");
                                    for (int i = delante; fin < 26; i++) {
                                        cola[fin] = (char) ('s' + i);
                                        fin++;
                                    }
                                }
                                break;
            case 2:
                                if (fin > 0) {
                                    System.out.println("La cola contiene los siguientes valores:\n");
                                    for (int i = delante; i < fin; i++) {
                                        System.out.print(" " + cola[i]);
                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola no contiene ningun valor");
                                }

                                break;
            case 3:
                                if (fin > 0) {
                                    System.out.println("Primer valor eliminado\n");
                                    for (int i = delante; i < fin - 1; i++) {
                                        cola[i] = cola[i + 1];
                                    }
                                    fin--;
                                } else {
                                    System.out.println("La cola no contiene valores");
                                }

                                break;
            case 4:
                                if (fin <= 26) {
                                    System.out.println("Encolar un valor");
                                    cola[fin] = sc.next().charAt(0);
                                    fin++;
                                } else {
                                    System.out.println("La cola se ha llenado");
                                }

                                break;
                        }
                    } while (var != 5);
                    break;                    
            case 3:
                    System.out.println("**Cola del Abecedario sin ningun orden**");
                    do {
                        System.out.println("**Elije alguna opcion una opcion**\n"
                                + "Opcion_1-Llenar la cola con el abecedario desordenado\n"
                                + "Opcion_2-Mostrar los valores de la cola\n"
                                + "Opcion_3-Desencolar un valor\n"
                                + "Opcion_4-Encolar un valor\n"
                                + "Opcion_5-Ordenar valores de la cola\n" );
                        switch (var = sc.nextInt()) {                    
             case 1:
                                if (fin <= 26) {
                                    System.out.println("\"Se han insertado valores con el abecedario desordenado\n");
                                    for (int s = delante; fin < 26; s++) {
                                        cola[fin] = (char) ('s' + Math.random() * 26);
                                        fin++;
                                    }
                                }
                                break;
             case 2:
                                if (fin> 0) {
                                    System.out.println("Los valores que contiene la cola son:\n");
                                    for (int i = delante; i < fin; i++) {
                                        System.out.print(" " + cola[i]);
                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola se encuentra vacia");
                                }

                                break;                   
             case 3:
                                if (fin > 0) {
                                    System.out.println("El primer valor se ha eliminado\n");
                                    for (int s = delante; s < fin - 1; s++) {
                                        cola[s] = cola[s + 1];
                                    }
                                    fin--;
                                } else {
                                    System.out.println("La cola esta vacia");
                                }

                                break;                   
              case 4:
                                if (fin <= 26) {
                                    System.out.println("Encolar algun valor");
                                    cola[fin] = sc.next().charAt(0);
                                    fin++;
                                } else {
                                    System.out.println("La cola se encuentra llena");
                                }

                                break;                  
              case 5:
                                System.out.println("La cola se ha ordenado alafabeticamente");
                                for (int s = 0; s < 26; s++) {
                                    for (int j = 0; j < s; j++) {
                                        if (cola[s] < cola[j]) {
                                            auxiliar = cola[s];
                                            cola[s] = cola[j];
                                            cola[j] = (char) auxiliar;
                                        }
                                    }
                                }

                                break; 
                                 }
                    } while (var != 6);
                    break; 
               case 4:
                    System.out.println("El tamaño de las colas sera de: ");
                    int fin_1 = 0;
                    tamaño = sc.nextInt();
                    int Col_s[] = new int[tamaño];
                    int Col_j[] = new int[tamaño];
                    int Col_z[] = new int[tamaño];
                    int S = 0,
                     S2 = 0;     
                      do {
                        System.out.println("**Juntar colas A y B**");

                        System.out.println("**Selecciona alguna opcion**\n"
                                +"Opcion_1-LLenar colas A y B\n"
                                + "Opcion_2-Unir colas A y B\n"
                                + "Opcion_3-Mostrar valores de las colas A y B\n"
                                + "Opcion_4-Desencolarccolas\n"
                                + "Opcion_5-Mostrar  valores de la Cola C\n");
                                
                        switch (var = sc.nextInt()) {
              case 1:
                                if ((fin & S) < tamaño) {

                                    System.out.println("Se llenaron las colas A y B\n");
                                    for (int s = delante; fin_1 < tamaño; s++) {
                                        Col_s[fin] = (int) (Math.random() * 100);
                                        fin_1++;
                                    }
                                    for (int s = delante; S < tamaño; s++) {
                                        Col_j[S] = (int) (100 + Math.random() * 100);
                                        S++;
                                    }
                                }
                                System.out.println("\n");
                                break;      
         case 2:
                                if ((fin & S) > 0) {
                                    System.out.println("Las colas A y B se han unido");
                                    for (int i = 0; S2 < tamaño; i++) {
                                        Col_z[i] = (Col_s[i] + Col_j[i]);
                                        S2++;
                                    }
                                } else {
                                    System.out.println("No se encuentras colas para unir");
                                }
                                break;     
                                
         case 3:
                                if ((fin & S) > 0) {
                                    System.out.println("Valores de la cola A:\n");
                                    for (int i = delante; i < fin; i++) {
                                        System.out.print(" " + Col_s[i]);
                                    }
                                    System.out.println("\nValores de la Cola B: \n");
                                    for (int i = delante; i < S; i++) {
                                        System.out.print(" " + Col_j[i]);
                                    }
                                } else {
                                    System.out.println("Las colas ahora estan vacias");
                                }
                                System.out.println("\n");
                                break;                       
                                
         case 4:
                                System.out.println("Las colas se han vaciado de manera correcta");
                                fin = 0;
                                S = 0;
                                S2 = 0;
                                break;  
          case 5:
                                if (S2 > 0) {
                                    System.out.print("Valores cola C:\n");
                                    for (int i = delante; i < S2; i++) {
                                        System.out.print(" " + Col_z[i]);
                                    }
                                    System.out.print("\n");
                                } else {
                                    System.out.println("No hay ninguna Cola C");
                                }
                                System.out.print("\n");

                                break;
                        }
                    } while (var != 6);
                    break;                       
          case 5:
                    do {
                        System.out.println("**Cola del Abecedario desordenado sin repetir******");
                        System.out.println("**Selecciona una opcion**\n"
                                + "Opcion_1-Llenar Cola con datos del Abecedario sin orden y sin repetir\n"
                                + "Opcion_2-Muestra valores de la cola\n"
                                + "Opcion_3-Desencolar un valor\n"
                                + "Opcion_4-Encolar un valor\n"
                                + "Opcion_5-Ordena valores de la cola de manera Alfabetica\n");
                                
                        switch (var = sc.nextInt()) {                      
        case 1:
                                if (fin < 26) {
                                    System.out.println("Se ha llenado la cola exitosamente");
                                    cola[fin] = (char) (Math.random() * 26 + 'a');
                                    for (fin = 0; fin < 26; fin++) {
                                        cola[fin] = (char) (Math.random() * 26 + 'a');
                                        for (int s = delante; s < fin; s++) {
                                            if (cola[fin] == cola[s]) {
                                                fin--;        
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("La cola ya esta llena");
                                }

                                break;                        
         case 2:
                                if (fin > 0) {
                                    System.out.println("Los valores sigueintes de la cola son:\n");
                                    for (int i = delante; i < fin; i++) {
                                        System.out.print(" " + cola[i]);
                                    }
                                    System.out.println("\n");
                                } else {
                                    System.out.println("La cola ahora esta vacia");
                                }

                                break;
         case 3:
                                if (fin > 0) {
                                    System.out.println("Se ha desencolado el valor principal de la cola\n");
                                    for (int i = delante; i < fin - 1; i++) {
                                        cola[i] = cola[i + 1];
                                    }
                                    fin--;
                                } else {
                                    System.out.println("La cola ahora esta vacia");
                                }

                                break;                       
          case 4:
                                if (fin <= 26) {
                                    System.out.println("Encolar algun valor deseado");
                                    cola[fin] = sc.next().charAt(0);
                                    fin++;
                                } else {
                                    System.out.println("La cola ahora esta llena ");
                                }
                                break; 
         case 5:
                                System.out.println("La cola se ha ordenado alfabeticamente");
                                for (int i = delante; i < fin; i++) {
                                    for (int s = delante; s < i; s++) {
                                        if (cola[i] < cola[s]) {
                                            auxiliar = cola[i];
                                            cola[i] = cola[s];
                                            cola[s] = (char) auxiliar;
                                        }
                                    }
                                }
                                 break;
                        }
                    } while (var != 6);
                    break;
            }

        } while (var != 6);
            }
}

