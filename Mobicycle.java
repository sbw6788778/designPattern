package designPattern;


public class Mobicycle implements Bicycle {
    private String name ;
    
    public Mobicycle(String name) {
        // TODO Auto-generated constructor stub
          this.name=name;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }
}
