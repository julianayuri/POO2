package fabricapizza;

public class PizzaFactory {
    public static Pizza geraPizza(String classe){
        Pizza p;
        
        Object ClasseReflection = null;
        
        try {
            ClasseReflection = Class.forName(classe).newInstance();
        }
        catch(InstantiationException | ClassNotFoundException | IllegalAccessException e){e.printStackTrace();}
       
        p = (Pizza) ClasseReflection;
        return p;
 
    }
}
