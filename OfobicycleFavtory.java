package designPattern;


public class OfobicycleFavtory implements Factory{
    
    @Override
    public Bicycle creatBicycle(String name) {
        // TODO Auto-generated method stub
        return new Ofobicycle(name);
    }
}
