package com.example.pokemonbueno;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController {

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
    BorderPane bpane1;

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
    BorderPane bpane2;

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
    BorderPane bpane3;

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
    BorderPane bpane4;

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
    BorderPane bpane5;

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
    @FXML
    BorderPane bpane6;
    @FXML
    Button continuar;

    private CombatePokemon v = null;
    private Stage stage = null;
    private int pokemonSeleccionado = 0;
    ArrayList<BorderPane> bpanes = new ArrayList<>();

    @FXML
    public void initialize() {
        continuar.setDisable(true);
        bpanes.add(bpane1);
        bpanes.add(bpane2);
        bpanes.add(bpane3);
        bpanes.add(bpane4);
        bpanes.add(bpane5);
        bpanes.add(bpane6);
        pokemonMuertos();


        float restante1 = HelloApplication.arrayPokemon.get(0).vidaRestante;
        float vid1 = restante1 / HelloApplication.arrayPokemon.get(0).vida;
        imagen1.setImage(HelloApplication.arrayPokemon.get(0).imagen);
        name1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).nombre));
        vida1.setProgress(vid1);
        ps1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).vidaRestante));
        nivel1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).nivel));

        imagen2.setImage(HelloApplication.arrayPokemon.get(1).imagen);
        name2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).nombre));
        float restante2 = HelloApplication.arrayPokemon.get(1).vidaRestante;
        float vid2 = restante2 / HelloApplication.arrayPokemon.get(1).vida;
        vida2.setProgress(vid2);
        ps2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).vidaRestante));
        nivel2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).nivel));

        imagen3.setImage(HelloApplication.arrayPokemon.get(2).imagen);
        name3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).nombre));
        float restante3 = HelloApplication.arrayPokemon.get(2).vidaRestante;
        float vid3 = restante3 / HelloApplication.arrayPokemon.get(2).vida;
        vida3.setProgress(vid3);
        ps3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).vidaRestante));
        nivel3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).nivel));

        imagen4.setImage(HelloApplication.arrayPokemon.get(3).imagen);
        name4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).nombre));
        float restante4 = HelloApplication.arrayPokemon.get(3).vidaRestante;
        float vid4 = restante4 / HelloApplication.arrayPokemon.get(3).vida;
        vida4.setProgress(vid4);
        ps4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).vidaRestante));
        nivel4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).nivel));

        imagen5.setImage(HelloApplication.arrayPokemon.get(4).imagen);
        name5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).nombre));
        float restante5 = HelloApplication.arrayPokemon.get(4).vidaRestante;
        float vid5 = restante5 / HelloApplication.arrayPokemon.get(4).vida;
        vida5.setProgress(vid5);
        ps5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).vidaRestante));
        nivel5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).nivel));

        imagen6.setImage(HelloApplication.arrayPokemon.get(5).imagen);
        name6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).nombre));
        float restante6 = HelloApplication.arrayPokemon.get(5).vidaRestante;
        float vid6 = restante6 / HelloApplication.arrayPokemon.get(5).vida;
        vida6.setProgress(vid6);
        ps6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).vidaRestante));
        nivel6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).nivel));
    }

    @FXML
    public void seleccionar1() {
        deseleccionar();
        pokemonSeleccionado = 0;
        bpane1.setStyle("-fx-background-color:#c0b595");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            continuar.setDisable(true);
            bpane1.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar2() {
        deseleccionar();
        pokemonSeleccionado = 1;
        bpane2.setStyle("-fx-background-color:#c0b595");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            continuar.setDisable(true);
            bpane2.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar3() {
        deseleccionar();
        pokemonSeleccionado = 2;
        bpane3.setStyle("-fx-background-color:#c0b595");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            continuar.setDisable(true);
            bpane3.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar4() {
        deseleccionar();
        pokemonSeleccionado = 3;
        bpane4.setStyle("-fx-background-color:#c0b595");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            continuar.setDisable(true);
            bpane4.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar5() {
        deseleccionar();
        pokemonSeleccionado = 4;
        bpane5.setStyle("-fx-background-color:#c0b595");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            continuar.setDisable(true);
            bpane5.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar6() {
        deseleccionar();
        pokemonSeleccionado = 5;
        bpane6.setStyle("-fx-background-color:#c0b595");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            continuar.setDisable(true);
            bpane6.setStyle("-fx-background-color:#C76955");
        }
    }

    public void deseleccionar() {
        continuar.setDisable(false);
        bpane1.setStyle("-fx-background-color:#f1e3bb");
        bpane2.setStyle("-fx-background-color:#f1e3bb");
        bpane3.setStyle("-fx-background-color:#f1e3bb");
        bpane4.setStyle("-fx-background-color:#f1e3bb");
        bpane5.setStyle("-fx-background-color:#f1e3bb");
        bpane6.setStyle("-fx-background-color:#f1e3bb");
    }

    public void cambiarDePantalla() {
        try {
            if (stage == null || !stage.isShowing()) {
                stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("combate-fxml.fxml"));
                AnchorPane root = (AnchorPane) loader.load();
                Scene scene = new Scene(root, 620, 352);
                stage.setScene(scene);
                stage.show();
                v = loader.getController();
            }
            v.enviarPokemon(pokemonSeleccionado);
            v.enviarController1(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pokemonMuertos() {
        for (int i = 0; i < HelloApplication.arrayPokemon.size(); i++) {
            if (HelloApplication.arrayPokemon.get(i).vidaRestante == 0) {
                bpanes.get(i).setStyle("-fx-background-color:#C76955");
            }
        }
    }

    public void actualizarVida() {
        float restante1 = HelloApplication.arrayPokemon.get(0).vidaRestante;
        float vid1 = restante1 / HelloApplication.arrayPokemon.get(0).vida;
        vida1.setProgress(vid1);
        ps1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).vidaRestante));

        float restante2 = HelloApplication.arrayPokemon.get(1).vidaRestante;
        float vid2 = restante2 / HelloApplication.arrayPokemon.get(1).vida;
        vida2.setProgress(vid2);
        ps2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).vidaRestante));

        float restante3 = HelloApplication.arrayPokemon.get(2).vidaRestante;
        float vid3 = restante3 / HelloApplication.arrayPokemon.get(2).vida;
        vida3.setProgress(vid3);
        ps3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).vidaRestante));

        float restante4 = HelloApplication.arrayPokemon.get(3).vidaRestante;
        float vid4 = restante4 / HelloApplication.arrayPokemon.get(3).vida;
        vida4.setProgress(vid4);
        ps4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).vidaRestante));

        float restante5 = HelloApplication.arrayPokemon.get(4).vidaRestante;
        float vid5 = restante5 / HelloApplication.arrayPokemon.get(4).vida;
        vida5.setProgress(vid5);
        ps5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).vidaRestante));

        float restante6 = HelloApplication.arrayPokemon.get(5).vidaRestante;
        float vid6 = restante6 / HelloApplication.arrayPokemon.get(5).vida;
        vida6.setProgress(vid6);
        ps6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).vidaRestante));
    }
}
