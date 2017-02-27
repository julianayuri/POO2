package revisao.ex2;

public class ContaCorrente extends ContaBancaria {
    
    private float limiteSaque;
    
    public float getLimite(){
        return limiteSaque;
    }
    public void setLimite(float x){
        limiteSaque = x;
    }
}
