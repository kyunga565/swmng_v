package kr.or.dgit.bigdata.swmng.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

import kr.or.dgit.bigdata.swmng.dto.Buyer;
import kr.or.dgit.bigdata.swmng.dto.Software;
import kr.or.dgit.bigdata.swmng.mappers.BuyerMapper;
import kr.or.dgit.bigdata.swmng.mappers.SoftwareMapper;
import kr.or.dgit.bigdata.swmng.util.MybatisSessionFactory;

public class BuyerService implements BuyerMapper<Buyer> {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(BuyerService.class);
	
	private static final BuyerService instance = new BuyerService();
	
	public static BuyerService getInstance() {
		return instance;
	}
	private BuyerService(){}

	@Override
	public void insertItem(Buyer item) {
		if (logger.isDebugEnabled()) {
			logger.debug("insertStudent(Student) - start");
		}
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		BuyerMapper<Buyer> buyermapper = sqlSession.getMapper(BuyerMapper.class);
		try{
			
			buyermapper.insertItem(item);
	
			sqlSession.commit();
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
		if (logger.isDebugEnabled()) {
			logger.debug("updateItem(Company) - start");
		}

		SqlSession sqlSession = MybatisSessionFactory.openSession();
		BuyerMapper<Buyer> buyerDao = sqlSession.getMapper(BuyerMapper.class);
		try {
			buyerDao.updateItem(item);
			sqlSession.commit(); // mybatis는 오토커밋이 안됨 수동커밋.
		} finally {
			sqlSession.close();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("updateItem(Company) - end");
		}
		
	}

	@Override
	public Buyer selectByNo(int idx) {
		if (logger.isDebugEnabled()) {
			logger.debug("selectByNo(int) - start");
		}

		SqlSession sqlSession = MybatisSessionFactory.openSession();
		BuyerMapper<Buyer> buyerDao = sqlSession.getMapper(BuyerMapper.class);
		try {
			Buyer returnbuyer = buyerDao.selectByNo(idx);
			if (logger.isDebugEnabled()) {
				logger.debug("selectByNo(int) - end");
			}
			return returnbuyer;
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public List<Buyer> selectByAll() {
		if (logger.isDebugEnabled()) {
			logger.debug("selectAll() - start");
		}

		SqlSession sqlSession = MybatisSessionFactory.openSession();
		BuyerMapper buyerDao = sqlSession.getMapper(BuyerMapper.class);
		try {
			List<Buyer> returnList = buyerDao.selectByAll();
			if (logger.isDebugEnabled()) {
				logger.debug("selectAll() - end");
			}
			return returnList;
		} finally {
			sqlSession.close();
		}
	}
}
