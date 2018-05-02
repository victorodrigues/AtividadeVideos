/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 03358365263
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txtNumero1, txtNumero2, txtResultado;
    
    @FXML
    private Button btnsoma, btnsub, btnmult, btndiv;
    
    @FXML
    private void Somar(ActionEvent event) {
        Double n1 = Double.parseDouble(txtNumero1.getText());
        Double n2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = n1 + n2;
        
        txtResultado.setText(resultado.toString());
    }
    
        @FXML
    private void Subtrair(ActionEvent event) {
        Double n1 = Double.parseDouble(txtNumero1.getText());
        Double n2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = n1 - n2;
        
        txtResultado.setText(resultado.toString());
    }
    
        @FXML
    private void Multiplicar(ActionEvent event) {
        Double n1 = Double.parseDouble(txtNumero1.getText());
        Double n2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = n1 * n2;
        
        txtResultado.setText(resultado.toString());
    }
    
        @FXML
    private void Dividir(ActionEvent event) {
        Double n1 = Double.parseDouble(txtNumero1.getText());
        Double n2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = n1 / n2;
        
        txtResultado.setText(resultado.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
