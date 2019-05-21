package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 97798
 */
public class Calculator extends JFrame implements ActionListener {

    JLabel num1_lb, num2_lb, result_lb;
    JTextField num1_tf, num2_tf, result_tf;
    JButton add, mul, sub, div;

    public Calculator() {
        setLayout(null);
        num1_lb = new JLabel("First number:");
        num1_lb = new JLabel("First number:");
        num2_lb = new JLabel("Second number");
        result_lb = new JLabel("Output:");

        num1_lb.setBounds(70, 70, 100, 20);
        num2_lb.setBounds(70, 100, 100, 20);
        result_lb.setBounds(100, 180, 100, 20);

        num1_tf = new JTextField();
        num2_tf = new JTextField();
        result_tf = new JTextField();

        num1_tf.setBounds(170, 70, 100, 20);
        num2_tf.setBounds(170, 100, 100, 20);
        result_tf.setBounds(170, 180, 100, 20);
        
        num1_tf.setBackground(Color.yellow);
        num2_tf.setBackground(Color.yellow);
        result_tf.setBackground(Color.yellow);
        
        add = new JButton("Add");
        sub = new JButton("Substract");
        mul = new JButton("Multiply");
        div = new JButton("Division");

        add.setBounds(70, 150, 60, 20);
        sub.setBounds(150, 150, 90, 20);
        mul.setBounds(270, 150, 90, 20);
        div.setBounds(380, 150, 90, 20);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        add(num1_lb);
        add(num2_lb);
        add(result_lb);
        add(num1_tf);
        add(num2_tf);
        add(result_tf);
        add(add);
        add(sub);
        add(mul);
        add(div);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setVisible(true);
        cal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cal.setBounds(50, 50, 550, 550);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== add){
        String first = num1_tf.getText();
        String second = num2_tf.getText();
        
        float first_num = Float.parseFloat(first);
        float second_num = Float.parseFloat(second);
        
        Float result =  first_num + second_num;
        String res = result.toString(result);
        result_tf.setText(res);
        }
        
        
        if(e.getSource()== sub){
        String first = num1_tf.getText();
        String second = num2_tf.getText();
        
        float first_num = Float.parseFloat(first);
        float second_num = Float.parseFloat(second);
        
        Float result =  first_num - second_num;
        String res = result.toString(result);
        result_tf.setText(res);
        }
        
        
        if(e.getSource()== mul){
        String first = num1_tf.getText();
        String second = num2_tf.getText();
        
        float first_num = Float.parseFloat(first);
        float second_num = Float.parseFloat(second);
        
        Float result =  first_num * second_num;
        String res = result.toString(result);
        result_tf.setText(res);
        }
        
        
        if(e.getSource()== div){
        String first = num1_tf.getText();
        String second = num2_tf.getText();
        
        float first_num = Float.parseFloat(first);
        float second_num = Float.parseFloat(second);
        
        Float result =  first_num / second_num;
        String res = result.toString(result);
        result_tf.setText(res);
        }
    }

}
