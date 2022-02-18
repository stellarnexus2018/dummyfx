module com.example.dummyfx {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;

  opens com.example.dummyfx to javafx.fxml;
  exports com.example.dummyfx;
}