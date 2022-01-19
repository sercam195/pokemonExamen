package com.example.pokemonbueno;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    Pokemon p1 = new Pokemon("Arceus", 47, 162, 20, new File("java\\com\\example\\pokemonbueno\\imagenes\\arceus.gif"));
    Pokemon p2 = new Pokemon("Charizard", 98, 200, 20, new File("java\\com\\example\\pokemonbueno\\imagenes\\arceus.gif"));
    Pokemon p3 = new Pokemon("Blastoise", 87, 151, 20, new File("java\\com\\example\\pokemonbueno\\imagenes\\arceus.gif"));
    Pokemon p4 = new Pokemon("Celebi", 36, 179, 20, new File("java\\com\\example\\pokemonbueno\\imagenes\\arceus.gif"));
    Pokemon p5 = new Pokemon("Dialga", 10, 101, 20, new File("java\\com\\example\\pokemonbueno\\imagenes\\arceus.gif"));
    Pokemon p6 = new Pokemon("Palkia", 60, 73, 20, new File("java\\com\\example\\pokemonbueno\\imagenes\\arceus.gif"));


    @FXML
    Label name1;
    @FXML
    ImageView imagen1;
    @FXML
    Label nivel1;
    @FXML
    ProgressBar vida1;
    @FXML
    Label ps1;

    @FXML
    Label name2;
    @FXML
    ImageView imagen2;
    @FXML
    Label nivel2;
    @FXML
    ProgressBar vida2;
    @FXML
    Label ps2;

    @FXML
    Label name3;
    @FXML
    ImageView imagen3;
    @FXML
    Label nivel3;
    @FXML
    ProgressBar vida3;
    @FXML
    Label ps3;

    @FXML
    Label name4;
    @FXML
    ImageView imagen4;
    @FXML
    Label nivel4;
    @FXML
    ProgressBar vida4;
    @FXML
    Label ps4;

    @FXML
    Label name5;
    @FXML
    ImageView imagen5;
    @FXML
    Label nivel5;
    @FXML
    ProgressBar vida5;
    @FXML
    Label ps5;

    @FXML
    Label name6;
    @FXML
    ImageView imagen6;
    @FXML
    Label nivel6;
    @FXML
    ProgressBar vida6;
    @FXML
    Label ps6;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Image image1 = new Image(p1.imagen.toURI().toString());
        imagen1.setImage(image1);
        name1.setText(String.valueOf(p1.nombre));
        vida1.setProgress(p1.vida);
        ps1.setText(String.valueOf(p1.vidaRestante));
        nivel1.setText(String.valueOf(p1.nivel));


        Image image2 = new Image(p2.imagen.toURI().toString());
        imagen2.setImage(image2);
        name2.setText(String.valueOf(p2.nombre));
        vida2.setProgress(p2.vida);
        ps2.setText(String.valueOf(p2.vidaRestante));
        nivel2.setText(String.valueOf(p2.nivel));


        Image image3 = new Image(p3.imagen.toURI().toString());
        imagen3.setImage(image3);
        name3.setText(String.valueOf(p3.nombre));
        vida3.setProgress(p3.vida);
        ps3.setText(String.valueOf(p3.vidaRestante));
        nivel3.setText(String.valueOf(p3.nivel));

        Image image4 = new Image(p4.imagen.toURI().toString());
        imagen4.setImage(image4);
        name4.setText(String.valueOf(p4.nombre));
        vida4.setProgress(p4.vida);
        ps4.setText(String.valueOf(p4.vidaRestante));
        nivel4.setText(String.valueOf(p4.nivel));

        Image image5 = new Image(p5.imagen.toURI().toString());
        imagen5.setImage(image5);
        name5.setText(String.valueOf(p5.nombre));
        vida5.setProgress(p5.vida);
        ps5.setText(String.valueOf(p5.vidaRestante));
        nivel5.setText(String.valueOf(p5.nivel));


        Image image6 = new Image(p6.imagen.toURI().toString());
        imagen6.setImage(image6);
        name6.setText(String.valueOf(p6.nombre));
        vida6.setProgress(p6.vida);
        ps6.setText(String.valueOf(p6.vidaRestante));
        nivel6.setText(String.valueOf(p6.nivel));
    }
}
