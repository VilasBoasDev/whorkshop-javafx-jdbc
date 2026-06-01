module workshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;  // ← ADICIONAR ISSO!
    
    opens gui to javafx.fxml;
    opens application to javafx.fxml;
    opens model.entities to javafx.base;
    
    exports application;
}