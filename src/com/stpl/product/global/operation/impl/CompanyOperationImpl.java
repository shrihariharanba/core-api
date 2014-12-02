package com.stpl.product.global.operation.impl;

import java.util.List;

import com.stpl.product.global.modal.CompanyMaster;
import com.stpl.product.global.operation.CompanyOperation;
import com.stpl.product.global.operation.datasource.DataSource;

public class CompanyOperationImpl implements CompanyOperation {

	@Override
	public List<CompanyMaster> search(Object dynamicQuery) {
		// TODO Auto-generated method stub
		return new DataSource().getCompanyList();
	}

	@Override
	public CompanyMaster add(CompanyMaster modelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyMaster edit(CompanyMaster modelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyMaster view(int systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyMaster delete(int systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	






}
