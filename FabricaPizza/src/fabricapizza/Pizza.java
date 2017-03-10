package fabricapizza;

public abstract class Pizza {
    
    public void bake(){ System.out.println("Assando a Pizza");}
    public void prepere(){System.out.print("Farinha, sal, agua, ");}
    public void cut(){System.out.println("Cortada!");}
    public abstract void box();
    
    
}
