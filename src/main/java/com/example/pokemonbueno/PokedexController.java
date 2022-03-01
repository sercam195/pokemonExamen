package com.example.pokemonbueno;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class PokedexController {

    @FXML
    ImageView imagen;
    @FXML
    Label desc;
    @FXML
    ImageView ev1;
    @FXML
    ImageView ev2;
    @FXML
    Button boton;

    public void setPokedex(int pokemonSeleccionado) {
        imagen.setImage(HelloApplication.arrayPokemon.get(pokemonSeleccionado).imagen);
        ev1.setImage(HelloApplication.arrayPokemon.get(pokemonSeleccionado).imagen);
        ev2.setImage(HelloApplication.arrayPokemon.get(pokemonSeleccionado).espalda);
        desc.setText("Pokemon "+HelloApplication.arrayPokemon.get(pokemonSeleccionado).nombre+" tiene género "+HelloApplication.arrayPokemon.get(pokemonSeleccionado).sexo);
    }

    public void volv(MouseEvent mouseEvent) throws IOException {
        Node source1 = (Node) mouseEvent.getSource();
        Stage stage1 = (Stage) source1.getScene().getWindow();
        stage1.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 738, 472);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
