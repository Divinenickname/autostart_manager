/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostart_manager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author user
 */

public class Main {
    enum menu {add, del, exit, list};

    public static void main(String[] args) {
        // TODO code application logic here
        //getAutostartList();

        //TEST MENU REWRITE AFTER        
        String cmd="";
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        while(!cmd.equals("exit")){
            try{
            cmd = bufferedReader.readLine();
            
            switch (cmd){
                case "list":
                    getAutostartList();
                    break;

                case "del":
                    deleteApp();
                    break;

                case "add":
                    addApp();
                    break;
                    
                case "help":
                    System.out.println("HELP");
                    break;
            }
        }
            catch(IOException e){
                System.out.println(e);
            }
        }
    }
    
    private static String getHome(){
        String homedir = System.getProperty("user.home")+"/.config/autostart";
        return homedir;
    }

    private static String getAppPath(String appName){
        String path;
        path = getHome()+ "/" + appName+ ".desktop";
        return path;
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
    
    public static void deleteApp(){
        String name;
                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Enter Program name");
            name = br.readLine();
            
            String appName = name+".desktop";
            File file = new File(getHome() + "/" + appName);
            
            if(file.exists()){
                System.out.println("Do you really want to delete " + appName + "?");
                System.out.println("Y/n?");
            
                String line = br.readLine();
            
                if('y' == line.charAt(0) || 'Y' == line.charAt(0)){
                    file.delete();
                    System.out.println("File deleted");
                } 
        }
            else{
                System.out.println(appName + " doesn't exists");
            }
        
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        
    }
    
    public static void addApp(){
        String name, type, exec;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Enter application name");
            name = br.readLine();
            System.out.println("Enter application type");
            type = br.readLine();
            System.out.println("Enter exec");
            exec = br.readLine();
            
            String s = "[Desktop Entry]\n" +
                "Name=" + name + "\n" +
                "Type=" + type + "\n" +
                "Exec=" + exec + "\n";
            
            Path path = Paths.get(getAppPath(name));
            File file = new File(getAppPath(name));
            
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(s);
            fw.close();
            System.out.println(name+".desktop created");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
