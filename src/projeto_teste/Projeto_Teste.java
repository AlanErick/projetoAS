
package projeto_teste;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Projeto_Teste {
    
    public static void main(String[] args){     
        //declarando as variaveis
        double primeiro, segundo;
        int opc;
        
            
            primeiro= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));       
            segundo=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                
        //instanciando o objeto
        Formulas resul = new Formulas();
        
        Menu_operacao(resul, primeiro, segundo); //invocando o mentodo Extract Method
        
        
        
    } //fim do main
    
    //refatoração move Extract Method
    private static void Menu_operacao(Formulas resul, double primeiro, double segundo) throws NumberFormatException, HeadlessException {
        int opc;
        //declaração da variavel e/ou constantes int ops
        do{
            
            //chamada do módulo procedimento Menu
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação:\n\n\n"
                    + "\n1 = Soma.\n2 = Subtração.\n3 = Divisão.\n4 = Multiplicação.\n0= Sair do programa."));
            
            
            switch (opc){ //declaração do módulo procedimento Menu
                case 1: 
                    double resultado_soma = resul.soma(primeiro, segundo); // chamada do modulo funçao Soma
                    JOptionPane.showMessageDialog(null, "A soma é: "+resultado_soma); //saída do resultado soma
                    break;
                    
                case 2: 
                    double resultado_sub = resul.sub(primeiro, segundo); //chamada do modulo funçao subtraçao
                    JOptionPane.showMessageDialog(null,"A subtração é: "+resultado_sub); //saída do resultado sutração
                    break;
                    
                case 3: 
                    double resultado_div = resul.div(primeiro, segundo); //chamada do modulo funçao divivão
                    JOptionPane.showMessageDialog(null,"A dvisão é: "+resultado_div); //saída do resultado divisão
                    break;
                    
                case 4: 
                    double resultado_mult = resul.mult(primeiro, segundo); //chamada do modulo funçao multiplicação
                    JOptionPane.showMessageDialog(null,"A multiplicação é: "+resultado_mult); //saída do resultado multimplicação
                    break;
                    
                case 0:                   
                    JOptionPane.showMessageDialog(null,"Obrigado pela preferência.");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida."); //saída de resultado
                    break;
                    
            }
            
        }  while(opc != 0);  //fim do programa do 
    }

} //fim do main
