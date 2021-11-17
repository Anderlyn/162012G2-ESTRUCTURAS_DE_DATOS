package com.example.restservice;

import com.example.restservice.Estructuras.Lista;
import com.example.restservice.Modelos.Conductor;
import com.example.restservice.Utils.EstadoServidor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViajeController {
        static Lista viajeActual = new Lista();
        static boolean viajeEnEspera = false;
        static boolean estadoViaje = false;

	@GetMapping("/pedirViaje")
	public EstadoServidor pedirViaje(@RequestParam(value = "inicio", defaultValue = "L0") String inicioViaje, @RequestParam(value = "final", defaultValue = "L1") String finalViaje) {
            if(!viajeEnEspera){
                viajeActual.insertar(1, inicioViaje);
                viajeActual.insertar(2, finalViaje);
                viajeEnEspera = true;
                viajeActual.imprimir();
                return new EstadoServidor(true);
            }else{
                return new EstadoServidor(false);
            }
	}
        @GetMapping("/responderViaje")
	public EstadoServidor pedirResponderViaje(@RequestParam(value = "inicioConductor", defaultValue = "L2") String inicioConductor) {
            if(viajeEnEspera){
                viajeActual.insertar(1, inicioConductor);
                viajeEnEspera = true;
                viajeActual.imprimir();
                return new EstadoServidor(true);
            }else{
                return new EstadoServidor(false);
            }
	}
        @GetMapping("/modificarViaje")
	public EstadoServidor modificarViaje(@RequestParam(value = "inicio", defaultValue = "L0") String inicioViaje, @RequestParam(value = "final", defaultValue = "L1") String finalViaje) {
            if(viajeEnEspera){
                viajeActual.borrar(1);
                viajeActual.borrar(2);
                viajeActual.insertar(1, inicioViaje);
                viajeActual.insertar(2, finalViaje);
                return new EstadoServidor(true);
            }else{
                return new EstadoServidor(false);
            }
	}
        @GetMapping("/buscarDestino")
	public EstadoServidor buscarDestino(@RequestParam(value = "destinoBusqueda", defaultValue = "L0") String destinoBusqueda) {
            if(viajeEnEspera){
                if(viajeActual.existe(destinoBusqueda)){
                    return new EstadoServidor(true);
                }else{
                   return new EstadoServidor(false); 
                }
                
            }else{
                return new EstadoServidor(false);
            }
	}
        @GetMapping("/terminarViaje")
	public EstadoServidor terminarViaje() {
            viajeActual.borrar(1);
            viajeActual.borrar(2);
            viajeActual.borrar(3);
            return new EstadoServidor(true);
	}
        
        @GetMapping("/obtenerRuta")
	public Conductor obtenerViaje() {
            viajeActual.borrar(1);
            viajeActual.borrar(2);
            viajeActual.borrar(3);
            return new Conductor();
	}
}
