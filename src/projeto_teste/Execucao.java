/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_teste;
import java.util.*;
import javax.swing.*; //Biblioteca para interface gráfica.

/**
 *
 * @author AlanErick
 */
public class Execucao {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")); //Mostra uma Janela para receber os dados
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
        int resultado = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + resultado);//Painel com resultado
    }
}
