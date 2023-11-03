/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package site;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author rober
 */
public class Navegacao {
    Stack<Site>sites;
    
    public Navegacao(){
        sites = new Stack<Site>();
    }
    
    public void executa(){
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        
        while(!opcao.equals("x")){
            System.out.println("Digite: n-nova url / v- voltar / x-sair");
             opcao = entrada.nextLine();  
            switch(opcao){
                case "n":
                    Site novoSite = new Site();
                    novoSite.nome = entrada.nextLine();
                    novoSite.url = entrada.nextLine();
                    sites.push(novoSite);
                    System.out.println("Acessando: "+sites.peek().url);
                    break;
                
                case  "v":
                if (!sites.empty()) {
                    Site siteRetirado, siteAtual;
                    siteRetirado = sites.pop();
                    System.out.println("Saindo de : "+siteRetirado.url);
                        
                    if (!sites.empty()) {
                        siteAtual = sites.peek();
                        System.out.println("Acessando: "+siteAtual.url);  
                    }
                }else{
                        System.out.println("Historico vazio");
                }

            }
        }
    }
           
    
    
    
}
