package com.sqltoy.service;

import java.io.Serializable;
import java.util.List;

public interface CRUDService {


  public <T extends Serializable> List<T> findList(T entity);

}
