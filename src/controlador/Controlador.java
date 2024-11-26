package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlador implements Initializable {
    @FXML
    Button botonCheck;

    @FXML
    private TextField nombre;

    @FXML
    private TextField apellido1;

    @FXML
    private TextField apellido2;

    @FXML
    private TextField empresa;

    @FXML
    private TextField email;

    @FXML
    private TextField acompanantes;

    @FXML
    private TextField observaciones;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        botonCheck.setOnAction(this::comprobarCampos);
    }

    public void comprobarCampos(ActionEvent evento) {
        comprobarCampo(nombre);
        comprobarCampo(apellido1);
        comprobarCampo(apellido2);
        comprobarCampo(empresa);
        comprobarCampo(acompanantes);
        comprobarCampo(observaciones);

        comprobarEmail();
    }

    private void comprobarCampo(TextField campo) {

        if (campo.getText().equals("")) {
            campo.setStyle("-fx-background-color: salmon");
        } else {
            campo.setStyle("-fx-background-color: turquoise");
        }
    }

    private void comprobarEmail(){
        String patronCorrecto = ".+@.+\\.es$";
        
        Pattern patron = Pattern.compile(patronCorrecto);
        Matcher matcher = patron.matcher(email.getText());

        if (matcher.matches()){
            email.setStyle("-fx-background-color: turquoise");
        } else {
            email.setStyle("-fx-background-color: salmon");
        }
    }

    public Button getBotonCheck() {
        return botonCheck;
    }

    public void setBotonCheck(Button botonCheck) {
        this.botonCheck = botonCheck;
    }

    public TextField getNombre() {
        return nombre;
    }

    public void setNombre(TextField nombre) {
        this.nombre = nombre;
    }

    public TextField getApellido1() {
        return apellido1;
    }

    public void setApellido1(TextField apellido1) {
        this.apellido1 = apellido1;
    }

    public TextField getApellido2() {
        return apellido2;
    }

    public void setApellido2(TextField apellido2) {
        this.apellido2 = apellido2;
    }

    public TextField getEmpresa() {
        return empresa;
    }

    public void setEmpresa(TextField empresa) {
        this.empresa = empresa;
    }

    public TextField getEmail() {
        return email;
    }

    public void setEmail(TextField email) {
        this.email = email;
    }

    public TextField getAcompanantes() {
        return acompanantes;
    }

    public void setAcompanantes(TextField acompanantes) {
        this.acompanantes = acompanantes;
    }

    public TextField getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(TextField observaciones) {
        this.observaciones = observaciones;
    }
}
