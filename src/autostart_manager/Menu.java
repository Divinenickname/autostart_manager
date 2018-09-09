/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

import autostart_manager.command.Command;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author user
 */
public class Menu {
    HashMap<String, Command> commands = new HashMap<String, Command>();
    
    public void addItem(MenuItem item){
        commands.put(item.getName(), item.getCommand());
    }
    
    public void showItems(){
        Set<String> set = commands.keySet();
        System.out.println(set.toString());
    }
        
    
    public void run(String exitcommand){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        
        while(!line.equals(exitcommand)){
            try{
                line = br.readLine();
                if(commands.containsKey(line)){
                    commands.get(line).execute();
                }
                else{
                    System.out.println("No such command");
                }
            }
            catch(IOException e){
                System.err.println(e);
            }
        }
        
        
    }
    
    
}
