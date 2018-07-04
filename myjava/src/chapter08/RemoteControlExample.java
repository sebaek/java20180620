package chapter08;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
        
        rc.turnOff();
        rc.turnOn();
        
        rc = new RemoteControl() {
            
            @Override
            public void turnOn() {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void turnOff() {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void setVolume(int volume) {
                // TODO Auto-generated method stub
                
            }
        };
        
        
        RemoteControl r = new SmartTelevision();
        r.turnOff();
        r.turnOn();
        r.setVolume(2);
//        r.search("");
        
        Searchable s = new SmartTelevision();
        s.search("");
//        s.turnOn();
        
    }
}










