package com.radaracciones.controller;

import com.radaracciones.model.Accion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/acciones")
public class AccionController {

    @PostMapping("/evaluar")
    public Accion evaluar(@RequestBody Accion accion) {
        accion.evaluarChecklist();
        return accion;
    }

}
