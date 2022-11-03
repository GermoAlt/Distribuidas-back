package com.uade.morfando.services;

import com.uade.morfando.entities.Calificacion;
import com.uade.morfando.entities.Menu;
import com.uade.morfando.model.InfoResponse;
import com.uade.morfando.repository.CalificacionRepository;
import com.uade.morfando.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionesServiceImpl implements CalificacionesService {
    @Autowired
    CalificacionRepository calificacionRepository;


    @Override
    public ResponseEntity obtenerCalificacionesByRestaurante(String idResto) {
        List<Calificacion> calificaciones = calificacionRepository.findByIdResto(idResto);
        if(calificaciones.isEmpty()){
            return new ResponseEntity(new InfoResponse(HttpStatus.NOT_FOUND.value(),idResto,"No existen calificaciones para el restaurante buscado"),
            HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(new InfoResponse(HttpStatus.OK.value(),calificaciones,"Calificaciones encontradas"));
    }

}
