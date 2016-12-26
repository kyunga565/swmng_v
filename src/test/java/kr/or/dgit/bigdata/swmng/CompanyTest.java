package kr.or.dgit.bigdata.swmng;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.swmng.dto.Company;
import kr.or.dgit.bigdata.swmng.service.CompanyService;

public class CompanyTest {
	private static CompanyService cs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cs = CompanyService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cs = null;
	}

	@Test
	public void test1() {
		List<Company> list = cs.selectAll();
		Assert.assertNotNull(list);
		for (Company c : list) {
			System.out.println(c);
		}
	}

	@Test
	public void test2() {
		Company c = cs.selectByNo(3);
		Assert.assertNotNull(c);
		System.out.println(c);
	}

	
	/*@Test
	public void test3() {
		cs.deleteItem(2);
		Assert.assertNull(cs.selectByNo(2));
		

	}*/
	
	

}
