package chapter09.section0502;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();
    
    Button.OnClickListener listener = new Button.OnClickListener() {
        
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };
    
    Window() {
        button1.setOnClickListener(listener);
        button1.setOnClickListener(new Button.OnClickListener() {
            
            @Override
            public void onClick() {
                System.out.println("메세지를 보냅니다.");
            }
        });
    }
}
