/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrata;

/**
 *
 * @author rober
 */
abstract class Conta {
    protected double saldo;
    protected String cliente;

    public Conta(double saldo, String cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta(String cliente) {
        this.cliente = cliente;
    }
    
    
    
    public abstract void deposita(double valor);
    
    public abstract void imprimirExtrato();
}
