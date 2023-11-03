/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author rober
 */
public class Administrativo extends Funcionario {
        private String cargo;

    public Administrativo(String n, float s,String cargo) {
        super(n,s);
        this.cargo =cargo;
    }
    
    @Override
    public void gerarBonificacaoNatalina(){
        salario = salario * 1.3f;
    }
    
    public void exibeDados(){
        System.out.println("------------");
        System.out.println("Dados do Administrativo");
        System.out.println("nome "+nome);
        System.out.println("Salario "+salario);
        System.out.println("Cargo "+cargo);
    }
}
