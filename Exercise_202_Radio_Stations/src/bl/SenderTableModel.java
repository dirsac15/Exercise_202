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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    public void add(Sender s)
    {
        list.add(s);
        this.fireTableDataChanged();
    }
    

    
    
    
    
    
}
