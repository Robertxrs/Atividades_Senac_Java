/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package site;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rober
 */
public class Favoritos {
    List<Site> sites;
    
    public Favoritos(){
        sites = new ArrayList<Site>();
    }
    public void mostraFavoritos(){
        System.out.println("Lista de Favoritos:");
        for(Site s : sites){
            System.out.println(s.nome+ " ("+s.url+") ");
        }
    
    }
    public void executa(){
        sites.add(new Site("Site 1 ","www.um.com"));
        sites.add(new Site("Site 2 ","www.dois.com"));
        sites.add(new Site("Site 3 ","www.tres.com"));
        mostraFavoritos();
        
        sites.remove(1);
        sites.add(new Site("Site 4 ","www.quatro.com"));
        mostraFavoritos();
    }
    
}
