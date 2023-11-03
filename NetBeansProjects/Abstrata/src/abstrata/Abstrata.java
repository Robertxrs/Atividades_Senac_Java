/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstrata;

/**
 *
 * @author rober
 */
public class Abstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaCorrente c = new ContaCorrente("Keven");
        c.deposita(1200);
        c.imprimirExtrato();
        
        Conta[] lista = new Conta[2];
        lista[0] = c;
        lista[1] = new ContaCorrente("carlos");
        lista[1].deposita(3000);
        
        for(int i=0; i<lista.length; i++){
            lista[i].imprimirExtrato();
        
        }       
    }  
}
