package com.example.pokemonbueno;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    public static ArrayList<Pokemon> arrayPokemon = new ArrayList<>();
    @Override
    public void start(Stage stage) throws IOException {

        Pokemon p1 = new Pokemon("Scyther", 47, 162, 123, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/e/ee/latest/20200716062847/Scyther_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/5/50/latest/20140122175710/Scyther_espalda_G6.gif"));
        Pokemon p2 = new Pokemon("Charizard", 98, 200, 190, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/a7/latest/20200102060755/Charizard_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/2/26/latest/20150321003543/Charizard_espalda_G6.gif"));
        Pokemon p3 = new Pokemon("Blastoise", 87, 151, 140, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/a/ae/latest/20200308135900/Blastoise_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/d/d8/latest/20140111220000/Blastoise_espalda_G6.gif"));
        Pokemon p4 = new Pokemon("Growlithe", 36, 179, 160, new Image("https://images.wikidexcdn.net/mwuploads/wikidex/1/1b/latest/20200103042604/Growlithe_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/0/0a/latest/20150321173530/Growlithe_espalda_G6.gif"));
        Pokemon p5 = new Pokemon("Gengar", 10, 101, 98,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/7/78/latest/20200103022222/Gengar_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/1/1d/latest/20140112111022/Gengar_espalda_G6.gif"));
        Pokemon p6 = new Pokemon("Mewtwo", 60, 150, 0,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/2/29/latest/20200308144638/Mewtwo_EpEc.gif"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/6/64/latest/20150315013816/Mewtwo_espalda_G6.gif")) ;

        arrayPokemon.add(p1);
        arrayPokemon.add(p2);
        arrayPokemon.add(p3);
        arrayPokemon.add(p4);
        arrayPokemon.add(p5);
        arrayPokemon.add(p6);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 480);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}