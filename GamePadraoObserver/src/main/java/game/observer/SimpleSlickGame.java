package game.observer;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import java.io.*;
import java.util.ArrayList;

public class SimpleSlickGame extends BasicGame {
    private int timeCount = 0;    
    private Image land;
    private Policia policia1;
    private Policia policia2;
    private Policia policia3;
    private Image gameover;
    PersonagemAutonomo personagem;
    Heroi heroi;

    public SimpleSlickGame(String gamename) {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        
        try {
            ArrayList<String> comandos = new ArrayList();
            comandos.add("Frente");
            comandos.add("Esquerda");
            comandos.add("Esquerda");
            comandos.add("Frente");                
            personagem = new PersonagemAutonomo(comandos);
            
            
            File file = new File(".");
            String filePath = file.getCanonicalPath();
            
            land = new Image(filePath + "\\src\\main\\java\\bg.png");
            heroi = new Heroi(filePath + "\\src\\main\\java\\carro1.png", 200, 200);
            policia1 = new Policia(filePath + "\\src\\main\\java\\policia.png", 600, 0);
            policia2 = new Policia( filePath + "\\src\\main\\java\\policia.png", 0, 400);
            policia3 = new Policia(filePath + "\\src\\main\\java\\policia.png", 400, 400);
            gameover = new Image(filePath + "\\src\\main\\java\\gameover.png");
            
            heroi.addMonitores(policia1);
            heroi.addMonitores(policia2);
            heroi.addMonitores(policia3);

            ControleColisao controleColisao = new ControleColisao(gc);
            heroi.addMonitores(controleColisao);            
            policia1.addMonitores(controleColisao);
            policia2.addMonitores(controleColisao);
            policia3.addMonitores(controleColisao);
            
           
            
        } catch (IOException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        g.drawImage(land, 0, 0);
        heroi.render();
        policia2.render();
        policia3.render();
        policia1.render();  
        
        if(gc.isPaused())
            gameover.draw(200,200);
                
        
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
            appgc.setDisplayMode(640, 480, false);            
            appgc.start();
        } catch (SlickException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {        
        if(!gc.isPaused()){
            /*
        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_UP))
            this.heroi.setPosY(this.heroi.getPosY() - 1);        
        if (input.isKeyDown(Input.KEY_DOWN)) 
            this.heroi.setPosY(this.heroi.getPosY() + 1);        
        if (input.isKeyDown(Input.KEY_LEFT)) 
            this.heroi.setPosX(this.heroi.getPosX() - 1);        
        if (input.isKeyDown(Input.KEY_RIGHT))
            this.heroi.setPosX(this.heroi.getPosX() + 1);      */  
        timeCount++;
        if (timeCount % 100 == 0){ 
            heroi.notificarTodos();                    
            policia1.notificarTodos();
            policia2.notificarTodos();
            policia3.notificarTodos();
            heroi.acceptVisitor(personagem);
        }
        }
        
        
    }
    
    
}
