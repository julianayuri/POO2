package fabricashapes;

public class ShapeFactory {
    
    public static Shape geraShape(String shape){
    
        Shape p;
        
        if(shape.equalsIgnoreCase("circle")){
            p = new Circle();
        }
        else{
            if(shape.equalsIgnoreCase("Square")){
                p = new Square();
            }
            else{
                p = new Triangle();
            }
        }
        return p;
    }
    
}
