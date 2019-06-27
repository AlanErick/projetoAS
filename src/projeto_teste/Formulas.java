package projeto_teste;

import java.awt.HeadlessException;
import java.util.Observable;
import javax.swing.JOptionPane;

public class Formulas extends Observable{

    //refatoração move Extract Method
    static void Menu_operacao(Formulas resul, double primeiro, double segundo) throws NumberFormatException, HeadlessException {
        int opc;
        //declaração da variavel e/ou constantes int ops
        do {
            //chamada do módulo procedimento Menu
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opera\u00e7\u00e3o:\n\n\n" 
                    + "\n1 = Soma.\n2 = Subtra\u00e7\u00e3o.\n3 = Divis\u00e3o.\n4 = Multiplica\u00e7\u00e3o."
                    + "\n5 = Digitar outros números.\n0= Sair do programa."));

            switch (opc) {
                //declaração do módulo procedimento Menu
                case 1:
                    double resultado_soma = resul.soma(primeiro, segundo); // chamada do modulo funçao Soma
                    JOptionPane.showMessageDialog(null, "A soma \u00e9: " + resultado_soma); //saída do resultado soma
                    break;
                case 2:
                    double resultado_sub = resul.sub(primeiro, segundo); //chamada do modulo funçao subtraçao
                    JOptionPane.showMessageDialog(null, "A subtra\u00e7\u00e3o \u00e9: " + resultado_sub); //saída do resultado sutração
                    break;
                case 3:
                    double resultado_div = resul.div(primeiro, segundo); //chamada do modulo funçao divivão
                    JOptionPane.showMessageDialog(null, "A dvis\u00e3o \u00e9: " + resultado_div); //saída do resultado divisão
                    break;
                case 4:
                    double resultado_mult = resul.mult(primeiro, segundo); //chamada do modulo funçao multiplicação
                    JOptionPane.showMessageDialog(null, "A multiplica\u00e7\u00e3o \u00e9: " + resultado_mult); //saída do resultado multimplicação
                    break;
                case 5:
                    primeiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                    segundo = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Fim do Programa!!! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Op\u00e7\u00e3o inv\u00e1lida."); //saída de resultado
                    break;
            }
        } while (opc != 0); //fim do programa do
    }//fim do refatoração move Extract Method2

    public double soma(double primeiro, double segundo) {
        double resultado = primeiro + segundo;
        return resultado;
    }

    public double sub(double primeiro, double segundo) {
        double resultado = primeiro - segundo;
        return resultado;
    }

    public double div(double primeiro, double segundo) {
        double resultado = primeiro / segundo;
        return resultado;
    }

    public double mult(double primeiro, double segundo) {
        double resultado = primeiro * segundo;
        return resultado;
    }
}
