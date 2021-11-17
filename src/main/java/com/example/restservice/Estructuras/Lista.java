
package com.example.restservice.Estructuras;
public class Lista {
     class Nodo {
        String info;
        Nodo sig;
    }

    private Nodo raiz;

    public Lista() {
        this.raiz = null;
    }
    
    public void insertar(int pos, String x){
        if(pos <= cantidad()+1){
            Nodo nuevo = new Nodo();
            nuevo.info = x;
            if(pos == 1){
                nuevo.sig = raiz;
                raiz = nuevo;
            }else{
                if(pos == cantidad()+1){
                    Nodo reco = raiz;
                    while(reco.sig != null){
                        reco = reco.sig;
                    }
                    reco.sig = nuevo;
                    nuevo.sig = null;
                }else{
                    Nodo reco = raiz;
                    for(int f = 1 ; f <= pos -2 ; f++){
                        reco = reco.sig;
                    }
                    Nodo siguiente = reco.sig;
                    nuevo.sig = siguiente;
                }
            }
        }
    }
    
    public void borrar(int pos){
        if(pos <= cantidad()){
            if(pos == 1){
                raiz = raiz.sig;
            }else{
                Nodo reco;
                reco = raiz;
                for(int f = 1; f<=pos-2; f++){
                    reco = reco.sig;
                }
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
            }
        }
    }
    
    public void imprimir(){
        Nodo reco = raiz;
        while(reco != null){
            System.out.println(reco.info + "-");
            reco = reco.sig;
        }
        System.out.println("");
    }
    
    public int cantidad(){
        int cant = 0;
        Nodo reco = raiz;
        while(reco != null){
            reco = reco.sig;
            cant++;
        }
        return cant;
    }
    
    public boolean existe(String x){
        Nodo reco = raiz;
        while(reco != null){
            if(reco.info==x){
                return true;
            }
            reco = reco.sig;
        }
        return false;
    }
}
