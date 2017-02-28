package revisao.ex3;
import java.util.ArrayList;

public class Edificio {

    private ArrayList <Andar> edificio;
    
    public Edificio(){
	edificio = new ArrayList<Andar>();
    }
    
    public void setAndar(Andar a){
	edificio.add(a);
    }
    
    public void numAndar(){
	edificio.size();
    }
    public Andar getAndar(int n){
	return(edificio.get(n));
    }   
    
      public static void main(String[] args)
    {

    }
}
