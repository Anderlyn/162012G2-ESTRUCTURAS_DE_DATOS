package com.example.restservice;

import com.example.restservice.Estructuras.Lista;
import com.example.restservice.Modelos.Conductor;
import com.example.restservice.Utils.EstadoServidor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConductorController {
    	@GetMapping("/pedirViaje")
	public EstadoServidor pedirViaje(@RequestParam(value = "inicio", defaultValue = "L0") String inicioViaje, @RequestParam(value = "final", defaultValue = "L1") String finalViaje) {
            
	}
}
