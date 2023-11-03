/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package site;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Historico {
     Queue<Site>sites;
     public Historico(){
         sites = new LinkedList<Site>();
     }
     
     public void executa(){
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        
        while(continuar.equals("s")){
            Site novoSite = new Site();
            System.out.println("Digite o nome e o url");
             novoSite.nome = entrada.nextLine();
             novoSite.url = entrada.nextLine();
             
             sites.add(novoSite);
             if(sites.size()>3){
                 Site removido = sites.remove();
                 System.out.println("Site "+removido.url+" foi removido");
             }
                System.out.println("Continuar(s/n)");
                continuar = entrada.nextLine();
        }
 
     }      
         
}
