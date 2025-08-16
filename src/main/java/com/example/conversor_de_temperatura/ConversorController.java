package com.example.conversor_de_temperatura;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConversorController {

    @FXML private ComboBox<String> combo_de;
    @FXML private ComboBox<String> combo_para;
    @FXML private TextField conversao_entrada;
    @FXML private TextField conversao_saida;

    @FXML
    private void initialize(){
        combo_de.getItems().addAll("Celsius","Kelvin", "Fahrenheit");
        combo_para.getItems().addAll("Celsius","Kelvin", "Fahrenheit");

    }

    @FXML
    private void calcular(){
        //valueof converte String para Double
        Double valor = Double.valueOf(conversao_entrada.getText());

        String de = combo_de.getValue();
        String para = combo_para.getValue();

        if (de.equals("Celsius")){
            switch (para) {
                case "Celsius" -> conversao_saida.setText(String.format("%.2f", valor));
                case "Kelvin" -> conversao_saida.setText(String.format("%.2f", valor + 273.15));
                case "Fahrenheit" -> conversao_saida.setText(String.format("%.2f", valor * 9 / 5 + 32));
            }
        }

        if (de.equals("Kelvin")){
            switch (para) {
                case "Kelvin" -> conversao_saida.setText(String.format("%.2f", valor));
                case "Celsius" -> conversao_saida.setText(String.format("%.2f", valor - 273.15));
                case "Fahrenheit" -> conversao_saida.setText(String.format("%.2f", ((valor - 273.15) * 9 / 5 + 32)));
            }
        }

        if (de.equals("Fahrenheit")){
            switch (para) {
                case "Fahrenheit" -> conversao_saida.setText(String.format("%.2f", valor));
                case "Celsius" -> conversao_saida.setText(String.format("%.2f", (valor - 32) * 5 / 9));
                case "Kelvin" -> conversao_saida.setText(String.format("%.2f", (valor - 32) + 5 / 9 + 273.15));
            }
        }
    }

    @FXML
    private void limpar(){
        conversao_entrada.setText(null);
        conversao_saida.setText(null);
    }

}