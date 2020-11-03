import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    MainScreen() {
        setSize(500, 600);
        setLayout(null);

        JLabel title = new JLabel("What do you like to view,", SwingConstants.CENTER);
        title.setFont(new Font("Ariel", Font.PLAIN, 22));
        title.setBounds(100, 30, 300, 100);
        add(title);

        JPanel options = new JPanel(new GridLayout(3, 1, 0, 30));
        options.setBounds(150, 140, 200, 250);

        JButton departmentButton = new JButton("Department");
        departmentButton.setFont(new Font("Ariel", Font.PLAIN, 17));
        options.add(departmentButton);
        departmentButton.addActionListener(e -> {
            options.setLayout(new GridLayout(4, 1, 0, 30));
            options.add(new departmentPanel(), 1);
            options.revalidate();
        });

        JButton facultyButton = new JButton("Faculty");
        facultyButton.setFont(new Font("Ariel", Font.PLAIN, 17));
        options.add(facultyButton);

        JButton updatesButton = new JButton("Updates");
        updatesButton.setFont(new Font("Ariel", Font.PLAIN, 17));
        options.add(updatesButton);

        add(options);

        JButton backButton = new JButton("Back");
        backButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        backButton.setBounds(320, 450, 80, 30);
        add(backButton);

        setVisible(true);
    }
}

class departmentPanel extends JPanel {
    departmentPanel() {
        setLayout(new GridLayout(1, 3, 10, 0));

        JButton cseButton = new JButton("CSE");
        cseButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        add(cseButton);

        JButton eceButton = new JButton("ECE");
        eceButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        add(eceButton);

        JButton eeeButton = new JButton("EEE");
        eeeButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        add(eeeButton);
    }
}

class Main3 {
    public static void main(String[] args) {
        new MainScreen();
    }
}