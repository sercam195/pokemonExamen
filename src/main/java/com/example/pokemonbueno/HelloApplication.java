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
    @Override
    public void start(Stage stage) throws IOException {

        Pokemon p1 = new Pokemon("Scyther", 47, 162, 20, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/e/ee/latest/20200716062847/Scyther_EpEc.gif"));
        Pokemon p2 = new Pokemon("Charizard", 98, 200, 20, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/a7/latest/20200102060755/Charizard_EpEc.gif"));
        Pokemon p3 = new Pokemon("Blastoise", 87, 151, 20, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/ae/latest/20200308135900/Blastoise_EpEc.gif"));
        Pokemon p4 = new Pokemon("Growlithe", 36, 179, 20, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/1/1b/latest/20200103042604/Growlithe_EpEc.gif"));
        Pokemon p5 = new Pokemon("Gengar", 10, 101, 20,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/7/78/latest/20200103022222/Gengar_EpEc.gif"));
        Pokemon p6 = new Pokemon("Mewtwo", 60, 73, 20,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/2/29/latest/20200308144638/Mewtwo_EpEc.gif")) ;

        arrayPokemon.add(p1);
        arrayPokemon.add(p2);
        arrayPokemon.add(p3);
        arrayPokemon.add(p4);
        arrayPokemon.add(p5);
        arrayPokemon.add(p6);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}