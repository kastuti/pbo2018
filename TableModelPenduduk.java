/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo.tablemodel;

import java.util.ArrayList;
import tubespbo.entity.Penduduk;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aduar
 */
public class TableModelPenduduk extends AbstractTableModel{
    
    private ArrayList<Penduduk> listPenduduk = new ArrayList<>();

    @Override
    public int getRowCount() {
        return listPenduduk.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return listPenduduk.get(rowIndex).getNik();
            case 1: return listPenduduk.get(rowIndex).getNama();
            case 2: return listPenduduk.get(rowIndex).getLahir();
            case 3: return listPenduduk.get(rowIndex).getJk();
            case 4: return listPenduduk.get(rowIndex).getKota();
            case 5: return listPenduduk.get(rowIndex).getAlamat();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NIK";
            case 1: return "Nama";
            case 2: return "Lahir";
            case 3: return "Jk";
            case 4: return "Kota";
            case 5: return "Alamat";
            default: return null;
        }
    }
    
    public void insertPenduduk(Penduduk m){
        listPenduduk.add(m);
        fireTableDataChanged();
    }
    
    public void updatePenduduk(int index, Penduduk m){
        listPenduduk.set(index, m);
        fireTableDataChanged();
    }
    
    public void deletePenduduk(int index){
        listPenduduk.remove(index);
        fireTableDataChanged();
    }
    
    public void setData(ArrayList<Penduduk> listPenduduk){
        this.listPenduduk = listPenduduk;
        fireTableDataChanged();
    }
    
    public Penduduk getPenduduk(int index){
        return listPenduduk.get(index);
    }
    
    public void clear(){
        listPenduduk.clear();
    }
    
    
    
    
    
}
