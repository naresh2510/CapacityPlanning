package com.centurylink.bbc.dao;

import java.util.List;

import com.centurylink.bbc.model.Stock;

public interface StockDao {
	
	public List<Stock> getStock(String Stockid);
	
	public void persistStock(Stock stock);

}
