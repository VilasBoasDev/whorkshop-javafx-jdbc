module workshop {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
    
    opens gui to javafx.fxml;
    opens application to javafx.fxml;
    
    exports application;
}