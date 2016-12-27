package kr.or.dgit.bigdata.swmng.dao;

import java.util.List;

public interface SoftwareDao<T> {
	void insertItem(T item);

	void deleteItem(int idx);

	void updateItem(T item);

	T selectByNo(int idx);

	List<T> selectAll();
}
