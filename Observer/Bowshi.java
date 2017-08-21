package Observer;


public class Bowshi implements Observer{
    WeatherType weatherType;
    @Override
    public void update(WeatherType w) {
        // TODO Auto-generated method stub
     weatherType=w;
     System.out.println("sbw recived the updata message:"+w);
    }
}
