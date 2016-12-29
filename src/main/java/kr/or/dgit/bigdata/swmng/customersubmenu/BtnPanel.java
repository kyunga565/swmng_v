package kr.or.dgit.bigdata.swmng.customersubmenu;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel {
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDel;
	private JButton btnClose;

	/**
	 * Create the panel.
	 */
	public BtnPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel btnPanel = new JPanel();
		add(btnPanel, BorderLayout.SOUTH);
		
		btnAdd = new JButton("등록");
		btnPanel.add(btnAdd);
		
		btnEdit = new JButton("수정");
		btnPanel.add(btnEdit);
		
		btnDel = new JButton("삭제");
		btnPanel.add(btnDel);
		
		btnClose = new JButton("닫기");
		btnPanel.add(btnClose);

	}

}
