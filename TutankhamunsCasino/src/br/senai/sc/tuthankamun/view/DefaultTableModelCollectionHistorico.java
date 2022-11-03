package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.model.entities.Historico;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DefaultTableModelCollectionHistorico extends AbstractTableModel {
    List<Historico> historico;
    String[] colunas;

    public DefaultTableModelCollectionHistorico(Collection<Historico> historico) {
        this.historico = new ArrayList<>(historico);
        colunas = new String[]{"Aposta", "Resultado"};
    }

    @Override
    public int getRowCount() {
        return historico.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Historico historico = this.historico.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return historico.getValorAposta();
            }
            default -> {
                return historico.getValorResultado();
            }
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

}
