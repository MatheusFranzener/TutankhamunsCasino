package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.model.entities.Perfil;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DeafaultTableModelCollection extends AbstractTableModel {
    List<Perfil> dados;
    String[] colunas;

    public DeafaultTableModelCollection(Collection<Perfil> lista) {
        this.dados = new ArrayList<>(lista);
        colunas = new String[]{"Colocação", "Nome", "Saldo"};
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int colocacao = rowIndex + 1;
        Perfil perfil = dados.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return colocacao;
            }
            case 1 -> {
                return perfil.getNome();
            }
            default -> {
                return perfil.getSaldo();
            }
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
