module com.zeronthirty.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zeronthirty.demo to javafx.fxml;
    exports com.zeronthirty.demo;
}