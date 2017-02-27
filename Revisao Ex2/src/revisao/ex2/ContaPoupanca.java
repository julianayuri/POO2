package revisao.ex2;

public class ContaPoupanca extends ContaBancaria {
    private float rendimento;
    private String dataAniversario;
    
    public String getDAn(){
        return dataAniversario;
    }
    public void setDAn(String x){
        dataAniversario = x;
    }
    
    public float getRendimento(){
        return rendimento;
    }
    public void setRendimento(float x){
        rendimento = x;
    }
}
