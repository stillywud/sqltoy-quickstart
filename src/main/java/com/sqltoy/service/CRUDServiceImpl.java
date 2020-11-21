package com.sqltoy.service;

import java.io.Serializable;
import java.util.List;
import org.sagacity.sqltoy.service.impl.SqlToyCRUDServiceImpl;

public class CRUDServiceImpl extends SqlToyCRUDServiceImpl implements CRUDService {

  @Override
  public <T extends Serializable> List<T> findList(T entity) {
    return null;
  }
}
