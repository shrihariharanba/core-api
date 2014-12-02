package com.stpl.product.global.operation.impl;

import com.stpl.product.global.operation.Operation;

public class OperationImpl {

	public static Operation getOperation(String modelName){
		switch(modelName){
		
		case "CompanyMaster":
		{
			return new CompanyOperationImpl();
		
		}
		
		case "ItemMaster":
		{
			return new ItemOperationImpl();
		
		}
		
		case "CustomerMaster":
		{
			return new CustomerOperationImpl();
		
		}
	}
		return new CompanyOperationImpl();
}
}