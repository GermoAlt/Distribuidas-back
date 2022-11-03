package com.uade.morfando.controllers;

import com.uade.morfando.entities.Menu;
import com.uade.morfando.entities.Restaurante;
import com.uade.morfando.services.MenusService;
import com.uade.morfando.services.RestaurantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("morfando/v1/menu")
public class MenuController {

    @Autowired
    private MenusService menusService;

    @PostMapping("/")
    public ResponseEntity<?> newMenu(@RequestBody Menu menu) {
        return menusService.newMenu(menu);
    }

    @GetMapping("/{idResto}")
    public ResponseEntity<?> obtenerMenuByRestaurante (@PathVariable String idResto) {
        return menusService.obtenerMenuByRestaurante(idResto);
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<?> updateMenu(@RequestBody Menu menu, @PathVariable String id) {
        return menusService.editarMenu(menu,id);
    }


}
