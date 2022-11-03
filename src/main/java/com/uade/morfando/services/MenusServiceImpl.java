package com.uade.morfando.services;

import com.uade.morfando.entities.Menu;
import com.uade.morfando.entities.Restaurante;
import com.uade.morfando.model.InfoResponse;
import com.uade.morfando.repository.MenuRepository;
import com.uade.morfando.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenusServiceImpl implements MenusService {
    @Autowired
    MenuRepository menuRepository;

    @Override
    public ResponseEntity newMenu(Menu menu) {
        menuRepository.save(menu);
        return ResponseEntity.created(null).body(new InfoResponse(HttpStatus.CREATED.value(), menu,"Menu creado"));
    }

    @Override
    public ResponseEntity obtenerMenuByRestaurante(String idResto) {
        Optional<Menu> menu = menuRepository.findById(idResto);
        if(menu.isEmpty()){
            return new ResponseEntity(new InfoResponse(HttpStatus.NOT_FOUND.value(),idResto,"No existe menu para el restaurante buscado"),
            HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(new InfoResponse(HttpStatus.OK.value(),menu,"Menu encontrado"));
    }

    @Override
    public ResponseEntity editarMenu(Menu menu, String id) {
        menu.setId(id);
        menuRepository.save(menu);
        return ResponseEntity.created(null).body(new InfoResponse(HttpStatus.CREATED.value(),menu,"Restaurante modificado"));
    }
}
