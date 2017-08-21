package Observer;


public class Kk implements Observer{
    WeatherType w;
    @Override
    public void update(WeatherType w) {
        // TODO Auto-generated method stub
        this.w=w;
        System.out.println("kk recived the updata message:"+w);
    }
}
