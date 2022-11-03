package br.senai.sc.tuthankamun.view;

import br.senai.sc.tuthankamun.model.entities.Perfil;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class DeafaultModelCollectionPerfil extends AbstractTableModel {
    List<Perfil> dados;
    String[] colunas;

    public DeafaultModelCollectionPerfil(List<Perfil> dados) {
        this.dados = new ArrayList<>(dados);
        colunas = new String[]{"Jogos", "Vitórias"};
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
        Perfil perfil = this.dados.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return perfil.getJogos();
            }
            default -> {
                return perfil.getVitorias();
            }
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
