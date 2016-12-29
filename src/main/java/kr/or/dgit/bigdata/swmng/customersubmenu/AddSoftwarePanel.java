package kr.or.dgit.bigdata.swmng.customersubmenu;

import java.awt.ScrollPane;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import kr.or.dgit.bigdata.swmng.dto.Software;
import kr.or.dgit.bigdata.swmng.service.SoftwareService;
import kr.or.dgit.bigdata.swmng.util.ModelForTable;

public class AddSoftwarePanel extends JPanel {
	private JTable companyList = new JTable();

	public AddSoftwarePanel() {
		List<Software> list = SoftwareService.getInstance().selectAll();
		String[] COL_NAMES = { "품목번호", "분류명", "품목명", "공급가격", "판매가격", "공급회사명" };
		String[][] data = new String[list.size()][COL_NAMES.length];
		int idx = 0;
		for (Software s : list) {
			data[idx][0] = s.getNo() + "";
			data[idx][1] = s.getCategory();
			data[idx][2] = s.getTitle();
			data[idx][3] = s.getSupPrice() + "";
			data[idx][4] = s.getSellPrice() + "";
			data[idx][5] = s.getCoName().getCoName();
			idx++;
		}
		ModelForTable mft = new ModelForTable(data, COL_NAMES);
		companyList.setModel(mft);
		companyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new ScrollPane().add(companyList));

	}
}