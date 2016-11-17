package org.pnv.mobileshop.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao <T, PK extends Serializable> {
 
	T findOne(PK id);
	List<T> findAll();
}
