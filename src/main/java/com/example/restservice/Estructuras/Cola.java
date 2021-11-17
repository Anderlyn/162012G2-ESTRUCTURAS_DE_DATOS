
package com.example.restservice.Estructuras;


public class Cola {
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
        while(reco!=null){
            System.out.print(reco.info+"/");
            reco=reco.sig;
        }
        System.out.println();
    }
    
}