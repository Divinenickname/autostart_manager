/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager.commands;

import autostart_manager.Manager;

/**
 *
 * @author user
 */
public class ListCommand implements Command{
    public void execute(){
        Manager.getAutostartList();
    }
    
}
