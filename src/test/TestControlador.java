package test;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controlador.Controlador;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import controlador.Controlador;

public class TestControlador {

    private Controlador miControlador;

    @BeforeAll
    public static void initJFX() {
        new JFXPanel(); // sirve para inicializar javafx
    }

    @BeforeEach
    public void setUp() {
        miControlador = new Controlador();

        miControlador.setNombre(new TextField());
        miControlador.setApellido1(new TextField());
        miControlador.setApellido2(new TextField());
        miControlador.setEmpresa(new TextField());
        miControlador.setEmail(new TextField());
        miControlador.setAcompanantes(new TextField());
        miControlador.setObservaciones(new TextField());
    }

    @Test
    public void camposCorrectos() {
        miControlador.getNombre().setText("Daniel");
        miControlador.getApellido1().setText("Fernández");
        miControlador.getApellido2().setText("Campos");
        miControlador.getEmpresa().setText("Cesur");
        miControlador.getEmail().setText("dan@cesur.es");
        miControlador.getAcompanantes().setText("12");
        miControlador.getObservaciones().setText("el campo está relleno.");

        miControlador.comprobarCampos(new ActionEvent());

        assertTrue(
                miControlador.getNombre().getStyle().equals("-fx-background-color: turquoise"));
        assertTrue(
                miControlador.getApellido1().getStyle().equals("-fx-background-color: turquoise"));
        assertTrue(
                miControlador.getApellido2().getStyle().equals("-fx-background-color: turquoise"));
        assertTrue(
                miControlador.getEmail().getStyle().equals("-fx-background-color: turquoise"));
        assertTrue(
                miControlador.getEmpresa().getStyle().equals("-fx-background-color: turquoise"));
        assertTrue(
                miControlador.getAcompanantes().getStyle().equals("-fx-background-color: turquoise"));
        assertTrue(
                miControlador.getObservaciones().getStyle().equals("-fx-background-color: turquoise"));
    }

    @Test
    public void camposIncorrectos() {
        miControlador.getNombre().setText("");
        miControlador.getApellido1().setText("");
        miControlador.getApellido2().setText("");
        miControlador.getEmpresa().setText("");
        miControlador.getEmail().setText("dancesures");
        miControlador.getAcompanantes().setText("");
        miControlador.getObservaciones().setText("");

        miControlador.comprobarCampos(new ActionEvent());

        assertTrue(
                miControlador.getNombre().getStyle().equals("-fx-background-color: salmon"));
        assertTrue(
                miControlador.getApellido1().getStyle().equals("-fx-background-color: salmon"));
        assertTrue(
                miControlador.getApellido2().getStyle().equals("-fx-background-color: salmon"));
        assertTrue(
                miControlador.getEmail().getStyle().equals("-fx-background-color: salmon"));
        assertTrue(
                miControlador.getEmpresa().getStyle().equals("-fx-background-color: salmon"));
        assertTrue(
                miControlador.getAcompanantes().getStyle().equals("-fx-background-color: salmon"));
        assertTrue(
                miControlador.getObservaciones().getStyle().equals("-fx-background-color: salmon"));
    }
}
