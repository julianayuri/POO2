package revisao.ex2;

public class ContaBancaria {

    private int numero;
    private String dataAbertura;
    private float saldo;
    
    public ContaBancaria(){
        saldo = 0;
    }
    
    public void debitar(float x){
        if (x <= saldo){
            saldo-= x;
        }
    }
    public void creditar(float x){
        saldo+= x;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float x){
        saldo = x;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int x){
        numero = x;
    }
    
    public String getDAb(){
        return dataAbertura;
    }
    public void setDAb(String x){
        dataAbertura = x;
    }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
