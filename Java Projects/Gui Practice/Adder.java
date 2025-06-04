import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Adder implements ActionListener{

    JButton addButton = new JButton("Add");
    JButton clearButton = new JButton("Clear");
    JTextField firstInput = new JTextField(5);
    JTextField secondInput = new JTextField(5);
    JLabel outputLabel = new JLabel();

    List<Integer> inputs1 = new ArrayList<Integer>();
    List<Integer> inputs2 = new ArrayList<Integer>();
    List<Integer> outputs = new ArrayList<Integer>();

    Adder(){
        JFrame frame = new JFrame("Adder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("+");
        JLabel equals = new JLabel("=");

        panel.add(firstInput);
        panel.add(label);
        panel.add(secondInput);
        panel.add(equals);
        panel.add(outputLabel);

        JPanel buttons = new JPanel();
        

        addButton.addActionListener(this);
        clearButton.addActionListener(this);

        
        buttons.add(addButton);
        buttons.add(clearButton);
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttons);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton){
            outputLabel.setText(add(firstInput.getText(), secondInput.getText()));
            inputs1.add(convertString(firstInput.getText()));
            inputs2.add(convertString(secondInput.getText()));
            outputs.add(convertString(add(firstInput.getText(), secondInput.getText())));
        }

        if(e.getSource() == clearButton){
            firstInput.setText("");
            secondInput.setText("");
            outputLabel.setText("");
            System.out.println("INPUTS1: \n" + inputs1);
            System.out.println("INPUTS2: \n" + inputs2);
            System.out.println("OUTPUTS: \n" + outputs);
        }
    }

    public String add(String first, String second){

        int output = convertString(first) + convertString(second);


        return String.valueOf(output);
    }

    public int convertString(String in) {
        Scanner scan = new Scanner(in);
        int out = scan.nextInt();
        scan.close();
        return out;
    }
}
