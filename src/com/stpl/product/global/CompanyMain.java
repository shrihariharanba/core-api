package com.stpl.product.global;

import java.util.List;

import com.stpl.product.global.modal.CompanyMaster;
import com.stpl.product.global.modal.CustomerMaster;
import com.stpl.product.global.modal.ItemMaster;
import com.stpl.product.global.operation.CompanyOperation;
import com.stpl.product.global.operation.Operation;
import com.stpl.product.global.operation.impl.CompanyOperationImpl;
import com.stpl.product.global.operation.impl.OperationImpl;

public class CompanyMain {

	
public static void main(String arg[]){
	Operation opt = OperationImpl.getOperation("CompanyMaster");
	Operation opt1 = OperationImpl.getOperation("ItemMaster");
	Operation opt2 = OperationImpl.getOperation("CustomerMaster");
	Object obj = new Object();
	
	
	
	List<CompanyMaster> dummy = opt.search(obj);
	
	
	
	
	List<ItemMaster> dummy1 = opt1.search(obj);
	List<CustomerMaster> dummy2 = opt2.search(obj);
	for(int i=0;i<dummy.size();i++){
		System.out.println(dummy.get(i).getCompanyName());
		System.out.println(dummy.get(i).getCompanyNo());
	}
	for(int i=0;i<dummy1.size();i++){
		System.out.println(dummy1.get(i).getItemName());
		System.out.println(dummy1.get(i).getItemNo());
	}
	for(int i=0;i<dummy2.size();i++){
		System.out.println(dummy2.get(i).getCustomerName());
		System.out.println(dummy2.get(i).getCustomerNo());
	}
	
}
	
}
