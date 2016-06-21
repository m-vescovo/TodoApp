/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.gui.model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tss
 */
public class TodoTM extends AbstractTableModel {

    string[]
        
        
        
        
        
        
        

    @Override

    public int getRowCount() {
        todos.size();
    }

    @Override
    public int getColumnCount() {
        return nomi.lenght;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return todos.get(rowIndex).getId();
            case 1:
                return todos.get(rowIndex).getTesto();

        }
    }

}
