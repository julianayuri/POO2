package fabricapizza;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza pedido;
   
        pedido = PizzaFactory.geraPizza("fabricapizza.Clam");
        pedido.prepere();
        pedido.bake();
        pedido.cut();
        pedido.box();
        
        
    }
    
}
