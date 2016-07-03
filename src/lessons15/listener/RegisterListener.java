package lessons15.listener;

import lessons15.users.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 29.06.2016.
 */
public class RegisterListener implements ActionListener {
    private JFrame main;
    private JTextField login;
    private JPasswordField password;


    private List<Users> usersList;

    public RegisterListener(JFrame main, JTextField login, JPasswordField password, List<Users> user) {

        this.main = main;
        this.login = login;
        this.password = password;
        usersList = new ArrayList<Users>();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (Users user : usersList) {
            if (!login.getText().contains(user.getLOgin().getText())) {
                usersList.add(new Users(login, password));

            } else {
                JOptionPane.showMessageDialog(main, "Этот пользовател уже зарегистрирован", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }

        }


    }
}
