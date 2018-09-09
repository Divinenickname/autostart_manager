/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

import java.io.*;


/**
 *
 * @author user
 */

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        //DEV BRANCH
        //getAutostartList();

        //TEST MENU REWRITE AFTER        
        String cmd="";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Menu menu = new Menu();
        
        menu.run("exit");
        
        /*while(!cmd.equals("exit")){
            try{
            cmd = bufferedReader.readLine();

            switch (cmd){
                case "list":
                    Manager.getAutostartList();
                    break;

                case "del":
                    Manager.deleteApp();
                    break;

                case "add":
                    Manager.addApp();
                    break;
                    
                case "help":
                    System.out.println("HELP");
                    break;
            }
        }
            catch(IOException e){
                System.out.println(e);
            }
        }*/
    }
}
