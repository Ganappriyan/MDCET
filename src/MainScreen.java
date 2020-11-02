import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    MainScreen() {
        setSize(500, 600);
        setLayout(null);

        JLabel title = new JLabel("What do you like to view,", SwingConstants.CENTER);
        title.setFont(new Font("Ariel", Font.PLAIN, 20));
        title.setBounds(100, 80, 300, 100);
        add(title);

        JPanel options = new JPanel(new GridLayout(3, 1, 0, 30));
        options.setBounds(150, 200, 200, 300);

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

        setVisible(true);
    }
}

class Main3 {
    public static void main(String[] args) {
        new MainScreen();
    }
}