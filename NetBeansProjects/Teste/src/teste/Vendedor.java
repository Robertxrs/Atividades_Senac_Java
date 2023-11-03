/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author rober
 */
public class Vendedor extends Funcionario{
    private float comissao;
    
    public Vendedor(String n, float s, float comissao) {
        super(n, s);
        this.comissao=comissao;
    }
    
    @Override
    public void gerarBonificacaoNatalina(){
        salario = salario * 1.2f;
    }
    
    public void exibeDados(){
        System.out.println("------------");
        System.out.println("Dados do Vendedor");
        System.out.println("nome "+nome);
        System.out.println("Salario "+salario);
        System.out.println("comissao "+comissao);
    }
}
