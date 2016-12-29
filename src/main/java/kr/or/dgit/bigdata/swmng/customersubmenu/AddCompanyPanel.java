package kr.or.dgit.bigdata.swmng.customersubmenu;

import java.awt.ScrollPane;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import kr.or.dgit.bigdata.swmng.dto.Company;
import kr.or.dgit.bigdata.swmng.service.CompanyService;
import kr.or.dgit.bigdata.swmng.util.ModelForTable;

public class AddCompanyPanel extends JPanel {
	private JTable companyList = new JTable();

	public AddCompanyPanel() {
		List<Company> list = CompanyService.getInstance().selectAll();
		String[] COL_NAMES = { "회사번호", "회사명", "주소", "전화번호" };
		String[][] data = new String[list.size()][COL_NAMES.length];
		int idx = 0;
		for (Company c : list) {
			data[idx][0] = c.getNo() + "";
			data[idx][1] = c.getCoName();
			data[idx][2] = c.getAddress();
			data[idx][3] = c.getTel();
			idx++;
		}
		ModelForTable mft = new ModelForTable(data, COL_NAMES);
		companyList.setModel(mft);
		companyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new ScrollPane().add(companyList));
		
	
	}
}