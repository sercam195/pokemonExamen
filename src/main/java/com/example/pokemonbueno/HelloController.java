package com.example.pokemonbueno;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
    ImageView sexo1;

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
    ImageView sexo2;

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
    ImageView sexo3;

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
    ImageView sexo4;

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
    ImageView sexo5;

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
    ImageView sexo6;
    @FXML
    Button continuar;
    @FXML
    Button elegirpokemon;
    @FXML
    ImageView imagenps1;
    @FXML
    ImageView imagenps2;
    @FXML
    ImageView psimagen3;
    @FXML
    ImageView psimagen4;
    @FXML
    ImageView psimagen5;
    @FXML
    ImageView psimagen6;
    @FXML
    Button pokedex;

    private CombatePokemon v = null;
    private Graficas v2 = null;
    private PokedexController v3 = null;
    private Stage stage = null;
    private int pokemonSeleccionado = 0;
    ArrayList<BorderPane> bpanes = new ArrayList<>();

    @FXML
    public void initialize() {
        elegirpokemon.setDisable(true);
        continuar.setDisable(true);
        pokedex.setDisable(true);
        bpanes.add(bpane1);
        bpanes.add(bpane2);
        bpanes.add(bpane3);
        bpanes.add(bpane4);
        bpanes.add(bpane5);
        bpanes.add(bpane6);
        pokemonMuertos();

        imagenps1.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/ps.png").toURI().toString()));
        imagenps2.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/ps.png").toURI().toString()));
        psimagen3.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/ps.png").toURI().toString()));
        psimagen4.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/ps.png").toURI().toString()));
        psimagen5.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/ps.png").toURI().toString()));
        psimagen6.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/ps.png").toURI().toString()));

        float restante1 = HelloApplication.arrayPokemon.get(0).vidaRestante;
        float vid1 = restante1 / HelloApplication.arrayPokemon.get(0).vida;
        imagen1.setImage(HelloApplication.arrayPokemon.get(0).imagen);
        name1.setText(String.valueOf(HelloApplication.arrayPokemon.get(0).nombre));
        vida1.setProgress(vid1);
        ps1.setText((int) HelloApplication.arrayPokemon.get(0).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(0).vida + " PS");
        nivel1.setText("NV " + HelloApplication.arrayPokemon.get(0).nivel);
        if (HelloApplication.arrayPokemon.get(0).sexo == 'm'){
            sexo1.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/masc.png").toURI().toString()));
        } else {
            sexo1.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/fem.png").toURI().toString()));
        }

        imagen2.setImage(HelloApplication.arrayPokemon.get(1).imagen);
        name2.setText(String.valueOf(HelloApplication.arrayPokemon.get(1).nombre));
        float restante2 = HelloApplication.arrayPokemon.get(1).vidaRestante;
        float vid2 = restante2 / HelloApplication.arrayPokemon.get(1).vida;
        vida2.setProgress(vid2);
        ps2.setText((int) HelloApplication.arrayPokemon.get(1).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(1).vida + " PS");
        nivel2.setText("NV " + HelloApplication.arrayPokemon.get(1).nivel);
        if (HelloApplication.arrayPokemon.get(1).sexo == 'm'){
            sexo2.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/masc.png").toURI().toString()));
        } else {
            sexo2.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/fem.png").toURI().toString()));
        }

        imagen3.setImage(HelloApplication.arrayPokemon.get(2).imagen);
        name3.setText(String.valueOf(HelloApplication.arrayPokemon.get(2).nombre));
        float restante3 = HelloApplication.arrayPokemon.get(2).vidaRestante;
        float vid3 = restante3 / HelloApplication.arrayPokemon.get(2).vida;
        vida3.setProgress(vid3);
        ps3.setText((int) HelloApplication.arrayPokemon.get(2).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(2).vida + " PS");
        nivel3.setText("NV " + HelloApplication.arrayPokemon.get(2).nivel);
        if (HelloApplication.arrayPokemon.get(2).sexo == 'm'){
            sexo3.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/masc.png").toURI().toString()));
        } else {
            sexo3.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/fem.png").toURI().toString()));
        }

        imagen4.setImage(HelloApplication.arrayPokemon.get(3).imagen);
        name4.setText(String.valueOf(HelloApplication.arrayPokemon.get(3).nombre));
        float restante4 = HelloApplication.arrayPokemon.get(3).vidaRestante;
        float vid4 = restante4 / HelloApplication.arrayPokemon.get(3).vida;
        vida4.setProgress(vid4);
        ps4.setText((int) HelloApplication.arrayPokemon.get(3).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(3).vida + " PS");
        nivel4.setText("NV " + HelloApplication.arrayPokemon.get(3).nivel);
        if (HelloApplication.arrayPokemon.get(3).sexo == 'm'){
            sexo4.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/masc.png").toURI().toString()));
        } else {
            sexo4.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/fem.png").toURI().toString()));
        }

        imagen5.setImage(HelloApplication.arrayPokemon.get(4).imagen);
        name5.setText(String.valueOf(HelloApplication.arrayPokemon.get(4).nombre));
        float restante5 = HelloApplication.arrayPokemon.get(4).vidaRestante;
        float vid5 = restante5 / HelloApplication.arrayPokemon.get(4).vida;
        vida5.setProgress(vid5);
        ps5.setText((int) HelloApplication.arrayPokemon.get(4).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(4).vida + " PS");
        nivel5.setText("NV " + HelloApplication.arrayPokemon.get(4).nivel);
        if (HelloApplication.arrayPokemon.get(4).sexo == 'm'){
            sexo5.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/masc.png").toURI().toString()));
        } else {
            sexo5.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/fem.png").toURI().toString()));
        }

        imagen6.setImage(HelloApplication.arrayPokemon.get(5).imagen);
        name6.setText(String.valueOf(HelloApplication.arrayPokemon.get(5).nombre));
        float restante6 = HelloApplication.arrayPokemon.get(5).vidaRestante;
        float vid6 = restante6 / HelloApplication.arrayPokemon.get(5).vida;
        vida6.setProgress(vid6);
        ps6.setText((int) HelloApplication.arrayPokemon.get(5).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(5).vida + " PS");
        nivel6.setText("NV " + HelloApplication.arrayPokemon.get(5).nivel);
        if (HelloApplication.arrayPokemon.get(5).sexo == 'm'){
            sexo6.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/masc.png").toURI().toString()));
        } else {
            sexo6.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/fem.png").toURI().toString()));
        }

    }

    @FXML
    public void seleccionar1() {
        deseleccionar();
        pokemonSeleccionado = 0;
        bpane1.setStyle("-fx-background-color:#1A62D1; -fx-border-color: black; -fx-border-width: 1;");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            elegirpokemon.setDisable(true);
            bpane1.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar2() {
        deseleccionar();
        pokemonSeleccionado = 1;
        bpane2.setStyle("-fx-background-color:#1A62D1; -fx-border-color: black; -fx-border-width: 1;");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            elegirpokemon.setDisable(true);
            bpane2.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar3() {
        deseleccionar();
        pokemonSeleccionado = 2;
        bpane3.setStyle("-fx-background-color:#1A62D1; -fx-border-color: black; -fx-border-width: 1;");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            elegirpokemon.setDisable(true);
            bpane3.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar4() {
        deseleccionar();
        pokemonSeleccionado = 3;
        bpane4.setStyle("-fx-background-color:#1A62D1; -fx-border-color: black; -fx-border-width: 1;");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            elegirpokemon.setDisable(true);
            bpane4.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar5() {
        deseleccionar();
        pokemonSeleccionado = 4;
        bpane5.setStyle("-fx-background-color:#1A62D1; -fx-border-color: black; -fx-border-width: 1;");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            elegirpokemon.setDisable(true);
            bpane5.setStyle("-fx-background-color:#C76955");
        }
    }

    @FXML
    public void seleccionar6() {
        deseleccionar();
        pokemonSeleccionado = 5;
        bpane6.setStyle("-fx-background-color:#1A62D1; -fx-border-color: black; -fx-border-width: 1;");
        pokemonMuertos();
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            elegirpokemon.setDisable(true);
            bpane6.setStyle("-fx-background-color:#C76955");
        }
    }

    public void deseleccionar() {
        elegirpokemon.setDisable(false);
        continuar.setDisable(false);
        pokedex.setDisable(false);
        bpane1.setStyle("-fx-background-color:#38D1F0");
        bpane2.setStyle("-fx-background-color:#38D1F0");
        bpane3.setStyle("-fx-background-color:#38D1F0");
        bpane4.setStyle("-fx-background-color:#38D1F0");
        bpane5.setStyle("-fx-background-color:#38D1F0");
        bpane6.setStyle("-fx-background-color:#38D1F0");
    }

    public void cambiarDePantalla(MouseEvent mouseEvent) {
        try {
            if (stage == null || !stage.isShowing()) {

                Node source1 = (Node) mouseEvent.getSource();
                Stage stage1 = (Stage) source1.getScene().getWindow();
                stage1.close();

                stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("combate-fxml.fxml"));
                AnchorPane root = loader.load();
                Scene scene = new Scene(root, 620, 350);
                stage.setTitle("POKEMON");
                stage.setResizable(false);
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
        ps1.setText((int) HelloApplication.arrayPokemon.get(0).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(0).vida + " PS");

        float restante2 = HelloApplication.arrayPokemon.get(1).vidaRestante;
        float vid2 = restante2 / HelloApplication.arrayPokemon.get(1).vida;
        vida2.setProgress(vid2);
        ps2.setText((int) HelloApplication.arrayPokemon.get(1).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(1).vida + " PS");


        float restante3 = HelloApplication.arrayPokemon.get(2).vidaRestante;
        float vid3 = restante3 / HelloApplication.arrayPokemon.get(2).vida;
        vida3.setProgress(vid3);
        ps3.setText((int) HelloApplication.arrayPokemon.get(2).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(2).vida + " PS");

        float restante4 = HelloApplication.arrayPokemon.get(3).vidaRestante;
        float vid4 = restante4 / HelloApplication.arrayPokemon.get(3).vida;
        vida4.setProgress(vid4);
        ps4.setText((int) HelloApplication.arrayPokemon.get(3).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(3).vida + " PS");

        float restante5 = HelloApplication.arrayPokemon.get(4).vidaRestante;
        float vid5 = restante5 / HelloApplication.arrayPokemon.get(4).vida;
        vida5.setProgress(vid5);
        ps5.setText((int) HelloApplication.arrayPokemon.get(4).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(4).vida + " PS");

        float restante6 = HelloApplication.arrayPokemon.get(5).vidaRestante;
        float vid6 = restante6 / HelloApplication.arrayPokemon.get(5).vida;
        vida6.setProgress(vid6);
        ps6.setText((int) HelloApplication.arrayPokemon.get(5).vidaRestante + " / " + (int) HelloApplication.arrayPokemon.get(5).vida + " PS");
    }

    public void mostrarGraficas(MouseEvent mouseEvent) {
        try {
            if (stage == null || !stage.isShowing()) {

                Node source1 = (Node) mouseEvent.getSource();
                Stage stage1 = (Stage) source1.getScene().getWindow();
                stage1.close();

                stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("graficas.fxml"));
                AnchorPane root = loader.load();
                Scene scene = new Scene(root, 600, 420);
                stage.setResizable(false);
                stage.setTitle("POKEMON");
                stage.setScene(scene);
                stage.show();
                v2 = loader.getController();
            }
            v2.enviarPokemon(pokemonSeleccionado);
            v2.generateChart();
            v2.setBarras();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pokedex(MouseEvent mouseEvent) {
        try {
            if (stage == null || !stage.isShowing()) {

                Node source2 = (Node) mouseEvent.getSource();
                Stage stage2 = (Stage) source2.getScene().getWindow();
                stage2.close();

                stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("pokedex.fxml"));
                AnchorPane root = loader.load();
                Scene scene = new Scene(root, 600, 400);
                stage.setTitle("POKEMON");
                stage.setResizable(false);
                stage.setScene(scene);
                stage.show();
                v3 = loader.getController();
            }
            v3.setPokedex(pokemonSeleccionado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
