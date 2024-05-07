package test;

import java.util.ArrayList;

class Player{
    
    private static int numberPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();
    
    private String name;
    
    Player(String name){
        this.name = name;
        Player.numberPlayer++;
        Player.nameList.add(this.name);
    }
    
    void show(){
        System.out.println("Player name= " + this.name);
    }
    
    //static method
    static void showNumber(){
        System.out.println("Number of Player = "  + Player.numberPlayer);
    }
    
    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("All Mighty");
        Player player3 = new Player("Midnight");
        Player player4 = new Player("Mt Lady");
        
       Player.showNumber();
       
        System.out.println("Name = " + Player.getNames());
        //System.out.println("Names = " + player1.getNames());// ini bisa dilakukan
    }
}
