package lessons15.users;

import lessons15.listener.SubmitButtonListener;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 29.06.2016.
 */
public class Submit extends JFrame {

    private Users users = new Users();

    private List<Users> listUsers;


    public Submit() {
        super("USER AUTH");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        listUsers = new ArrayList<Users>();
        listUsers.add(new Users("Denn", "1111"));

        setLayout(null);


        JLabel login = new JLabel("LOgin");
        login.setBounds(25, 25, 75, 25);
        add(login);

        JLabel pssword = new JLabel("Password");
        pssword.setBounds(25, 75, 75, 25);
        add(pssword);

        JTextField textLogin = new JTextField();
        textLogin.setBounds(125, 25, 75, 20);
        add(textLogin);
        JTextField textPassword = new JTextField();
        textPassword.setBounds(125, 75, 75, 20);
        add(textPassword);


        JButton jButton = new JButton("Submit");
        jButton.setBounds(25, 125, 180, 20);
        jButton.addActionListener(new SubmitButtonListener(this, textLogin, textPassword));
        add(jButton);

//        setVisible(true);

    }

}
