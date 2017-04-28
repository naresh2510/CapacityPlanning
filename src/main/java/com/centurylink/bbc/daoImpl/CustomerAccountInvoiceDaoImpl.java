package com.centurylink.bbc.daoImpl;

import java.util.List;

import com.centurylink.bbc.dao.AbstractDao;
import com.centurylink.bbc.dao.CustomerAccountInvoiceDao;
import com.centurylink.bbc.model.CustomerAccountInvoice;

public class CustomerAccountInvoiceDaoImpl extends AbstractDao<CustomerAccountInvoice> implements CustomerAccountInvoiceDao {

	@Override
	public CustomerAccountInvoice getDataWithBTN(String btn) {
		CustomerAccountInvoice customerAccountInvoice = null;
		List<CustomerAccountInvoice> list = executeQuery("from CustomerAccountInvoice where CustomerAccountInvoice.billingAccountId = ?0",btn);
		if(!list.isEmpty() && list.size() >=0){
			customerAccountInvoice = list.get(0);	
		}
		return customerAccountInvoice;
	}
   
}
