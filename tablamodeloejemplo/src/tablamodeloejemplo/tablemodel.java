/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablamodeloejemplo;

import java.util.LinkedList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author usuario
 */
public class tablemodel implements TableModel {

    LinkedList lista;
    LinkedList escuchador;
    Modelo modelo;
    public tablemodel(Modelo modelo){
        lista = new LinkedList();
        lista.add(modelo);
        escuchador = new LinkedList();
    }
    public void agregar(){
       
    }
    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return lista.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 1:
                return "Column 1";
            case 2:
                return "Column 2";
            case 3:
                return "Column 3";
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            default:
                return null;
        
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        modelo = new Modelo();
        modelo = (Modelo)lista.get(rowIndex);
        switch(columnIndex){
            case 1:
                return modelo.getCosa1();
            case 2:
                return modelo.getCosa2();
            case 3:
                return modelo.getCosa3();
            default:
                return null;
        
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        escuchador.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
       escuchador.remove(l);
    }
    
}
