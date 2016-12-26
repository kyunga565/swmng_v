package kr.or.dgit.bigdata.swmng.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.swmng.dao.SwMngDao;
import kr.or.dgit.bigdata.swmng.dto.Company;
import kr.or.dgit.bigdata.swmng.util.MybatisSessionFactory;

public class CompanyService implements SwMngDao<Company> {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(CompanyService.class);

	private static final CompanyService instance = new CompanyService();

	public static CompanyService getInstance() {
		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - start");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - end");
		}
		return instance;
	}

	private CompanyService() {
	}

	

	@Override
	public void insertItem(Company item) {
		if (logger.isDebugEnabled()) {
			logger.debug("insertItem(Company) - start");
		}
		
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		SwMngDao<Company> companyDao = sqlSession.getMapper(SwMngDao.class);
		try {
			companyDao.insertItem(item);
			sqlSession.commit(); // mybatis는 오토커밋이 안됨 수동커밋.
		} finally {
			sqlSession.close();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("insertItem(Company) - end");
		}
	}

	@Override
	public void deleteItem(int idx) {
		if (logger.isDebugEnabled()) {
			logger.debug("deleteItem(int) - start");
		}
		
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		SwMngDao companyDao = sqlSession.getMapper(SwMngDao.class);
		try {
			companyDao.deleteItem(idx);
			sqlSession.commit(); // mybatis는 오토커밋이 안됨 수동커밋.
		} finally {
			sqlSession.close();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("deleteItem(int) - end");
		}
	}

	@Override
	public void updateItem(Company item) {
		if (logger.isDebugEnabled()) {
			logger.debug("updateItem(Company) - start");
		}
		
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		SwMngDao companyDao = sqlSession.getMapper(SwMngDao.class);
		try {
			companyDao.updateItem(item);
			sqlSession.commit(); // mybatis는 오토커밋이 안됨 수동커밋.
		} finally {
			sqlSession.close();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("updateItem(Company) - end");
		}
	}

	@Override
	public Company selectByNo(int idx) {
		if (logger.isDebugEnabled()) {
			logger.debug("selectByNo(int) - start");
		}
		
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		SwMngDao companyDao = sqlSession.getMapper(SwMngDao.class);
		try {
			Company returnCompany = (Company) companyDao.selectByNo(idx);
			if (logger.isDebugEnabled()) {
				logger.debug("selectByNo(int) - end");
			}
			return returnCompany;
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public List<Company> selectAll() {
		if (logger.isDebugEnabled()) {
			logger.debug("selectAll() - start");
		}
	
		SqlSession sqlSession = MybatisSessionFactory.openSession();
		SwMngDao companyDao = sqlSession.getMapper(SwMngDao.class);
		try {
			List<Company> returnList = companyDao.selectAll();
			if (logger.isDebugEnabled()) {
				logger.debug("selectAll() - end");
			}
			return returnList;
		} finally {
			sqlSession.close();
		}
	}

}