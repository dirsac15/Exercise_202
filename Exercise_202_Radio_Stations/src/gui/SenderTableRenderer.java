/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Sabrina
 */
public class SenderTableRenderer extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        Component component = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
        int col = jtable.convertColumnIndexToModel(i1);
        
        setForeground(Color.GRAY.brighter());
        setFont(new Font("Arial", Font.BOLD, 14));
        setHorizontalAlignment(JLabel.CENTER);
         
        if(i1 == 2)
        {
           String str = (String) jtable.getValueAt(i, i1);
 
           if(str.equals("FM"))
           {
               setBackground(Color.red);
           }
           else if(str.equals("AM"))
           {
               setBackground(Color.blue);
           }
        }
        
        
        return component;
    }
    
}
