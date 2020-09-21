import java.util.Scanner;

public class Pilas {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       int tope=0,opt,var=0;
       char alf[]=new char[26];
       do{System.out.println("\n1- Llenar\n"
            + "2- Mostrar\n"
            + "3- Eliminar\n"
            + "4- Agregar\n"
            + "5- Salir\n");
       switch(opt=sc.nextInt()){
           
           case 1:
               //Se llenan los espacios con el alfabeto
               if(tope<=26){
               System.out.println("La pila se ha llenado\n");
               for (int i = 0; tope < 26 ; i++) {
               alf[tope]=(char)('a'+i);
               tope++;
               }
               }
                  //System.out.print("  "+alf[i]); 
               break;
           case 2:
               //Muestra los elementos de la pila desde la cima de tope.
               System.out.println("Los elementos de la pila son:\n");
               for (int i = tope-1 ; i >= 0; i--) {
                   System.out.print("  "+alf[i]);
               }
               break;
           case 3:
               //Elimina el ultimo dato
               if(tope>0)//Condicion de si esta vacia esta no elimina nada
               {
               System.out.println("Se elimino el ultimo dato...\n");
               tope--;
               }else{
                   System.out.println("La pila esta vacia");
               }
                  
               break;
           case 4:
               if(tope<26)//Condicion que no permite desbordamiento de memoria
               {
                   //Sobrescribe un dato manual en la posicion tope
               System.out.println("Agrega dato:\n");
               alf[tope]=sc.next().charAt(0);
               tope++;
               }else{
                   System.out.println("La pila esta llena");
               }
               break;
          
       }
           
       }while(opt !=5);//Termina el bucle do-while
    }
    
}


   
