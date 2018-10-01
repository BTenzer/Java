import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryConverterApp extends JFrame {
    private JTextField textFieldInput;
    private JButton convertButton;
    private JPanel panel1;
    private JTextPane textPaneOutput;
    private long numInput = 0;

    public BinaryConverterApp() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numInput = Integer.parseInt(textFieldInput.getText());

                // numInput = numInput + 10; // tester
                String result = convertToBinary(numInput);

                textPaneOutput.setText(String.valueOf(result));
            }
        });
    }

    public static String convertToBinary(long base10) {
        String binary = ""; // result to be returned
        long bite = 0; // used to test whether or not a bit should be 1 or 0
        int decrementCount = 0; // amount of times you will have to remove the value of something as you work back ???? In other words, this will be the length in characters of the final result

        while (base10 > bite) {
            bite = bite * 2; // doubles the number that will later be subtracted
            if (bite < 1) { // this will only activate once, when bite starts at a value of 0
                bite++; // after it passes that point, bite will double, not be incremented by 1
            }
            decrementCount++;
        }
        bite = bite / 2; // revert one loop of bite doubling

        // at this point, bite is where you need it to be. Next, begin subtracting it from base10
        // and then dividing it by two, reversing what you previously did but also reducing base10

        StringBuilder binaryBuilder = new StringBuilder();

        /*
        while (bite > 1) {
            base10 = base10 - bite;
            bite = bite / 2;
            binaryBuilder.append("1");
        }
        */

        for(int i = 0; i < decrementCount-1; i++){
            if(base10>=bite){
                base10 = base10 - bite;
                binaryBuilder.append("1");
            } else {
                binaryBuilder.append("0");
            }
            bite = bite / 2;
        }

        ////
        //binary.equals(String.valueOf(bite));
        // this is junk to make IDEA stop telling me that bite is unused, it is not part of the program, delete it
        ////

        binary = binaryBuilder.toString();

        // flip order of binary here so that it is printed properly
        // public static String reverseBinary(){}
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ //

        return binary;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Binary Converter Application");
        frame.setContentPane(new BinaryConverterApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
