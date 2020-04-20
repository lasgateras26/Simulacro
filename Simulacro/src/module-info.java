module Simulacro {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    exports com.alberto;
    exports com.alberto.logic;
    exports com.alberto.views;
    exports com.alberto.models;

    opens com.alberto.views to javafx.fxml;
}