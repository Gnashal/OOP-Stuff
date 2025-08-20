package io;
import MathUtility.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen {
    private JFrame window;
    private JLabel resultDisplay;
    private Calculator calculator;

    public Screen(){
        window = new JFrame();
        resultDisplay = new JLabel();
        calculator = new Calculator();
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        JTextField a = new JTextField();
        a.setBounds(70, 50, 40, 40);
        window.add(a);

        JTextField b = new JTextField();
        b.setBounds(130, 50, 40, 40);
        window.add(b);
        resultDisplay = new JLabel("", SwingConstants.CENTER);
        resultDisplay.setBounds(50, 100, 250, 50);
        resultDisplay.setFont(new Font("Serif", Font.BOLD, 40));
        window.add(resultDisplay);

        JButton addButton = new JButton("ADD");
        addButton.setBounds(250, 10, 120, 40);
        window.add(addButton);

        JButton subButton = new JButton("MINUS");
        subButton.setBounds(250, 50, 120, 40);
        window.add(subButton);

        JButton multButton = new JButton("MULTIPLY");
        multButton.setBounds(250, 100, 120, 40);
        window.add(multButton);

        JButton divideButton = new JButton("DIVIDE");
        divideButton.setBounds(250, 150, 120, 40);
        window.add(divideButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp1 = Double.parseDouble(a.getText());
                double temp2 = Double.parseDouble(b.getText());
                double res = calculator.add(temp1, temp2);
                displayResult(res);

            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp1 = Double.parseDouble(a.getText());
                double temp2 = Double.parseDouble(b.getText());
                double res = calculator.sub(temp1, temp2);
                displayResult(res);
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp1 = Double.parseDouble(a.getText());
                double temp2 = Double.parseDouble(b.getText());
                double res = calculator.multiply(temp1, temp2);
                displayResult(res);
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp1 = Double.parseDouble(a.getText());
                double temp2 = Double.parseDouble(b.getText());
                double res = calculator.divide(temp1, temp2);
                displayResult(res);
            }
        });
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    public void displayResult(double res) {
        resultDisplay.setText(String.valueOf(res));
    }
    public static void main(String[] args) {SwingUtilities.invokeLater(() -> new Screen());}

}
