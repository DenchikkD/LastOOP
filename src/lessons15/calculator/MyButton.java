package lessons15.calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Denni on 01.07.2016.
 */
public class MyButton extends JButton {
    private Operation operation;

    public MyButton(String text, Operation operation) {
        super(text);
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
