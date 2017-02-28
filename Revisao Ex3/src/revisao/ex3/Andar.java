package revisao.ex3;

import java.util.ArrayList;

public class Andar {
    private ArrayList <Sala> andar;
    
    public Andar(){
	andar = new ArrayList<Sala>();
    }
    
    public void setSala(Sala a){
	andar.add(a);
    }
    
    public void numSala(){
	andar.size();
    }
    public Sala getSala(int n){
	return(andar.get(n));
    }
}
