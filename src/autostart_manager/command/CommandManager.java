/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Alexander
 */
public class CommandManager {
    HashMap<String, Command> commands = new HashMap();
    
    public void register(String name, Command command){
        commands.put(name, command);
    }
    
    public void getCommand(String name){
        commands.get(name).execute();
    }
    
}
