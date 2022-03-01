package com.example.pokemonbueno;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class Graficas {
    int pokemonSeleccionado;

    @FXML
    PieChart pieChart;
    @FXML
    BarChart barras;
    @FXML
    Label poke;
    @FXML
    CategoryAxis x;
    @FXML
    NumberAxis y;

    public void generateChart() {
        ObservableList<Data> list = FXCollections.observableArrayList(
                new PieChart.Data("Daño realizado "+HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRealizado, HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRealizado),
                new PieChart.Data("Daño recibido "+HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRecibido, HelloApplication.arrayPokemon.get(pokemonSeleccionado).dañoRecibido)
        );
        pieChart.setData(list);
    }

    public void enviarPokemon(int pokemonSeleccionado) {
        this.pokemonSeleccionado = pokemonSeleccionado;
        poke.setText(HelloApplication.arrayPokemon.get(pokemonSeleccionado).nombre);
    }

    public void setBarras() {
        XYChart.Series pokemon1 = new XYChart.Series<>();
        pokemon1.setName(HelloApplication.arrayPokemon.get(0).nombre);
        pokemon1.getData().add(new XYChart.Data("", HelloApplication.arrayPokemon.get(0).seleccionado));
        barras.getData().addAll(pokemon1);

        XYChart.Series pokemon2 = new XYChart.Series<>();
        pokemon2.setName(HelloApplication.arrayPokemon.get(1).nombre);
        pokemon2.getData().add(new XYChart.Data("", HelloApplication.arrayPokemon.get(1).seleccionado));
        barras.getData().addAll(pokemon2);

        XYChart.Series pokemon3 = new XYChart.Series<>();
        pokemon3.setName(HelloApplication.arrayPokemon.get(2).nombre);
        pokemon3.getData().add(new XYChart.Data("", HelloApplication.arrayPokemon.get(2).seleccionado));
        barras.getData().addAll(pokemon3);

        XYChart.Series pokemon4 = new XYChart.Series<>();
        pokemon4.setName(HelloApplication.arrayPokemon.get(3).nombre);
        pokemon4.getData().add(new XYChart.Data("", HelloApplication.arrayPokemon.get(3).seleccionado));
        barras.getData().addAll(pokemon4);

        XYChart.Series pokemon5 = new XYChart.Series<>();
        pokemon5.setName(HelloApplication.arrayPokemon.get(4).nombre);
        pokemon5.getData().add(new XYChart.Data("", HelloApplication.arrayPokemon.get(4).seleccionado));
        barras.getData().addAll(pokemon5);

        XYChart.Series pokemon6 = new XYChart.Series<>();
        pokemon6.setName(HelloApplication.arrayPokemon.get(5).nombre);
        pokemon6.getData().add(new XYChart.Data("", HelloApplication.arrayPokemon.get(5).seleccionado));
        barras.getData().addAll(pokemon6);
    }


    public void volver(MouseEvent mouseEvent) throws IOException {
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
