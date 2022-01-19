package com.example.pokemonbueno;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

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
    public void initialize(URL location, ResourceBundle resources) {
        imagen1.setImage(HelloApplication.arrayPokemon.get(0).imagen);
        name1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).nombre));
        vida1.setProgress(HelloApplication.arrayPokemon.get(0).vida);
        ps1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).vidaRestante));
        nivel1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).nivel));

        imagen2.setImage(HelloApplication.arrayPokemon.get(1).imagen);
        name2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).nombre));
        vida2.setProgress(HelloApplication.arrayPokemon.get(1).vida);
        ps2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).vidaRestante));
        nivel2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).nivel));


        imagen3.setImage(HelloApplication.arrayPokemon.get(2).imagen);
        name3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).nombre));
        vida3.setProgress(HelloApplication.arrayPokemon.get(2).vida);
        ps3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).vidaRestante));
        nivel3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).nivel));

        imagen4.setImage(HelloApplication.arrayPokemon.get(3).imagen);
        name4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).nombre));
        vida4.setProgress(HelloApplication.arrayPokemon.get(3).vida);
        ps4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).vidaRestante));
        nivel4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).nivel));

        imagen5.setImage(HelloApplication.arrayPokemon.get(4).imagen);
        name5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).nombre));
        vida5.setProgress(HelloApplication.arrayPokemon.get(4).vida);
        ps5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).vidaRestante));
        nivel5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).nivel));

        imagen6.setImage(HelloApplication.arrayPokemon.get(5).imagen);
        name6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).nombre));
        vida6.setProgress(HelloApplication.arrayPokemon.get(5).vida);
        ps6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).vidaRestante));
        nivel6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).nivel));

    }
}
