package designPattern;


public class Singleton {
    
    private Singleton() {
    }
    private static Singleton test=new Singleton();
    //the only way to get the object ,using static to do 
    public static Singleton getInstant(){
        return test;
    }
}
