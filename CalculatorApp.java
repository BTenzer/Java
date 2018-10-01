package CalculatorPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ~ Objective ~
 *
 *  Create a simple calculator application with
 *  functional GUI and a variety operations
 *
 *  src: self
 */

public class CalculatorApp {
    private JPanel panel1;
    private JTextField textInputField;
    private JButton backButton;
    private JButton cButton;
    private JButton squaredButton;
    private JButton additionButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton subtractionButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multiplicationButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton divisionButton;
    private JButton a0Button;
    private JButton periodButton;
    private JButton plusMinusButton;
    private JButton equalsButton;

    private double firstNumber;
    private double secondNumber;
    private double result;
    private String operations;

    public CalculatorApp() {
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a7Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a8Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a9Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a4Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a5Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a6Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a1Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a2Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a3Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + a0Button.getText();
                textInputField.setText(EnterNumber);
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textInputField.setText(null);
            }
        });
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textInputField.getText());
                textInputField.setText("");
                operations = "+";
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textInputField.getText());
                textInputField.setText("");
                operations = "-";
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textInputField.getText());
                textInputField.setText("");
                operations = "*";
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textInputField.getText());
                textInputField.setText("");
                operations = "/";
            }
        });
        squaredButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textInputField.getText());
                textInputField.setText(String.valueOf(firstNumber * firstNumber));
            }
        });
        plusMinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(textInputField.getText()));
                ops = ops * (-1);
                textInputField.setText(String.valueOf(ops));
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText();
                if(EnterNumber.length()>=1){
                    EnterNumber = EnterNumber.substring(0, EnterNumber.length()-1);
                }
                textInputField.setText(EnterNumber);
            }
        });
        periodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = textInputField.getText() + periodButton.getText();
                textInputField.setText(EnterNumber);
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer;
                secondNumber = Double.parseDouble(textInputField.getText());
                if(operations == "+"){
                    result = firstNumber + secondNumber;
                    answer = String.format("%.2f", result);
                    textInputField.setText(answer);

                } else if(operations == "-"){
                    result = firstNumber - secondNumber;
                    answer = String.format("%.2f", result);
                    textInputField.setText(answer);

                } else if(operations == "*"){
                    result = firstNumber * secondNumber;
                    answer = String.format("%.2f", result);
                    textInputField.setText(answer);

                } else if(operations == "/"){
                    result = firstNumber / secondNumber;
                    answer = String.format("%.2f", result);
                    textInputField.setText(answer);

                } else if(operations == "x^2"){
                    result = firstNumber % secondNumber;
                    answer = String.format("%.2f", result);
                    textInputField.setText(answer);

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
