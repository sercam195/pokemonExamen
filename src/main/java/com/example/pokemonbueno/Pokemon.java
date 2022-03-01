package com.example.pokemonbueno;

import javafx.scene.image.Image;

public class Pokemon {

    String nombre;
    int nivel;
    float vida;
    float vidaRestante;
    Image imagen;
    Image espalda;
    int dañoRealizado;
    int dañoRecibido;
    int seleccionado;
    char sexo;

    public Pokemon(String nombre, int nivel, int vida, int vidaRestante, Image imagen, Image espalda, int dañoRealizado, int dañoRecibido, int seleccionado, char sexo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaRestante = vidaRestante;
        this.imagen = imagen;
        this.espalda = espalda;
        this.dañoRealizado = dañoRealizado;
        this.dañoRecibido = dañoRecibido;
        this.seleccionado = seleccionado;
        this.sexo = sexo;
    }
}
