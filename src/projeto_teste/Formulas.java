/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_teste;

/**
 *
 * @author AlanErick
 */
public class Formulas implements Numeros{

    // para singleton private static Formulas instancia;
    public Numeros referencia;
    public int primeiro;
    public int segundo;
    private int resultado;

    public Formulas(int primeiro, int segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    //TODO: Inserção do padrão Singleton, para que o objeto formula, seja craido uma vez para cada utilização

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    int soma(int x, int y) {
        return (this.resultado = x + y);
    }
    
    int sub(int x, int y){
        return (this.resultado = x - y);
    }
    
    int div(int x, int y){
        return (this.resultado = x / y);
    }
    
    int mult(int x, int y){
        return (this.resultado = x * y);
    }
}
