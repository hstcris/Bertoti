package com.example.controller;

import com.example.entity.Cupcake;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cupcakes")
@CrossOrigin(origins = "*")
public class PrincipalController {

    private List<Cupcake> cupcakes = new ArrayList<>();

    public PrincipalController() {
        cupcakes.addAll(List.of(
                new Cupcake("Morango  $3"),
                new Cupcake("Chocolate  $3"),
                new Cupcake("Baunilha  $2"),
                new Cupcake("Limão  $5")
        ));
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Cupcake> getCupcakes() {
        return cupcakes;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public List<Cupcake> postCupcake(@RequestBody Cupcake newCupcake) {
        if (newCupcake.getId() == null || newCupcake.getId().isEmpty()) {
            newCupcake.setId(UUID.randomUUID().toString());
        }
        cupcakes.add(newCupcake);
        return getCupcakes();
    }

    @PutMapping("/{id}")
    @ResponseBody
    public List<Cupcake> putCupcake(@PathVariable String id, @RequestBody Cupcake updatedCupcake) {
        cupcakes.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .ifPresent(cupcake -> cupcake.setNome(updatedCupcake.getNome()));
        return getCupcakes();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public List<Cupcake> deleteCupcake(@PathVariable String id) {
        cupcakes.removeIf(l -> l.getId().equals(id));
        return getCupcakes();
    }
}