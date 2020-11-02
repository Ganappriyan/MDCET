import javax.swing.*;
import java.awt.*;

public class StartBaseFrame extends JFrame{
    CardLayout card;
    Container content;
    StartBaseFrame() {
        setTitle("MDCET");
        setBounds(400, 100, 500, 600);
        setResizable(false);
        card = new CardLayout();
        content = getContentPane();
        content.setLayout(card);

        setVisible(true);
    }
}

class Main {
    public static void main(String[] args) {
        new StartBaseFrame();
    }
}