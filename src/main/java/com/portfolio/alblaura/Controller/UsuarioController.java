package com.portfolio.alblaura.Controller;

import com.portfolio.alblaura.Model.Usuario;
import com.portfolio.alblaura.Service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable("id")Long id) {
        Usuario usuario = usuarioService.findUser(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario) {
        Usuario updateUsuario = usuarioService.saveUser(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
}
