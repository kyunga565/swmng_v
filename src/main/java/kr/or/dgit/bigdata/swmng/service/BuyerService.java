package kr.or.dgit.bigdata.swmng.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

import kr.or.dgit.bigdata.swmng.dto.Buyer;
import kr.or.dgit.bigdata.swmng.mappers.BuyerMapper;
import kr.or.dgit.bigdata.swmng.util.MybatisSessionFactory;

public class BuyerService implements BuyerMapper<Buyer> {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(BuyerService.class);
	
	private static final BuyerService instance = new BuyerService();
	
	public static BuyerService getInstance() {
		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - start");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - end");
		}
		return instance;
	}
	private BuyerService(){}

	@Override
	public void insertItem(Buyer item) {
		if (logger.isDebugEnabled()) {
			logger.debug("insertStudent(Student) - start");
		}
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		try{
			BuyerMapper studentMapper = sqlSession.getMapper(BuyerMapper.class);
			sqlSession.commit();
			return ;
		}finally{
			sqlSession.close();
		}
	}

	@Override
	public void deleteItem(int idx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItem(Buyer item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Buyer selectByNo(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> selectByAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
