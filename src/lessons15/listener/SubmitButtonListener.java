package lessons15.listener;

import lessons15.users.MainFraim;
import lessons15.users.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 29.06.2016.
 */
public class SubmitButtonListener implements ActionListener {
    private JFrame main;
    private JTextField login;
    private JTextField password;

    private List<Users> usersList;

    public SubmitButtonListener(JFrame main, JTextField login, JTextField password) {
        this.main = main;
        this.login = login;
        this.password = password;
        usersList = new ArrayList<Users>();
        usersList.add(new Users("Denn", "1111"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Users user:usersList) {


            if (login.getText().equals(user.getsLOgin()) && password.getText().equals(user.getSpassword())) {
                JOptionPane.showMessageDialog(main, "Ok");
                MainFraim mainFraim = new MainFraim("Denn");
                mainFraim.setVisible(true);
                main.setVisible(false);
                return;

            } else {
                JOptionPane.showMessageDialog(main, "BLA BLA BLA " + login.getText() + " BLA BLA", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }

    }
}
