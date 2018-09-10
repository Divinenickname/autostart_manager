/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

import autostart_manager.command.Command;

/**
 *
 * @author Alexander
 */
public class MenuItem{
    protected String name;
    protected Command command;
    
    public MenuItem(String name, Command command){
        setCommand(command);
        setName(name);
    }
    
    public void setCommand(Command command){
        this.command = command;
    }
    
    public Command getCommand(){
        return this.command;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

}
