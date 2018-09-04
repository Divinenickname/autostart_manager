/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Menu {
    public ArrayList menu = new ArrayList();
    
    public void addCmd(String cmd){
        menu.add(cmd);
    }
    public void delCmd(String cmd){
        if(menu.contains(cmd)){
            menu.remove(cmd);
        }
        else{
            System.out.println("No such command");
        }
    }
    
    
}
