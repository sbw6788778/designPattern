package Observer;


public class TestObserver {
    public static void main(String[] args) {
        WeatherStation w=new WeatherStation();
        w.registerObserver(new Bowshi());
        w.registerObserver(new Kk());
        w.notifyObserver();
        w.w=WeatherType.RAINY;
        w.notifyObserver();
    }
}
