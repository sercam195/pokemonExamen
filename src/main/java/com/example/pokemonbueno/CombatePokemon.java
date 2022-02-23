package com.example.pokemonbueno;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;
import java.util.Random;

public class CombatePokemon {
    @FXML
    ImageView fondo;
    @FXML
    ImageView pokemonAliado;
    @FXML
    ImageView pokemonEnemigo;
    @FXML
    BorderPane ataques;
    @FXML
    ProgressBar vidaPokemon;
    @FXML
    ProgressBar vidaEnemy;
    @FXML
    Label atacar;
    @FXML
    Label cancelar;

    private HelloController controllerVentana1;
    Pokemon e1 = new Pokemon("Scyther", 47, 123, 100, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/e/ee/latest/20200716062847/Scyther_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/5/50/latest/20140122175710/Scyther_espalda_G6.gif"));
    Pokemon e2 = new Pokemon("Charizard", 98, 200, 180, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/a7/latest/20200102060755/Charizard_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/2/26/latest/20150321003543/Charizard_espalda_G6.gif"));
    Pokemon e3 = new Pokemon("Blastoise", 87, 151, 140, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/ae/latest/20200308135900/Blastoise_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/d/d8/latest/20140111220000/Blastoise_espalda_G6.gif"));
    Pokemon e4 = new Pokemon("Growlithe", 36, 179, 160, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/1/1b/latest/20200103042604/Growlithe_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/0/0a/latest/20150321173530/Growlithe_espalda_G6.gif"));
    public static ArrayList<Pokemon> arrayEnemigos = new ArrayList<>();
    float restanteEnemigo;
    float vidEnemigo;
    float restanteAliado;
    float vidAliado;
    int pokemonSeleccionado;
    int pokemonSeleccionadoEnemigo;
    Random random = new Random();

    public void enviarPokemon(int pokemonSeleccionado) {
        this.pokemonSeleccionado = pokemonSeleccionado;
        enemigoRandom();
        establecerVida();
        establecerInterfazPokemons();
        ataques.setVisible(false);
    }

    public void atacar(MouseEvent mouseEvent) {
        ataques.setVisible(true);
    }

    public void cancelar(MouseEvent mouseEvent) {
        ataques.setVisible(false);
    }

    public void ataqueSeguro() {
        if (!((restanteEnemigo - 20) <= 0 || restanteAliado - 20 <= 0)) {

            //Enemigo
            restanteEnemigo = restanteEnemigo - 20;
            vidEnemigo = restanteEnemigo / arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
            vidaEnemy.setProgress(vidEnemigo);

            //Aliado
            restanteAliado = restanteAliado - 20;
            HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante = restanteAliado;
            vidAliado = restanteAliado / HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida;
            vidaPokemon.setProgress(vidAliado);

            controllerVentana1.actualizarVida();
            controllerVentana1.pokemonMuertos();

        } else {
            if ((restanteEnemigo - 20) <= 0) {
                restanteEnemigo = 0;
                vidEnemigo = restanteEnemigo / arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
                vidaEnemy.setProgress(vidEnemigo);
                controllerVentana1.actualizarVida();
                controllerVentana1.pokemonMuertos();
            } else {
                restanteAliado = 0;
                HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante = restanteAliado;
                vidAliado = restanteAliado / HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida;
                vidaPokemon.setProgress(vidAliado);
                controllerVentana1.actualizarVida();
                controllerVentana1.pokemonMuertos();
            }
        }
    }

    public void enemigoRandom() {
        arrayEnemigos.add(e1);
        arrayEnemigos.add(e2);
        arrayEnemigos.add(e3);
        arrayEnemigos.add(e4);
        pokemonSeleccionadoEnemigo = random.nextInt(arrayEnemigos.size());
    }

    public void establecerVida() {
        restanteEnemigo = arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante;
        vidEnemigo = restanteEnemigo / arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
        restanteAliado = HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante;
        vidAliado = restanteAliado / HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida;
    }

    public void establecerInterfazPokemons() {
        vidaPokemon.setProgress(vidAliado);
        vidaEnemy.setProgress(vidEnemigo);
        pokemonAliado.setImage(HelloApplication.arrayPokemon.get(pokemonSeleccionado).espalda);
        fondo.setImage(new Image("https://static.wikia.nocookie.net/espokemon/images/e/e4/Campo_de_batalla_DPPt_2.png/revision/latest?cb=20090424143324"));
        pokemonEnemigo.setImage(arrayEnemigos.get(pokemonSeleccionadoEnemigo).imagen);
    }

    public void enviarController1(HelloController controllerVentana1) {
        this.controllerVentana1 = controllerVentana1;
    }
}