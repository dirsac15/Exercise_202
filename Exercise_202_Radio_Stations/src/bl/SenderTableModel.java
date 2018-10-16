/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Sender;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sabrina
 */
public class SenderTableModel extends AbstractTableModel
{
    private static String[] colNames = {"Sender", "Frequenz", "Band"};
    private LinkedList<Sender> list = new LinkedList<>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;   
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sender sender = list.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return sender.getSender();
            case 1: return sender.getFrequenz();
            case 2: return sender.getBand();
            default: return "Error";
        }
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    public void updateNumCols(int numCols) {
        colNames = new String[numCols];
        for (int i = 0; i < numCols; i++) {
            colNames[i] = "Col " + i;
        }

        fireTableStructureChanged();
    }
    
    public void add(Sender s)
    {
        list.add(s);
        this.fireTableDataChanged();
    }
    

    
    
    
    
    
}
