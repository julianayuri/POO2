package cafe.dominio;

public abstract class Cafe {
   
    
    String description = "Festa Desconhecida";
          
    
    public String getDescription() {
        return description;
    }
     
     public Cafe() {              
    }

    public abstract double cost();
}
