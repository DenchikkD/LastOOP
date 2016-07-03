package lessons15;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denni on 29.06.2016.
 */
public class SwingEx01 extends JFrame {

    public SwingEx01() {
        super("USER AUTH");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 300));
        setMaximumSize(new Dimension(500, 400));

        setSize(400, 300);
        setBounds(300, 300, 400, 300);

        setLayout(null);
        JLabel lbTest = new JLabel("Test Lable");
//        lbTest.setSize(100, 20);
        lbTest.setBounds(25, 25, 75, 20);
        add(lbTest);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(125, 25, 75, 20);
        add(jTextField);

        JButton jButton = new JButton("Test Button");
        jButton.setBounds(25, 50, 150, 20);
        add(jButton);




        setVisible(true);


    }


}
