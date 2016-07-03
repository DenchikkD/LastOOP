package lessons15.users;

import lessons15.listener.RegisterListener;
import lessons15.listener.SubmitButtonListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 29.06.2016.
 */
public class MainFraim extends JFrame {

    private String login;
    private List<Users> users1;


    public MainFraim(String login) {
        super("Текущие пользователи");
        this.login = login;
        users1 = new ArrayList<Users>();
        visitGUI();

    }


    public void visitGUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 500, 800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);


        JLabel newLogin = new JLabel("LOgin");
        newLogin.setBounds(25, 25, 75, 25);
        add(newLogin);
        JLabel newPssword = new JLabel("Password");
        newPssword.setBounds(25, 75, 75, 25);
        add(newPssword);

        JTextField newTtextLogin = new JTextField();
        newTtextLogin.setBounds(125, 25, 75, 20);
        add(newTtextLogin);
        JPasswordField newtextPassword = new JPasswordField();
        newtextPassword.setBounds(125, 75, 75, 20);
        add(newtextPassword);


        JButton jButton = new JButton("Register");
        jButton.setBounds(25, 125, 180, 20);
        jButton.addActionListener(new RegisterListener(this,newTtextLogin, newtextPassword, users1));

        add(jButton);


        DefaultTableModel tableModel = new DefaultTableModel(new Object[][]{{"Admin", "admin"}}, new Object[]{"USER LOGIN", ""});
//        saveUsersFile();
//        openFile();
        JTable tableUsers = new JTable(tableModel);
        tableUsers.setBounds(15, 150, 310, 250);

        tableModel.addRow(new Object[][]{{newLogin.getText(), newPssword.getText()}});
        JScrollPane scrollPane = new JScrollPane(tableUsers);
        add(tableUsers);

    }

//    private void openFile() {
//        File users = new File("D:\\OOP/testDirectory/users.dat");
//        if (!users.exists()) {
//            try {
//                users.createNewFile();
//                return;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } else {
//            try {
//                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(users));
//                this.users1 = (List<Users>) ois.readObject();
//                ois.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private void saveUsersFile() {
//        File users = new File("D:\\OOP/testDirectory/users.dat");
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(users));
//            oos.writeObject(users);
//            oos.flush();
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
