import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    MainScreen() {
        setSize(500, 600);
        setLayout(null);

        JLabel title = new JLabel("What do you like to view,", SwingConstants.CENTER);
        title.setFont(new Font("Ariel", Font.PLAIN, 20));
        title.setBounds(100, 30, 300, 100);
        add(title);

        JPanel options = new JPanel(new GridLayout(3, 1, 0, 40));
        options.setBounds(180, 150, 170, 250);

        JButton departmentButton = new JButton("Department");
        departmentButton.setFont(new Font("Ariel", Font.PLAIN, 15));
        options.add(departmentButton);

        JButton facultyButton = new JButton("Faculty");
        facultyButton.setFont(new Font("Ariel", Font.PLAIN, 15));
        options.add(facultyButton);

        JButton updatesButton = new JButton("Updates");
        updatesButton.setFont(new Font("Ariel", Font.PLAIN, 15));
        options.add(updatesButton);

        add(options);

        JButton backButton = new JButton("Back");
        backButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        backButton.setBounds(320, 450, 80, 30);
        add(backButton);

        setVisible(true);
    }
}

class Main3 {
    public static void main(String[] args) {
        new MainScreen();
    }
}