package com.stpl.product.global.operation.impl;

import java.util.List;

import com.stpl.product.global.modal.ItemMaster;
import com.stpl.product.global.operation.ItemOperation;
import com.stpl.product.global.operation.datasource.DataSource;

public class ItemOperationImpl implements ItemOperation{

	@Override
	public List<ItemMaster> search(Object dynamicQuery) {
		// TODO Auto-generated method stub
		return new DataSource().getItemList();
	}

	@Override
	public ItemMaster add(ItemMaster modelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster edit(ItemMaster modelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster view(int systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster delete(int systemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
