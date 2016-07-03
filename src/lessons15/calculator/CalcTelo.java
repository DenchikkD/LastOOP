package lessons15.calculator;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Denni on 01.07.2016.
 */
public class CalcTelo extends JFrame {
    private Operation operation;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, minus, plus, pom, div, result, back, negative;
    private JTextField displey;
    int valueOne = 0;
    int valueTwo = 0;

    public CalcTelo() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 400);
//        setResizable(false);
        calcPole();
    }

    public void calcPole() {
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        negative = new JButton("-/+");
        back = new JButton("C");
        plus = new MyButton("+", new Operation() {
            @Override
            public int doOperation(int valueOne, int valueTwo) {
                return valueOne + valueTwo;
            }
        });
        minus = new MyButton("-", new Operation() {
            @Override
            public int doOperation(int valueOne, int valueTwo) {
                return valueOne - valueTwo;
            }
        });
        pom = new MyButton("*", new Operation() {
            @Override
            public int doOperation(int valueOne, int valueTwo) {
                return valueOne * valueTwo;
            }
        });
        div = new MyButton("/", new Operation() {
            @Override
            public int doOperation(int valueOne, int valueTwo) {
                return valueOne / valueTwo;
            }
        });
        result = new JButton("=");
        displey = new JTextField();

        JPanel battonPunel = new JPanel(new GridLayout(4, 3));
        battonPunel.add(button1);
        battonPunel.add(button2);
        battonPunel.add(button3);
        battonPunel.add(plus);
        battonPunel.add(button4);
        battonPunel.add(button5);
        battonPunel.add(button6);
        battonPunel.add(minus);
        battonPunel.add(button7);
        battonPunel.add(button8);
        battonPunel.add(button9);
        battonPunel.add(pom);
        battonPunel.add(negative);
        battonPunel.add(button0);
        battonPunel.add(back);
        battonPunel.add(div);
        setLayout(new BorderLayout());
        add(battonPunel, BorderLayout.CENTER);
//        displey.setSize(75,300);
        add(displey, BorderLayout.NORTH);
        add(result, BorderLayout.SOUTH);
        button1.addActionListener(new ButtonListener(button1));
        button2.addActionListener(new ButtonListener(button2));
        button3.addActionListener(new ButtonListener(button3));
        button4.addActionListener(new ButtonListener(button4));
        button5.addActionListener(new ButtonListener(button5));
        button6.addActionListener(new ButtonListener(button6));
        button7.addActionListener(new ButtonListener(button7));
        button8.addActionListener(new ButtonListener(button8));
        button9.addActionListener(new ButtonListener(button9));
        button0.addActionListener(new ButtonListener(button0));
        plus.addActionListener(new Diya((MyButton) plus));
        pom.addActionListener(new Diya((MyButton) pom));
        div.addActionListener(new Diya((MyButton) div));
        minus.addActionListener(new Diya((MyButton) minus));

        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                valueTwo = Integer.valueOf(displey.getText());
                displey.setText(operation.doOperation(valueOne, valueTwo) + "");
                valueOne = 0;

            }
        });
        back.addActionListener(e -> displey.setText(""));
        negative.addActionListener(e -> displey.setText("-" + displey.getText()));
    }


    public class ButtonListener implements ActionListener {
        JButton button;

        public ButtonListener(JButton button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (button == e.getSource()) {
                displey.setText(displey.getText() + button.getText());
            }
        }
    }

    public class Diya implements ActionListener {
        MyButton button;

        public Diya(MyButton button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (button == e.getSource()) {
                valueOne = Integer.valueOf(displey.getText());
                displey.setText("");
                operation = button.getOperation();

            }
        }
    }

}
