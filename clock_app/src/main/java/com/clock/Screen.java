package com.clock;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen {

    private JFrame window;
    private JLabel timeDisplay;
    private MyTime time;
    private Timer timer;

    public Screen() {
        window = new JFrame();
        timeDisplay = new JLabel();

        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        JTextField hour = new JTextField();
        hour.setBounds(70, 50, 40, 40);
        window.add(hour);

        JTextField min = new JTextField();
        min.setBounds(130, 50, 40, 40);
        window.add(min);

        JTextField secs = new JTextField();
        secs.setBounds(190, 50, 40, 40);
        window.add(secs);

        JButton setNewTime = new JButton("set initial time");
        setNewTime.setBounds(250, 50, 120, 40);
        window.add(setNewTime);

        timeDisplay = new JLabel("00:00:00", SwingConstants.CENTER);
        timeDisplay.setBounds(50, 100, 250, 50);
        timeDisplay.setFont(new Font("Serif", Font.BOLD, 40));
        window.add(timeDisplay);

        JLabel advanceTime = new JLabel("Enter seconds to advance: ");
        advanceTime.setBounds(20, 150, 200, 20);
        window.add(advanceTime);

        JTextField advanceTimeInput = new JTextField();
        advanceTimeInput.setBounds(180, 150, 120, 25);
        window.add(advanceTimeInput);

        JButton advTimeButton = new JButton("Set");
        advTimeButton.setBounds(100, 180, 100, 20);
        window.add(advTimeButton);

        setNewTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = new MyTime(Integer.parseInt(hour.getText()),
                        Integer.parseInt(min.getText()),
                        Integer.parseInt(secs.getText()));

                timer.start();
            }
        });

        advTimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int seconds = Integer.parseInt(advanceTimeInput.getText());
                    time.advanceTime(seconds);
                    timeDisplay.setText(time.toString() + " " + time.meridianChange());
                    timer.start();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(window, "Enter a valid amount of seconds dumbass\n");
                }
            }
        });

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time.tickBySecond();
                timeDisplay.setText(time.toString() + " " + time.meridianChange());
            }
        });
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Screen());
    }

}
