module dk.easv.extendedcalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.extendedcalc to javafx.fxml;
    exports dk.easv.extendedcalc;
}