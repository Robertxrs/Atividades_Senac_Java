/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
public class Teste {

    public static void main(String[] args) {
       Vendedor vend1 = new Vendedor("Joao",1000,10);
       Vendedor vend2 = new Vendedor("Carlos",900,10);
       Administrativo admin1 = new Administrativo("Maria",1500,"Contadora");
       Administrativo admin2 = new Administrativo("ana",1500,"Analista");
       
       
       vend1.aplicaAumento(200);
       vend1.exibeDados();
       
       Funcionario obj1 = new Vendedor("Ricardo",20000,15);
       
       Funcionario[] lista = new Funcionario[5];
       lista[0] = vend1;
       lista[1] = vend2;
       lista[2] = admin1;
       lista[3] = admin2;
       lista[4] = new Administrativo("Rodrigo",2400,"Dev Junior");
       
       
       for(int i=0; i < lista.length; i++){
            lista[i].gerarBonificacaoNatalina();
            
            lista[i].exibeDados();
          
       }
    }
}
    

