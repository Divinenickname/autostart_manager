/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart.manager;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AutostartManager {

    public static void main(String[] args) {
        // TODO code application logic here
        //getAutostartList();
        deleteApp("planks");
        //new COMMIT 21312312
    }
    
    private static String getHome(){
        String homedir = System.getProperty("user.home")+"/.config/autostart";
        return homedir;
    }
    
    public static void getAutostartList(){
        String[] list;
        File dir = new File(System.getProperty(
                "user.home") + "/.config/autostart");
        if(dir.isDirectory()){
            list = dir.list();
            for(String s: list){
                System.out.println(s);
            }
        }
        else{
            System.out.println("Can't find directory");
        }
    }
    
    public static void deleteApp(String name){
        String appName = name+".desktop";
        File file = new File(getHome() + "/" + appName);
        if(file.exists()){
            System.out.println("Do you really want to delete " + appName + "?");
            System.out.println("Y/n?");
            
            Scanner sc = new Scanner(System.in);
            String line = sc.next();
            
            if('y' == line.charAt(0) || 'Y' == line.charAt(0)){
                file.delete();
                System.out.println("File deleted");
                
            } 
        }
        else{
            System.out.println(appName + " doesn't exists");
        }
    }
    
    public static void editApp(String name){
        
    }
    
}
