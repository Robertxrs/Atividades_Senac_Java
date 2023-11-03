/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
public abstract class Funcionario {
    
    protected String nome;
    protected float salario;
    
    public Funcionario(String n, float s){
        this.nome = n;
        this.salario=s;
    }
    public void aplicaAumento(float v){
        this.salario+=v;
    }
    public void exibeDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
    public abstract void gerarBonificacaoNatalina();
    
}
