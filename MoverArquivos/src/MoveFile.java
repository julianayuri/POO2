
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class MoveFile implements Runnable {

    private static File listaFiles[] = null;
    String threadName;
    private ArrayList lst;
    
    public MoveFile(String threadName, ArrayList lst)
   {
      this.threadName = threadName;
      this.lst = lst;
   } 
    
    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {        
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\origem");
            listaFiles = file.listFiles();                      
        }
        return listaFiles;        
    }
    
   
    public static void copyFile(File sourceFile, File destFile) throws IOException {

        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }
    }
    
    @Override
    public void run()
   {
        try {
            final long startTime = System.currentTimeMillis();// tempo incial
            listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles
            System.out.println("Iniciando copiar de arquivos");
            
            for(int i = getPos(); i < listaFiles.length; i = getPos()) {
                try {
                    File origem = new File(listaFiles[i].getAbsolutePath());
                    String destinationFile = listaFiles[i].getAbsolutePath();
                    destinationFile = destinationFile.replace("origem", "destino");
                    copyFile(origem, new File(destinationFile));
                } catch (IOException ex) {
                    Logger.getLogger(MoveFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
            System.out.println("Time:" + elapsedTimeMillis);
        } catch (IOException ex) {
            Logger.getLogger(MoveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    public synchronized int getPos(){
        synchronized (lst){
            int pos = (int) this.lst.get(0);
            lst.add(0,pos+1);
            return pos;
        }
    }
    
    public static void main(String args[]) throws IOException, InterruptedException {
        ArrayList lst = new ArrayList();
        lst.add(0);
        Runnable runUUID1 = new MoveFile("Thread1", lst);
        Thread thread1 = new Thread(runUUID1);      
        thread1.start();

        Runnable runUUID2 = new MoveFile("Thread2", lst);
        Thread thread2 = new Thread(runUUID2);      
        thread2.start();

    }
    
    

   
}
