/**
 *
 * @author Ruiz Cruz Jaime Sebastian.
 */

import java.util.Scanner;

public class Nodos1_2 {
    Scanner in= new Scanner (System.in);    
public class Nodo {
    
    public String dato;
    public Nodo siguiente;
    public Nodo(String valor){
        this.dato=valor;
    }
    public Nodo(String valor,Nodo a){
        dato=valor;
        siguiente=a;
    }
}

    protected Nodo primero,ultimo;
    public Nodos1_2(){
        primero = null;
        ultimo= null;
    }
public void Agregar(String elemento){
   
    elemento=in.nextLine();
    primero=new Nodo(elemento, primero);
        if(ultimo==null){
            ultimo=primero;
        }
    }
    public void Mostrar(){
        Nodo rec=primero;
        while(rec!=null){
            System.out.println(rec.dato+"");
            rec=rec.siguiente;
        }
        
    }
    public String Eliminar_El_Primero(){
        String valor=primero.dato;
        if(primero==ultimo){
            primero=null;
            ultimo=null;
        }else{
           primero=primero.siguiente;
        }
        return valor;
    }
    public String Eliminar_El_Ultimo(){
        String valor=ultimo.dato;
        if (primero==ultimo) {
            primero=null;
            ultimo=null;
        }else{
            Nodo temp=primero;
            while(temp.siguiente!=ultimo){
                temp=temp.siguiente;
            }
            ultimo=temp;
            ultimo.siguiente=null;
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Nodos1_2 n= new Nodos1_2();
        int elegir;
        String e = null;
       do{           
               System.out.println("Selecione algunas de las opcines que se muestran a continuacion\n"
                                + "1. Agregar el dato que quiera \n"
                                + "2. Mostrar los datos que estan en el Nodo\n"
                                + "3. Eliminar el primer valor que se agrego al Nodo\n"
                                + "4. Elimiar el ultimo valor que se agrego en el Nodo\n"
                                + "5. Salir del Programa");
               switch (elegir=in.nextInt()){
                   case 1:
                           System.out.println("\n dato ingresar\n");
                           n.Agregar(e);
                       break;
                       case 2:
                           System.out.println("\n datos\n");
                           n.Mostrar();
                           
                       break;
                       case 3:
                           System.out.println("\n elimino ultimo\n");
                           n.Eliminar_El_Primero();
                           
                       break;
                               
                       case 4:
                           System.out.println("\n elimino primero\n");
                          n.Eliminar_El_Ultimo();
                           
                           break;
                        
               }
           
       }while(elegir!=5);
    }
}


