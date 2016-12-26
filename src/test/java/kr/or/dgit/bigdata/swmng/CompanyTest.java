package kr.or.dgit.bigdata.swmng;

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

	/*@Test
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

	@Test
	public void test3() {
		cs.deleteItem(2);
		Assert.assertNull(cs.selectByNo(2));

	}

	@Test
	public void test4() {
		Company insertCo = new Company("경아와친구들", "대구시아이티 교육원", "010-0101-2020");
		cs.insertItem(insertCo);
		List<Company> list = cs.selectAll();
		for (Company c : list) {
			System.out.println(c);
		}
	}
	*/
	@Test
	public void test5() {
		Company updateCo = new Company(7, "박경아와꼬봉들", "대구 이티교육원", "전화없음");
		cs.updateItem(updateCo);
		Assert.assertEquals(cs.selectByNo(7), updateCo);
	}
}
