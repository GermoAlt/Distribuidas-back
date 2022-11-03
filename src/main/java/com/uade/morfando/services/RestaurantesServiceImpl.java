package com.uade.morfando.services;

import com.uade.morfando.entities.Cliente;
import com.uade.morfando.entities.Propietario;
import com.uade.morfando.entities.Restaurante;
import com.uade.morfando.model.InfoResponse;
import com.uade.morfando.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantesServiceImpl implements RestaurantesService {
    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public ResponseEntity newRestaurant(Restaurante restaurante) {
        if (restaurantRepository.existsByNombre(restaurante.getNombre())) {
            return new ResponseEntity
                    (new InfoResponse(HttpStatus.CONFLICT.value(),restaurante.getNombre(),"Error: email ya registrado"),
                            HttpStatus.CONFLICT);
        }
        restaurantRepository.save(restaurante);
        return ResponseEntity.created(null).body(new InfoResponse(HttpStatus.CREATED.value(), restaurante,"Restaurante registrado"));
    }

    @Override
    public ResponseEntity obtenerRestaurant(String id) {
        Optional<Restaurante> restaurante = restaurantRepository.findById(id);
        if(restaurante.isEmpty()){
            return new ResponseEntity(new InfoResponse(HttpStatus.NOT_FOUND.value(),id,"No existe el restaurante buscado"),
            HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(new InfoResponse(HttpStatus.OK.value(),restaurante,"Restaurante encontrado"));
    }

    @Override
    public ResponseEntity obtenerByIdUser(String idUser) {
        List<Restaurante> restaurantes = restaurantRepository.findByIdPropietario(idUser);
        if(restaurantes.isEmpty()){
            return new ResponseEntity(new InfoResponse(HttpStatus.NOT_FOUND.value(),idUser,"No existen restaurantes para el user"),
                    HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(new InfoResponse(HttpStatus.OK.value(),restaurantes,"Restaurantes encontrados"));
    }

    @Override
    public ResponseEntity editarRestaurant(Restaurante restaurante, String id) {
//        Optional<Restaurante> restauranteOriginal = restaurantRepository.findById(id);
//        if(restauranteOriginal.isPresent()){
//            Restaurante restauranteModificado = restauranteOriginal.get();
//        }
        restaurante.setId(id);
        restaurantRepository.save(restaurante);
        return ResponseEntity.created(null).body(new InfoResponse(HttpStatus.CREATED.value(),restaurante,"Restaurante modificado"));
    }
}
