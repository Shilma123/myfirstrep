module com.example.shilma_git {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.example.shilma_git to javafx.fxml;
    exports com.example.shilma_git;
}