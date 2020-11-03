import javax.swing.*;
import java.awt.*;

public class FacultyScreen extends JFrame {
    FacultyScreen() {
        setSize(500, 600);
        setLayout(null);

        JLabel title = new JLabel("Faculties", SwingConstants.CENTER);
        title.setFont(new Font("Ariel", Font.PLAIN, 22));
        title.setBounds(100, 30, 300, 100);
        add(title);

        JPanel panel = new JPanel(null);
        panel.setBounds(100, 150, 300, 1000);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(""+i);
            button.setBounds(0, i*70, 300, 70);
            panel.add(button);
        }

        JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JPanel content = new JPanel(new BorderLayout());
        content.add(scrollPane, BorderLayout.CENTER);
        content.setBounds(100, 150, 300, 200);
        add(content);

        setVisible(true);
    }
}

class Main4 {
    public static void main(String[] args) {
        new FacultyScreen();
    }
}