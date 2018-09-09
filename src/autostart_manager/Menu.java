/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

import autostart_manager.commands.Command;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author user
 */
public class Menu {
    List<Command> commands = new ArrayList<>();
        
    
    public void run(String exitcommand){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        
        while(!line.equals(exitcommand)){
            try{
            line = br.readLine();
            
            
            switch(line){
                case "list":
                    Manager.getAutostartList();
                    break;
            }
            
            }
            catch(IOException e){
                System.err.println(e);
            }
        }
        
        
    }
    
    
}
