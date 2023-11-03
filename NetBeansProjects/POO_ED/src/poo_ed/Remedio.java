/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ed;

/**
 *
 * @author rober
 */
public class Remedio {
    private String medicamento;
    private int quantidade;
    private double valorUnitario;

    public Remedio(String medicamento, int quantidade, double valorUnitario) {
        this.medicamento = medicamento;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public void exibe(){
        System.out.println("Medicamento: "+medicamento);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("valor Unitario: "+valorUnitario);
    }
    
    
    
    
}
