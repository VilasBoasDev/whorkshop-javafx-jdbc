module workshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    
    opens gui to javafx.fxml;
    opens application to javafx.fxml;
    opens model.entities to javafx.base;  // ← NOVO! Para o TableView funcionar
    
    exports application;
}