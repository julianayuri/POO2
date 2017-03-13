package fabricabebida;

/**
 *
 * @author Juliana Yuri
 */

public class FabricaBebida {

    public static Bebida geraBebida (String classe){
        Bebida p;
        
        Object ClasseReflection = null;
        
        try {
            ClasseReflection = Class.forName(classe).newInstance();
        }
        catch(InstantiationException | ClassNotFoundException | IllegalAccessException e){e.printStackTrace();}
       
        p = (Bebida) ClasseReflection;
        return p;
    }
    
    
    public static void main(String[] args) {
        Bebida b;
        
        b = FabricaBebida.geraBebida("fabricabebida.Refrigerante");
        b.entornar();
    }
    
}
