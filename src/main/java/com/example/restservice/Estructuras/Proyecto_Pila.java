package com.example.restservice.Estructuras;

import java.util.Scanner;
import java.util.Stack;

public class Proyecto_Pila {

    public static void asd(String[] args) {
        // TODO code application logic here
        Stack <String> pilaMontos = new Stack();
        Stack <String> pilaConductores = new Stack();
        Scanner leer = new Scanner (System.in);
        String monto, conductor;
        
        System.out.println("Viaje de San Jose a Escazu");
        System.out.println("");
        
        for (int i=1; i<6; i++){
            System.out.println("ID del conductor:");
            conductor = leer.next();
            pilaConductores.push(conductor);
            System.out.println();
            
            System.out.println("Monto sugerido: ");
            monto = leer.next();
            pilaMontos.push(monto);
            System.out.println();
            
            System.out.println("Conductor "+conductor+" sugiere el monto : "+monto);
            System.out.println();
        }
            System.out.println("Conductores: "+pilaConductores);
            System.out.println("Montos finales sugeridos: "+pilaMontos);
    }
    
}
