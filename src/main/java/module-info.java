module com.ccasais.vhbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ccasais.vhbox to javafx.fxml;
    exports com.ccasais.vhbox;
}