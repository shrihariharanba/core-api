package com.stpl.product.global.operation;

import java.util.List;

public interface Operation<E> {

	
	public List<E> search(Object dynamicQuery);
	
	public  E add(E modelName);
	
	public  E edit(E modelName);
	
	public E view(int systemId);
	
	public E delete(int systemId);
	
	
	
	
	
}
