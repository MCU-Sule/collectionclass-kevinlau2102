module com.collectionclass.pt02_2072030 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.collectionclass.pt02_2072030 to javafx.fxml;
    exports com.collectionclass.pt02_2072030;
    exports com.collectionclass.pt02_2072030.model;
    opens com.collectionclass.pt02_2072030.model to javafx.fxml;
}