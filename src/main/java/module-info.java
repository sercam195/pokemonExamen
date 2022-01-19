module com.example.pokemonbueno {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.pokemonbueno to javafx.fxml;
    exports com.example.pokemonbueno;
}