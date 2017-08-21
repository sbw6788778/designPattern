package Observer;

import java.util.ArrayList;
import java.util.List;


public class WeatherStation implements Weather{
    public WeatherType w=WeatherType.SUNNY;
    List<Observer> list=new ArrayList<Observer>();
    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        for(Observer o:list){
            o.update(w);
        }
    }@Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        list.add(o);
        
    }@Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        list.remove(o);
    }
}
