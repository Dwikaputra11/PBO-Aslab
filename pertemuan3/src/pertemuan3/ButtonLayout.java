/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Christian Sirait
 */
public class ButtonLayout extends JFrame{
    
    JButton btnSave,btnLogin, btnSend, btnCancel;
    
    public ButtonLayout(){
        btnSave = new JButton("Save");
        btnLogin = new JButton("Login");
        btnSend = new JButton("Send");
        btnCancel = new JButton("Cancel");
    }
    
    public void showBorderLayout(){
        setTitle("Border Layout");
        setLayout(new BorderLayout());
        add(btnSave,"North");
        add(btnLogin, "East");
        add(btnSend, "South"); 
        add(btnCancel, "West");
        
        
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void showGridLayout(){
        setTitle("Grid Layout");
        GridLayout gridLayout = new GridLayout(2,2);
        setLayout(gridLayout);
        add(btnSave);
        add(btnLogin);
        add(btnSend); 
        add(btnCancel);
        
        
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void showFlowLayout(){
        setTitle("Flow Layout");
        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
        setLayout(flowLayout);
        add(btnSave);
        add(btnLogin);
        add(btnSend); 
        add(btnCancel);
        
        
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
