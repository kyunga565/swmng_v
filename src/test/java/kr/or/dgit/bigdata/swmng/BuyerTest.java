package kr.or.dgit.bigdata.swmng;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.swmng.dto.Buyer;
import kr.or.dgit.bigdata.swmng.dto.Software;
import kr.or.dgit.bigdata.swmng.mappers.BuyerMapper;
import kr.or.dgit.bigdata.swmng.service.BuyerService;

public class BuyerTest {
	private static BuyerService bs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bs = BuyerService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		bs = null;
	}
	@Test
	public void selectnotest() {	

/*		BuyerService s = bs.selectByNo(1);
		Assert.assertNotNull(s);
		System.out.println(s);*/
		
	}
	@Test
	public void selectalltest(){

		List<Buyer> list = bs.selectByAll();
		Assert.assertNotNull(list);
		System.out.println(list);
	}
	@Test
	public void inserttest() {
		/*Buyer b = new Buyer(1,"대구아이티교육원","댜구","777-7777-7777");

		Assert.assertNotNull(b);*/
	}
	@Test
	public void updatetest() {
		Buyer update = new Buyer(1, "re22", "대구", "전화없음");
		bs.updateItem(update);
		Assert.assertEquals(bs.selectByNo(7), update);
	}
}
