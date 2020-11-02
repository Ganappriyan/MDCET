import javax.swing.*;
import java.awt.*;

public class WelcomeScreen extends JFrame {
    WelcomeScreen() {
        setSize(500, 600);
        setLayout(null);

        JButton mdcetButton = new JButton("MDCET");
        mdcetButton.setFont(new Font("Ariel", Font.PLAIN, 25));
        mdcetButton.setBounds(175, 270, 150, 60);
        add(mdcetButton);

        JButton backButton = new JButton("Back");
        backButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        backButton.setBounds(320, 510, 80, 30);
        add(backButton);

        setVisible(true);
    }
}

class Main2 {
    public static void main(String[] args) {
        new WelcomeScreen();
    }
}