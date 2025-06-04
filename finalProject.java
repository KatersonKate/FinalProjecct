import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Color;

public class finalProject extends JFrame {
    private JPanel test;
    private JTextField welcomeToMyFinalTextField;
    private JButton clickHereToTakeButton;

    public finalProject() {
        clickHereToTakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(clickHereToTakeButton, "Hello");
            }
        });
    }


    public static void main(String[] args) {
        finalProject hello = new finalProject();
        hello.setContentPane(hello.test);
        hello.setTitle("Hello");
        hello.setSize(300, 300);
        hello.setVisible(true);
        hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame frame = new JFrame("smth");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics ga){
                super.paintComponent(ga);
            }
        };

    }
}
