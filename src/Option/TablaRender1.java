package Option;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TablaRender1 extends DefaultTableCellRenderer{
    private JLabel componente;
    private int num=0;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = (JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
        if(row%2==0){
            componente.setBackground(new java.awt.Color(32,178,170));
        }
        else{
            componente.setBackground(new java.awt.Color(204,204,204));
        }
        if(isSelected){
            componente.setBackground(new java.awt.Color(210,105,30));
        }
        return componente;
    }
}
