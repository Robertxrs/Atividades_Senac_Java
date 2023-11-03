
package abstrata;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(String cliente){
        super(cliente);
    }
    
    @Override
    public void deposita(double valor){
        saldo = saldo + valor;
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("Imprimindo conta corrente");
        System.out.println("Cliente: "+cliente);
        System.out.println("Saldo: "+saldo);
    }
    
}
