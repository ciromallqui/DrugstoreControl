package Option;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TablaRender extends DefaultTableCellRenderer{
    private JLabel componente;
    private int num=0;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = (JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
        if(row%2==0){
            componente.setBackground(new java.awt.Color(255,204,102));
        }
        else{
            componente.setBackground(new java.awt.Color(204,204,204));
        } 
        if(column==5){
            num = Integer.parseInt(String.valueOf(value));
        }
        if(num<=5){
            if(column==6){
                componente.setBackground(Color.red);
            }
        }
        if(num>5 && num<=10){
            if(column==6){
                componente.setBackground(Color.ORANGE);
            }
        }
        if(num>10){
            if(column==6){
                componente.setBackground(Color.BLUE);
            }
        }
        
        if(isSelected){
            if(column!=6)
                componente.setBackground(new java.awt.Color(255,102,0));
        }
        return componente;
    }
    
}
