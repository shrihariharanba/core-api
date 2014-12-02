package com.stpl.product.global.operation.impl;

import java.util.List;

import com.stpl.product.global.modal.CustomerMaster;
import com.stpl.product.global.operation.CustomerOperation;
import com.stpl.product.global.operation.datasource.DataSource;


public class CustomerOperationImpl implements CustomerOperation{

	@Override
	public List<CustomerMaster> search(Object dynamicQuery) {
		// TODO Auto-generated method stub
		return new DataSource().getCustomerList();
	}

	@Override
	public CustomerMaster add(CustomerMaster modelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerMaster edit(CustomerMaster modelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerMaster view(int systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerMaster delete(int systemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
