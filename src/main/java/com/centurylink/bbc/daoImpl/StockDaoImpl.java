package com.centurylink.bbc.daoImpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.centurylink.bbc.dao.AbstractDao;
import com.centurylink.bbc.dao.StockDao;
import com.centurylink.bbc.model.Stock;

@Repository("stockDao")
@Transactional
public class StockDaoImpl extends AbstractDao<Stock> implements StockDao {

	
	@Override
	public List<Stock> getStock(String StockId) {
		String hqlQuery = "from Stock where stockId = ?1";
		 List<Stock> list = executeQuery(hqlQuery, StockId);
		return list;
	}

	@Override
	public void persistStock(Stock stock) {
		persist(stock);
	}
	
	
	


}
