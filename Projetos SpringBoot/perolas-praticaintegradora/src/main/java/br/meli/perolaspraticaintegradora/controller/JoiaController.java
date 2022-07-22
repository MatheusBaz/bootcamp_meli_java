package br.meli.perolaspraticaintegradora.controller;

import br.meli.perolaspraticaintegradora.model.Joia;
import br.meli.perolaspraticaintegradora.service.JoiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/joia")
public class JoiaController {

    @Autowired
    private JoiaService service;

    @PostMapping("/inserir")
    ResponseEntity<Long> add(@RequestBody Joia joia){
        Long ident = service.add(joia);
        if (ident != -1) {
            return ResponseEntity.ok(ident);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping
    ResponseEntity<List<Joia>> list(){
        return ResponseEntity.ok(service.listAll());
    }

    @DeleteMapping("/excluir")
    ResponseEntity<String> delete(@RequestParam Long num_ident) {
        service.delete(num_ident);
        return ResponseEntity.ok("Requisição feita");
    }

    @PutMapping("/atualizar")
    ResponseEntity<Joia> atualizar(@RequestBody Joia joia) {
        return ResponseEntity.ok(service.update(joia));
    }



}
