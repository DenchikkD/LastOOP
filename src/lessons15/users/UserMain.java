package lessons15.users;

import javax.swing.*;

/**
 * Created by Denni on 29.06.2016.
 */
public class UserMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Submit submit = new Submit();
                submit.setVisible(true);
            }
        });
    }
}
