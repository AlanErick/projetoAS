package projeto_teste;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class Calculadora implements Observer {

    /*public void Soma() {
        System.out.println("Soma");
    }

    public void sub() {
        System.out.println("Subitração");
    }

    public void div() {
        System.out.println("Divisão");
    }

    public void mult() {
        System.out.println("Multiplicação");
    }*/
    Observable formulas;
    
    double novaOperacao;
    
    public Calculadora(Observable formulas) {
        this.formulas = formulas;
        formulas.addObserver(this);
    }
    
    @Override
    public void update(Observable formulasInfSubject, Object arg1) {
        if (formulasInfSubject instanceof Formulas) {
            Formulas formulas = (Formulas) formulasInfSubject;
            novaOperacao = formulas.soma(novaOperacao, novaOperacao);
            System.out.println("Informe: " + novaOperacao);
        }
    }   
    
    
   /* @Override
    public void update(Observable arg0, Object arg1) {
        Formulas formulasObservadas = (Formulas) arg0;
        String acao = String.valueOf(args1);

        if (acao.equals("Somar")) {
            this.Soma();
        }

        if (acao.equals("Subtrair")) {
            this.sub();
        }

        if (acao.equals("Divisão")) {
            this.div();
        }

        if (acao.equals("Multiplicação")) {
            this.mult();
        }

    }*/

    private Calculadora() {
    }
    //aplicar o Singleton
    private static Calculadora instancia;

    public static synchronized Calculadora getInstanci() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    public static void main(String[] args) {
        //declarando as variaveis
        double primeiro, segundo;

        primeiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        segundo = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

        //instanciando o objeto
        Formulas resul = new Formulas();

        Formulas.Menu_operacao(resul, primeiro, segundo); //invocando o mentodo Extract Method                
    }
}
