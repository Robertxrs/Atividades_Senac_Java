/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ed;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author rober
 */
public class POO_ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String>cegonha = new Stack<String>();
        
        cegonha.push("carro 1");
        cegonha.push("carro 2");
        cegonha.push("carro 3");
        cegonha.push("carro 4");
        
        //System.out.println(cegonha);
       // System.out.println(cegonha.peek());
        //cegonha.pop();
       // System.out.println(cegonha);
      //  System.out.println(cegonha.peek());
      //  System.out.println(cegonha.search("carro 3"));
        
        //Queue<String> fila = new LinkedList<String>();
        /*Deque<String>fila = new LinkedList<String>();
        fila.add("Pessoa 1");
        fila.add("Pessoa 2");
        fila.add("Pessoa 3");
        fila.add("Pessoa 4");
        fila.add("Pessoa 5");
        System.out.println(fila);
        
        fila.addFirst("Pessoa 6");
        System.out.println(fila);
        */
        
        Remedio r1 = new Remedio("Dipirona",10,40.50);
        Remedio r2 = new Remedio("Paracetamol",40,60.40);
        Remedio r3 = new Remedio("Tilenol",1,14.30);

       /* ArrayList<Remedio> lista = new ArrayList<Remedio>();
        
        lista.add(0, r3);
        lista.add(1, r1);
        lista.add(2, r2);

        for(Remedio obj : lista){
            System.out.println(obj.getMedicamento());
            System.out.println(obj.getQuantidade());
            System.out.println(obj.getValorUnitario());
        }
        */
        Venda v1 = new Venda();
        v1.setCliente("Pedro");
        v1.setDescontoGeral(10);
        v1.adcionarItens(new ItensVenda(r1,2));
        v1.adcionarItens(new ItensVenda(r2,1));
        
        v1.finalizarVenda();
        
    }
    
}
