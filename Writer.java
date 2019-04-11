package web_hacking;

import java.util.Formatter;

public class Writer {
    
    private Formatter x;
    
    public void openFile(String name){
        try{
            x=new Formatter(name);
        }catch(Exception e){
            
        }
    }
    public void Write(String text){
        x.format("%s",text);
    }
    public void closeFile(){
        x.close();
    }
    
}
