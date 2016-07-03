package lessons14.swingThreadSearch;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denni on 25.06.2016.
 */
public class Pole extends JFrame {

    public Pole() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        setSize(screenSize.width / 2, screenSize.height / 2);
    }

}
