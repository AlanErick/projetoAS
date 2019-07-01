package projeto_teste;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class Calculadora implements Observer {

    Observable formulas;

    double novaOperacao;

    public Calculadora(Observable formulas) {
        this.formulas = formulas;
        formulas.addObserver(this);
    }

    Calculadora() {
    }
    //aplicar o Singleton
    private static Calculadora instancia;

    public static synchronized Calculadora getInstanci() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    public static void criador() {
        //declarando as variaveis
        double primeiro, segundo;

        primeiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        segundo = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

        //instanciando o objeto
        Formulas resul = new Formulas();

        Formulas.Menu_operacao(resul, primeiro, segundo); //invocando o mentodo Extract Method                
    }

    @Override
    public void update(Observable formulasInfSubject, Object arg1) {
        if (formulasInfSubject instanceof Formulas) {
            Formulas formulas = (Formulas) formulasInfSubject;
            novaOperacao = formulas.soma(novaOperacao, novaOperacao);
            System.out.println("Informe: " + novaOperacao);
        }
    }
}
