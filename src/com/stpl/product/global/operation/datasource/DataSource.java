package com.stpl.product.global.operation.datasource;

import java.util.ArrayList;
import java.util.List;

import com.stpl.product.global.modal.CompanyMaster;
import com.stpl.product.global.modal.CustomerMaster;
import com.stpl.product.global.modal.ItemMaster;

public class DataSource {
	
	
	public List<CompanyMaster> getCompanyList(){
		List<CompanyMaster> companyList = new ArrayList<CompanyMaster>();
		CompanyMaster company;
		for(int i=0; i<5;i++){
			company= new CompanyMaster();
			company.setCompanySystemId(i);
			company.setCompanyId(i+"1");
			company.setCompanyName("Hari"+1);
			company.setCompanyNo(i+"Hari");
			companyList.add(company);
		}
		return companyList;
	}
	
	public List<ItemMaster> getItemList(){
		List<ItemMaster> itemList = new ArrayList<ItemMaster>();
		ItemMaster item;
		for(int i=0; i<5;i++){
			item= new ItemMaster();
			item.setItemSystemId(i);
			item.setItemId(i+"1");
			item.setItemName("Shri"+1);
			item.setItemNo(i+"Shri");
			itemList.add(item);
		}
		return itemList;
	}
	
	public List<CustomerMaster> getCustomerList(){
		List<CustomerMaster> customerList = new ArrayList<CustomerMaster>();
		CustomerMaster customer;
		for(int i=0; i<5;i++){
			customer= new CustomerMaster();
			customer.setCustomerSystemId(i);
			customer.setCustomerId(i+"1");
			customer.setCustomerName("Haran"+1);
			customer.setCustomerNo(i+"Haran");
			customerList.add(customer);
		}
		return customerList;
	}
	
}
