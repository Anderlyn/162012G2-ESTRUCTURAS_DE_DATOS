
package proyecto.cola;

import java.util.Scanner;

public class ProyectoCola {
    class Nodo{
        String info;
        Nodo sig;
    }
    private Nodo raiz,fondo;
    
    boolean vacia(){
        if(raiz==null){
            return true;
        }
        else{
            return false;
        }
    }
    void insertar(String info){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.info=info;
        nuevo.sig=null;
        if(vacia()){
            raiz=nuevo;
            fondo=nuevo;
        }
        else{
            fondo.sig=nuevo;
            fondo=nuevo;
        }
    }
    String extraer(){
        if(!vacia()){
            String informacion=raiz.info;
            if(raiz==fondo){
                raiz=null;
                fondo=null;
            }
            else{
                raiz=raiz.sig;
            }
            return informacion;
        }else
            return null;
    }
    public void imprimir(){
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while(reco!=null){
            System.out.print(reco.info+"/");
            reco=reco.sig;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ProyectoCola cola=new ProyectoCola();
        Scanner leer=new Scanner(System.in);
        String cliente;
        int cont=0;
        int selec=0;
        int menusele=0;
        int escoge;
        int op;
        do{
            System.out.println("Desea realizar un proceso");
            System.out.println("1)Si");
            System.out.println("2)No");
            selec=leer.nextInt();
            if(selec==1){
                System.out.println("¿Cual proceso desea realizar?");
                System.out.println("1)Agregar cliente");
                System.out.println("2)Aceptar viaje");
                menusele=leer.nextInt();
                switch(menusele){
                case 1: 
                    System.out.println("Inserte nombre de cliente");
                    cliente=leer.next();
                    cola.insertar(cliente);
                    System.out.println("El cliente ha sido agregado");
                    cont++;  
                break;
                case 2: 
                    System.out.println("Desea aceptar el viaje");
                    System.out.println("1)Aceptar viaje");
                    System.out.println("2)Negar viaje");
                    escoge=leer.nextInt();
                    if(escoge==1){
                        cola.extraer();
                        System.out.println("Viaje aceptado");
                    }else{
                        cola.extraer();
                        System.out.println("Viaje no aceptado, se va a eliminar en la lista de espera");
                    }
                    break;
                    case 3: break;
                    }
            }

        }while(selec!=2); 
        System.out.println("Muchas gracias por su ayuda");
    }
    
}