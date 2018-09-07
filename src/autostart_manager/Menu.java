package autostart_manager;

import java.io.BufferedReader;
import java.io.IOException;

public class Menu {
    String cmd = "";
    String[] items = {"help"};
    
    Menu(BufferedReader bufferedReader){
        while (!cmd.equals("exit")){
            try{
                cmd = bufferedReader.readLine();
                if(items[0].equals(cmd)){
                    System.out.println("HELP");
                }
            }
            catch(IOException e){
                System.err.println(e);
            }
        }
    }
    /**
    *
    **/
    public void addItem(Object object, String name){
        
        

    }

    public void help(){
        System.out.println("HELP opopopopo");
    }

}
