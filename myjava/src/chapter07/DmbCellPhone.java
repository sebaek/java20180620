package chapter07;

public class DmbCellPhone extends CellPhone {
    int channel;
    
    DmbCellPhone(String model, String color, int channel) {
        super("");
        
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    
    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    
    void changeChaanelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿉니다.");
    }
    
    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
