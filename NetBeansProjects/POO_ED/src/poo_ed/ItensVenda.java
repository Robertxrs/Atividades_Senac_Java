/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ed;

/**
 *
 * @author rober
 */
public class ItensVenda {
    private Remedio remedio;
    private int quantidade;
    
    public ItensVenda(Remedio remedio, int quantidade){
        this.remedio = remedio;
        this.quantidade = quantidade;
    }
    
    public double totalItem(){
        return quantidade * remedio.getValorUnitario();
    }
    
    
    public Remedio getRemedio() {
        return remedio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
