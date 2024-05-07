package test;

class Display{
    static String type = "Display";
    private String name;
    
    Display(String name){
        this.name = name;
    }
    
    void setType(String typeInput){
        //type = typeInput; //alternatif 1
        //this.type =  typeInput; // alternatif 2
        Display.type = typeInput; // alternatif 3
    }
    
    void show(){
        System.out.println("Display name = "+ this.name);
    }
}

public class StaticClass {

    public static void main(String[] args) {
        Display display1 = new Display("Moniotr");
        display1.show();
        
        Display display2 = new Display("Smartphone");
        display2.show();
        
        //tampilkan static variable atau class variable
        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
        
        //kita coba mengganti variable staticnya
        Display.type = "tampilan";
        //display1.type = "tampilan";
        //display2.type = "tampilan";
        
        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        // kita coba mengganti variable staticnya
        // display2.setType("Monitor");
        display1.setType("Monitor");

        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
        
    }
    
    
}
