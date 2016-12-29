package kr.or.dgit.bigdata.swmng.util;

import javax.swing.table.AbstractTableModel;

public class ModelForTable extends AbstractTableModel {

	String[][] data;
	String[] COL_NAMES;

	public ModelForTable(String[][] data, String[] cOL_NAMES) {
		this.data = data;
		COL_NAMES = cOL_NAMES;
	}

	@Override
	public int getColumnCount() {
		return COL_NAMES.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return data[arg0][arg1];
	}

	@Override
	public String getColumnName(int column) {
		return COL_NAMES[column];
	}

}
