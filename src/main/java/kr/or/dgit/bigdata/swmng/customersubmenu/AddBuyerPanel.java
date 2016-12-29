package kr.or.dgit.bigdata.swmng.customersubmenu;

import java.awt.ScrollPane;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import kr.or.dgit.bigdata.swmng.dto.Buyer;
import kr.or.dgit.bigdata.swmng.dto.Company;
import kr.or.dgit.bigdata.swmng.service.BuyerService;
import kr.or.dgit.bigdata.swmng.service.CompanyService;
import kr.or.dgit.bigdata.swmng.util.ModelForTable;

public class AddBuyerPanel extends JPanel {
	private JTable companyList = new JTable();

	public AddBuyerPanel() {
		List<Buyer> list = BuyerService.getInstance().selectAll();
		String[] COL_NAMES = { "등록번호", "상호", "주소", "전화번호" };
		String[][] data = new String[list.size()][COL_NAMES.length];
		int idx = 0;
		for (Buyer b : list) {
			data[idx][0] = b.getNo() + "";
			data[idx][1] = b.getShopName();
			data[idx][2] = b.getAddress();
			data[idx][3] = b.getTel();
			idx++;
		}
		ModelForTable mft = new ModelForTable(data, COL_NAMES);
		companyList.setModel(mft);
		companyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new ScrollPane().add(companyList));
		
	
	}
}