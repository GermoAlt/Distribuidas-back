package com.uade.morfando.services;
import com.uade.morfando.entities.Propietario;
import com.uade.morfando.model.InfoResponse;
import com.uade.morfando.model.MessageResponse;
import com.uade.morfando.model.SignupRequest;
import com.uade.morfando.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PropietariosServiceImpl implements PropietariosService {
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    private UserRepository userRepository;


    public ResponseEntity registrarPropietario (SignupRequest signUpRequest){
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity
                    (new InfoResponse(HttpStatus.UNAUTHORIZED.value(),signUpRequest.getUsername(),"Error: email ya registrado"),
                            HttpStatus.UNAUTHORIZED);
        }

        Propietario propietario = new Propietario(signUpRequest.getUsername(),
                encoder.encode(signUpRequest.getPassword()));
        userRepository.save(propietario);
        return ResponseEntity.created(null).body(new InfoResponse(HttpStatus.CREATED.value(), propietario,"User registrado"));
    }

    @Override
    public ResponseEntity obtenerPropietario(String id) {
        Optional<Propietario> propietario = userRepository.findById(id);
        String message = "Usuario encontrado";
        if(propietario.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new InfoResponse(HttpStatus.NOT_FOUND.value(), propietario,"Usuario no encontrado"));
        }
        return ResponseEntity.ok(new InfoResponse(HttpStatus.OK.value(),propietario,message));
    }

}
