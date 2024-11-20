package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class Cupcake {
    private String id;
    private String nome;

    public Cupcake() {

    }

    public Cupcake(String name) {
        this.id = UUID.randomUUID().toString();
        this.nome = name;
    }
}
