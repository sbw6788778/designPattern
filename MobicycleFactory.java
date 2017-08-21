package designPattern;


public class MobicycleFactory implements Factory{
    
    @Override
    public Bicycle creatBicycle(String name) {
        // TODO Auto-generated method stub
        return new Mobicycle(name);
    }
}
