/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager.command;

import autostart_manager.Manager;

/**
 *
 * @author Alexander
 */
public class Add implements Command{

    @Override
    public void execute() {
        Manager.addApp();
    }
    
}
