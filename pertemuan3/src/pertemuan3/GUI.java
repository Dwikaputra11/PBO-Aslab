/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;
import javax.swing.*;
import java.lang.*;
/**
 *
 * @author Christian Sirait
 */
public class GUI extends JFrame{
    JLabel fnama = new JLabel("Judul");
    JTextField field = new JTextField(10);
    JButton button = new JButton("Button");
    public GUI(){
        setLayout(null);
        add(fnama);
        add(field);
        add(button);
        fnama.setBounds(10, 10, 100, 20);
        field.setBounds(50, 10, 100, 20);
        button.setBounds(50, 50, 100, 20);
        setTitle("GUI");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}
