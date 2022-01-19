package com.example.pokemonbueno;

import java.io.File;

public class Pokemon {

    String nombre;
    int nivel;
    int vida;
    int vidaRestante;
    File imagen;

    public Pokemon(String nombre, int nivel, int vida, int vidaRestante, File imagen) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaRestante = vidaRestante;
        this.imagen = imagen;
    }
}
