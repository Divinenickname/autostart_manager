/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

/**
 *
 * @author Александр
 */
public class Item {
    String name;
    Item(String name){
        add(name);
    }

    public void add(String name){
        this.name = name;
    }
    
    public void toDo(){
    }
}
