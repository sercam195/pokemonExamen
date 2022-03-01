package com.example.pokemonbueno;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    public static ArrayList<Pokemon> arrayPokemon = new ArrayList<>();
    public static ArrayList<Pokemon> arrayEnemigos = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {

        Pokemon p1 = new Pokemon("Scyther", 47, 162, 123, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Scyther_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Scyther_espalda_G6.gif").toURI().toString()), 0, 0, 0,'m');
        Pokemon p2 = new Pokemon("Charizard", 98, 200, 190, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Charizard_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Charizard_espalda_G6.gif").toURI().toString()), 0, 0, 0,'m');
        Pokemon p3 = new Pokemon("Blastoise", 87, 151, 140, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Blastoise_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Blastoise_espalda_G6.gif").toURI().toString()), 0, 0, 0,'f');
        Pokemon p4 = new Pokemon("Growlithe", 36, 179, 160, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Growlithe_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Growlithe_espalda_G6.gif").toURI().toString()), 0, 0, 0,'f');
        Pokemon p5 = new Pokemon("Gengar", 10, 101, 98, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Gengar_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Gengar_espalda_G6.gif").toURI().toString()), 0, 0, 0,'f');
        Pokemon p6 = new Pokemon("Mewtwo", 60, 150, 0, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Mewtwo_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Mewtwo_espalda_G6.gif").toURI().toString()), 0, 0, 0,'m');

        Pokemon e1 = new Pokemon("Drapion", 47, 200, 100, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Drapion_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Scyther_espalda_G6.gif").toURI().toString()), 0, 0, 0,'f');
        Pokemon e2 = new Pokemon("Glaceon", 98, 200, 180, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Glaceon_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Charizard_espalda_G6.gif").toURI().toString()), 0, 0, 0,'f');
        Pokemon e3 = new Pokemon("Articuno", 87, 151, 140, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Articuno_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Blastoise_espalda_G6.gif").toURI().toString()), 0, 0, 0,'m');
        Pokemon e4 = new Pokemon("Corphish", 36, 179, 160, new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Corphish_EpEc.gif").toURI().toString()), new Image(new File("src/main/java/com/example/pokemonbueno/imagenes/Growlithe_espalda_G6.gif").toURI().toString()), 0, 0, 0,'m');

        arrayEnemigos.add(e1);
        arrayEnemigos.add(e2);
        arrayEnemigos.add(e3);
        arrayEnemigos.add(e4);

        arrayPokemon.add(p1);
        arrayPokemon.add(p2);
        arrayPokemon.add(p3);
        arrayPokemon.add(p4);
        arrayPokemon.add(p5);
        arrayPokemon.add(p6);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 738, 472);
        stage.setTitle("POKEMON");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}