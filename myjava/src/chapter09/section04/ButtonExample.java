package chapter09.section04;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();
        
        btn.setOnClickListener(new CallListener());
        
        btn.touch();
        
        btn.setOnClickListener(new MessageListener());
        btn.touch();
        
        btn.setOnClickListener(new Button.OnClickListener() {
            
            @Override
            public void onClick() {
                System.out.println("카톡을봅니다.");
                
            }
        });
        btn.touch();
        
        btn.setOnClickListener(() -> System.out.println("인터넷을합니다."));
        btn.touch();
    }
}






