package fabricashapes;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        
        Shape p = ShapeFactory.geraShape("triangle");
        p.draw();
    }
    
}
