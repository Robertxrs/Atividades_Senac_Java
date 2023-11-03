/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ed;

import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Venda {
    private int idVenda;
    private String cliente;
    private double descontoGeral;
    private ArrayList<ItensVenda> itens;
    
    public Venda(){
        itens = new ArrayList<ItensVenda>();
        descontoGeral = 0;
 
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;      
    }
    public void adcionarItens(ItensVenda item){
        itens.add(item);
    }
    public void setCliente(String c){
       this.cliente = c;
    }
    public void setDescontoGeral(double d){
        this.descontoGeral = d;
    }
    public void finalizarVenda(){
        System.out.println("Dados de Venda");
        System.out.println("Cliente: "+cliente);
        System.out.println("Itens da venda ");
        
        
        double valorFinal = 0;
        double valor= 0;
        
        for(ItensVenda item : itens){
            System.out.println(item.getRemedio().getMedicamento()+ " Q:" +item.getQuantidade()+" V:"+item.getRemedio().getValorUnitario()+" T:"+item.totalItem());
            valorFinal = valorFinal + item.totalItem();
        }
        System.out.println("Total da venda: "+valorFinal);
        if (descontoGeral > 0) {
            System.out.println("Desconto: "+ descontoGeral);
            valor = valorFinal - descontoGeral;
            System.out.println("Valor Final: "+ valor);
        }
    }
}


