package com.example.pokemonbueno;

import javafx.scene.image.Image;

import java.io.File;

public class Pokemon {

    String nombre;
    int nivel;
    int vida;
    int vidaRestante;
    Image imagen;

    public Pokemon(String nombre, int nivel, int vida, int vidaRestante, Image imagen) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaRestante = vidaRestante;
        this.imagen = imagen;
    }
}
