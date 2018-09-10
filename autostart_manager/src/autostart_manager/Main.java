/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

import autostart_manager.command.*;


/**
 *
 * @author user
 */

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        //MASTER BRANCH

        MenuItem list = new MenuItem("list", new List());
        MenuItem add = new MenuItem("add", new Add());
        MenuItem delete = new MenuItem("del", new Delete());

        Menu menu = new Menu();
        menu.addItem(list);
        menu.addItem(add);
        menu.addItem(delete);
        
        menu.showItems();
        
        menu.run("exit");       
    }
}
