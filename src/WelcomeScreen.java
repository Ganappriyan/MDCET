import javax.swing.*;
import java.awt.*;

public class WelcomeScreen extends JFrame {
    WelcomeScreen() {
        setSize(500, 600);
        setLayout(null);

        JLabel title1 = new JLabel("Welcome to M.D.", SwingConstants.CENTER);
        title1.setFont(new Font("Ariel", Font.PLAIN, 30));
        title1.setBounds(100, 80, 300, 100);
        add(title1);

        JLabel title2 = new JLabel("College of Engineering and Technology", SwingConstants.CENTER);
        title2.setFont(new Font("Ariel", Font.PLAIN, 15));
        title2.setBounds(100, 120, 300, 100);
        add(title2);

        JButton mdcetButton = new JButton("Continue");
        mdcetButton.setFont(new Font("Ariel", Font.PLAIN, 25));
        mdcetButton.setBounds(175, 250, 150, 60);
        add(mdcetButton);

        JButton backButton = new JButton("Exit");
        backButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        backButton.setBounds(320, 450, 80, 30);
        add(backButton);

        setVisible(true);
    }
}

class Main2 {
    public static void main(String[] args) {
        new WelcomeScreen();
    }
}