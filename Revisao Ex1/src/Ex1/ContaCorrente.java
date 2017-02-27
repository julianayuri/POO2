package Ex1;

/**
 * @author Juliana Yuri
 */

public class ContaCorrente extends Conta implements Tributavel{
    
    @Override
    public double calculaTributos()
    { 
        return getSaldo()*0.1;
    }
    
}
