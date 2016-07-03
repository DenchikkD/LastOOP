package lessons16.layout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denni on 01.07.2016.
 */
public class BorderLayoutEXT extends JFrame {

    public BorderLayoutEXT() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250, 250, 400, 400);

        JButton btnNorth = new JButton("NORTH");
        JButton btnSouth = new JButton("SOUTH");
        JButton btnCENTER = new JButton("CENTER");

        JPanel jPanelEast = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnEast1 = new JButton("EAST1");

        JButton btnEast2 = new JButton("EAST2");
        JButton btnEast3 = new JButton("EAST3");
        jPanelEast.add(btnEast1);
        jPanelEast.add(btnEast2);
        jPanelEast.add(btnEast3);

        JPanel jPanelWest = new JPanel(new GridLayout(3, 2));
        JLabel lblLogin = new JLabel("Login");
        jPanelWest.add(lblLogin);
        JTextField jTextFieldLogon = new JTextField();
        jPanelWest.add(jTextFieldLogon);
        JLabel lblPasword = new JLabel("Password");
        jPanelWest.add(lblPasword);
        JPasswordField jPasswordFieldPassword = new JPasswordField();
        jPanelWest.add(jPasswordFieldPassword);
        JButton btnWest = new JButton("WEST");
        jPanelWest.add(btnWest);

        add(btnNorth, java.awt.BorderLayout.NORTH);
        add(jPanelEast, java.awt.BorderLayout.EAST);
        add(btnWest, java.awt.BorderLayout.WEST);

        add(btnCENTER, java.awt.BorderLayout.CENTER);
//        add(btnSouth, java.awt.BorderLayout.SOUTH);
        add(jPanelWest, java.awt.BorderLayout.SOUTH);


        setVisible(true);
    }
}
