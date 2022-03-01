package com.example.pokemonbueno;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
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
    @FXML
    Label curar;
    @FXML
    BorderPane menu;
    @FXML
    Label nombrePokemon;
    @FXML
    Label nivelPokemon;
    @FXML
    Label nivelEnemy;
    @FXML
    Label vidaNumPokemon;
    @FXML
    Label vidaNumEnemy;
    @FXML
    Label nombreEnemy;
    @FXML
    Label ataqueSeguro;
    @FXML
    Label ataqueArriesgado;
    @FXML
    Label ataqueMuyArriesgado;

    private HelloController controllerVentana1;
    float vidEnemigo;
    float restanteAliado;
    float vidAliado;
    int pokemonSeleccionado;
    int pokemonSeleccionadoEnemigo;
    Random random = new Random();
    ButtonType elegirPokemon = new ButtonType("ELEGIR POKEMON", ButtonBar.ButtonData.FINISH);
    ButtonType salir = new ButtonType("SALIR DEL JUEGO", ButtonBar.ButtonData.CANCEL_CLOSE);

    public void enviarPokemon(int pokemonSeleccionado) {
        this.pokemonSeleccionado = pokemonSeleccionado;
        HelloApplication.arrayPokemon.get(pokemonSeleccionado).seleccionado++;
        curar.setDisable(false);
        atacar.setVisible(true);
        curar.setVisible(true);
        enemigoRandom();
        establecerVida();
        establecerInterfazPokemons();
        ataques.setVisible(false);
    }

    public void atacar(MouseEvent mouseEvent) {
        ataques.setVisible(true);
        curar.setVisible(false);
        atacar.setVisible(false);
    }

    public void cancelar(MouseEvent mouseEvent) {
        ataques.setVisible(false);
        menu.setVisible(true);
        if (HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante == 0) {
            curar.setDisable(true);
        }
        atacar.setVisible(true);
        curar.setVisible(true);
    }

    public void ataqueSeguro(MouseEvent mouseEvent) throws IOException {
        ataque(20, 20, mouseEvent);
    }

    public void enemigoRandom() {
        pokemonSeleccionadoEnemigo = random.nextInt(HelloApplication.arrayEnemigos.size());
    }

    public void establecerVida() {
        vidEnemigo = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante / HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
        restanteAliado = HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante;
        vidAliado = restanteAliado / HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida;
    }

    public void establecerInterfazPokemons() {
        vidaPokemon.setProgress(vidAliado);
        vidaNumPokemon.setText("PS");
        nivelPokemon.setText("NV " + HelloApplication.arrayPokemon.get(pokemonSeleccionado).nivel);
        nivelEnemy.setText("NV " + HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).nivel);
        nombreEnemy.setText(HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).nombre);
        nombrePokemon.setText(HelloApplication.arrayPokemon.get(pokemonSeleccionado).nombre);
        vidaNumEnemy.setText("PS");
        vidaEnemy.setProgress(vidEnemigo);
        pokemonAliado.setImage(HelloApplication.arrayPokemon.get(pokemonSeleccionado).espalda);
        fondo.setImage(new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/batalla.png").toURI().toString()));
        pokemonEnemigo.setImage(HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).imagen);
    }

    public void enviarController1(HelloController controllerVentana1) {
        this.controllerVentana1 = controllerVentana1;
    }

    public void ataque(int dañoAliado, int dañoEnemigo, MouseEvent event) throws IOException {
        if (!((HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante - dañoEnemigo) <= 0 || restanteAliado - dañoAliado <= 0)) {

            //Enemigo
            HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRealizado = HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRealizado + dañoEnemigo;
            HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante - dañoEnemigo;
            vidEnemigo = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante / HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
            vidaEnemy.setProgress(vidEnemigo);

            //Aliado
            restanteAliado = restanteAliado - dañoAliado;
            HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRecibido = HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRecibido + dañoAliado;
            HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante = restanteAliado;
            vidAliado = restanteAliado / HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida;
            vidaPokemon.setProgress(vidAliado);

            controllerVentana1.actualizarVida();
            controllerVentana1.pokemonMuertos();

        } else {
            if ((HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante - dañoEnemigo) <= 0) {
                HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRealizado = (int) (HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRealizado + HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante);
                HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante = 0;
                vidEnemigo = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante / HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
                vidaEnemy.setProgress(vidEnemigo);
                controllerVentana1.actualizarVida();
                controllerVentana1.pokemonMuertos();
                ImageView imageView = new ImageView(HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).imagen);
                String pokemonEnemigo = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).nombre.toUpperCase();
                HelloApplication.arrayEnemigos.remove(pokemonSeleccionadoEnemigo);

                if (HelloApplication.arrayEnemigos.size() > 0) {
                    int muertos = 0;
                    for (int i = 0; i < HelloApplication.arrayPokemon.size(); i++) {
                        if (HelloApplication.arrayPokemon.get(i).vidaRestante == 0) {
                            muertos++;
                        }
                    }
                    Alert customAlert = new Alert(Alert.AlertType.NONE);
                    customAlert.setTitle("POKEMON");
                    if (muertos == 5) {
                        customAlert.setHeaderText("EL " + pokemonEnemigo + " ENEMIGO SE HA DEBILITADO, ¡SOLO TE QUEDA UN POKEMON!");
                        imageView.setFitWidth(200);
                        imageView.setFitHeight(200);
                        customAlert.setResizable(true);
                        customAlert.setGraphic(imageView);
                        customAlert.getDialogPane().setBorder(createBorder());
                        ButtonType continuar = new ButtonType("CONTINUAR CON " + HelloApplication.arrayPokemon.get(pokemonSeleccionado).nombre.toUpperCase(), ButtonBar.ButtonData.CANCEL_CLOSE);
                        customAlert.getDialogPane().getButtonTypes().addAll(salir, continuar);
                    } else {
                        customAlert.setHeaderText("EL " + pokemonEnemigo + " ENEMIGO SE HA DEBILITADO");
                        imageView.setFitWidth(200);
                        imageView.setFitHeight(200);
                        customAlert.setResizable(true);
                        customAlert.setGraphic(imageView);
                        customAlert.getDialogPane().setBorder(createBorder());
                        ButtonType continuar = new ButtonType("CONTINUAR CON " + HelloApplication.arrayPokemon.get(pokemonSeleccionado).nombre.toUpperCase(), ButtonBar.ButtonData.CANCEL_CLOSE);
                        customAlert.getDialogPane().getButtonTypes().addAll(salir, elegirPokemon, continuar);
                    }
                    showAlert(customAlert, event);
                } else {
                    Alert customAlert = new Alert(Alert.AlertType.NONE);
                    customAlert.setTitle("POKEMON");
                    ImageView imageView1 = new ImageView(new File("src/main/java/com/example/pokemonbueno/imagenes/pikachuContento.gif").toURI().toString());
                    imageView1.setFitWidth(200);
                    imageView1.setFitHeight(150);
                    customAlert.setGraphic(imageView1);
                    customAlert.getDialogPane().setBorder(createBorder());
                    customAlert.setHeaderText("HAS GANADO EL COMBATE!");
                    customAlert.getDialogPane().getButtonTypes().addAll(salir);
                    showAlert(customAlert, event);
                }
            } else {

                HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante - dañoEnemigo;
                HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRecibido = (int) (HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRecibido + HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante);
                vidEnemigo = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante / HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
                vidaEnemy.setProgress(vidEnemigo);
                restanteAliado = 0;
                HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante = restanteAliado;
                vidAliado = restanteAliado / HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida;
                vidaPokemon.setProgress(vidAliado);
                controllerVentana1.actualizarVida();
                controllerVentana1.pokemonMuertos();
                int muertos = 0;
                for (int i = 0; i < HelloApplication.arrayPokemon.size(); i++) {
                    if (HelloApplication.arrayPokemon.get(i).vidaRestante == 0) {
                        muertos++;
                    }
                }
                if (muertos < 6) {
                    Alert customAlert = new Alert(Alert.AlertType.NONE);
                    customAlert.setTitle("POKEMON");
                    customAlert.setHeaderText("TU " + HelloApplication.arrayPokemon.get(pokemonSeleccionado).nombre.toUpperCase() + " SE HA DEBILITADO");
                    ImageView imageView = new ImageView(HelloApplication.arrayPokemon.get(pokemonSeleccionado).imagen);
                    imageView.setFitWidth(200);
                    imageView.setFitHeight(200);
                    customAlert.setResizable(true);
                    customAlert.setGraphic(imageView);
                    customAlert.getDialogPane().setBorder(createBorder());
                    customAlert.getDialogPane().getButtonTypes().addAll(salir, elegirPokemon);
                    showAlert(customAlert, event);
                } else {
                    Alert customAlert = new Alert(Alert.AlertType.NONE);
                    customAlert.setTitle("POKEMON");
                    ImageView imageView = new ImageView(new File("src/main/java/com/example/pokemonbueno/imagenes/pikachuTriste.gif").toURI().toString());
                    imageView.setFitWidth(200);
                    imageView.setFitHeight(150);
                    customAlert.setResizable(true);
                    customAlert.setGraphic(imageView);
                    customAlert.setHeaderText("HAS PERDIDO EL COMBATE!");

                    customAlert.getDialogPane().setBorder(createBorder());
                    customAlert.getDialogPane().getButtonTypes().addAll(salir);
                    showAlert(customAlert, event);
                }
            }
        }
    }

    public void ataqueArriesgado(MouseEvent mouseEvent) throws IOException {
        ataque(random.nextInt(25 - 10) + 10, random.nextInt(25 - 10) + 10, mouseEvent);
    }

    public void ataqueMuyArriesgado(MouseEvent mouseEvent) throws IOException {
        ataque(random.nextInt(51), random.nextInt(51), mouseEvent);
    }

    public void curarse(MouseEvent mouseEvent) {
        int cura = random.nextInt(75 - 25) + 25;
        restanteAliado = restanteAliado + cura;
        HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante = restanteAliado;
        vidAliado = restanteAliado / HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida;
        vidaPokemon.setProgress(vidAliado);

        cura = random.nextInt(75 - 25) + 25;
        HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante + cura;
        vidEnemigo = HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante / HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida;
        vidaEnemy.setProgress(vidEnemigo);

        controllerVentana1.actualizarVida();
        controllerVentana1.pokemonMuertos();
    }

    private void showAlert(Alert alert, Event event) throws IOException {
        Optional<ButtonType> resultado = alert.showAndWait();
        if (resultado.isEmpty()) {
            System.exit(0);
        } else if (resultado.get() == elegirPokemon) {
            Node source1 = (Node) event.getSource();
            Stage stage1 = (Stage) source1.getScene().getWindow();
            stage1.close();

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 738, 472);
            stage.setResizable(false);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } else if (resultado.get() == salir) {
            System.exit(0);
        } else {
            HelloApplication.arrayPokemon.get(pokemonSeleccionado).seleccionado++;
            curar.setDisable(false);
            menu.setVisible(true);
            atacar.setVisible(true);
            curar.setVisible(true);
            enemigoRandom();
            establecerVida();
            establecerInterfazPokemons();
            ataques.setVisible(false);
        }
    }

    private static Border createBorder() {
        return new Border(new BorderStroke(Color.ROYALBLUE, BorderStrokeStyle.SOLID,
                null, new BorderWidths(10)));
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        vidaNumPokemon.setStyle("-fx-font-size:11");
        vidaNumPokemon.setText((int) HelloApplication.arrayPokemon.get(pokemonSeleccionado).vidaRestante + "/" + (int) HelloApplication.arrayPokemon.get(pokemonSeleccionado).vida);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        vidaNumPokemon.setText("PS");
        vidaNumPokemon.setStyle("-fx-font-size:12");
    }

    public void mouseEnteredEnemy(MouseEvent mouseEvent) {
        vidaNumEnemy.setStyle("-fx-font-size:11");
        vidaNumEnemy.setText((int) HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vidaRestante + "/" + (int) HelloApplication.arrayEnemigos.get(pokemonSeleccionadoEnemigo).vida);
    }

    public void mouseExitedEnemy(MouseEvent mouseEvent) {
        vidaNumEnemy.setText("PS");
        vidaNumEnemy.setStyle("-fx-font-size:12");
    }

    public void pulsarSeguro(MouseEvent mouseEvent) {
        pulsacion(ataqueSeguro);
    }

    public void despulsarSeguro(MouseEvent mouseEvent) {
        desPulsacion(ataqueSeguro);
    }

    public void pulsarArriesgado(MouseEvent mouseEvent) {
        pulsacion(ataqueArriesgado);
    }

    public void despulsarArriesgado(MouseEvent mouseEvent) {
        desPulsacion(ataqueArriesgado);
    }

    public void pulsarMuyArriesgado(MouseEvent mouseEvent) {
        pulsacion(ataqueMuyArriesgado);
    }

    public void despulsarMuyArriesgado(MouseEvent mouseEvent) {
        desPulsacion(ataqueMuyArriesgado);
    }

    public void despulsarCancelar(MouseEvent mouseEvent) {
        desPulsacion(cancelar);
    }

    public void pulsarCancelar(MouseEvent mouseEvent) {
        pulsacion(cancelar);
    }

    public void pulsarCurar(MouseEvent mouseEvent) {
        pulsacion(curar);

    }

    public void despulsarCurar(MouseEvent mouseEvent) {
        desPulsacion(curar);
    }

    public void pulsarAtacar(MouseEvent mouseEvent) {
        pulsacion(atacar);

    }

    public void despulsarAtacar(MouseEvent mouseEvent) {
        desPulsacion(atacar);
    }

    public void pulsacion(Label label) {
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(0.6);
        label.setEffect(colorAdjust);
    }

    public void desPulsacion(Label label) {
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(0);
        label.setEffect(colorAdjust);
    }
}