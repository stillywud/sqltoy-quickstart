package com.sqltoy.controller;


import com.sqltoy.listener.ApplicationContextUtils;
import com.sqltoy.quickstart.service.StaffInfoService;
import com.sqltoy.quickstart.vo.CgformHeadVO;
import com.sqltoy.quickstart.vo.base.AbstractCgformHeadVO.Fields;
import com.sqltoy.service.AliServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.sagacity.sqltoy.dao.SqlToyLazyDao;
import org.sagacity.sqltoy.executor.QueryExecutor;
import org.sagacity.sqltoy.model.EntityQuery;
import org.sagacity.sqltoy.model.PaginationModel;
import org.sagacity.sqltoy.model.QueryResult;
import org.sagacity.sqltoy.service.SqlToyCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 资产控制器
 *
 * @author elton
 * @date 2019-05-19
 **/
@RestController
@RequestMapping("/index")

public class AliController {

  @Autowired
  SqlToyLazyDao sqlToyLazyDao;

  @Autowired
  StaffInfoService staffInfoService;

  @Autowired
  SqlToyCRUDService sqlToyCRUDService;

  @Autowired
  AliServiceImpl aliService;

  @RequestMapping(value = "info")
  public String info(
  ) {
    Map<String, Object> query2 = new HashMap<>();
    String querySql = "select * from cgform_head order by id desc";
    QueryExecutor queryExecutor = new QueryExecutor("select * from cgform_head order by id desc",
        new CgformHeadVO());
    queryExecutor.dataSource(null);

    PaginationModel model = new PaginationModel();
    QueryResult queryResult = sqlToyLazyDao.findPageByQuery(model, queryExecutor);
    PaginationModel<LinkedHashMap> queryResult1 = sqlToyLazyDao
        .findPageBySql(model, querySql, null, null, LinkedHashMap.class);
    querySql = "select * from t_b_mail_config";
    DataSource dataSource1 = (DataSource) ApplicationContextUtils.getBean("dsMysqlDataSource");
    PaginationModel<?> queryResult2 = sqlToyLazyDao.query().sql(querySql).dataSource(dataSource1)
        .resultType(LinkedHashMap.class).findPage(model);
    EntityQuery entityQuery = new EntityQuery();
    // DataSource dataSource= (DataSource) ApplicationContextUtils.getBean("datasource");

    // entityQuery.names("id").values("2c908f9475df41780175df43e1a60001");
    entityQuery.names(Fields.id).values("2c908f9475df41780175df43e1a60001");
    List<CgformHeadVO> newResult = sqlToyLazyDao.findEntity(CgformHeadVO.class, entityQuery);
    CgformHeadVO headQuery = new CgformHeadVO();
    headQuery.setId("2c908f9475df41780175df43e1a60001");
    CgformHeadVO head = sqlToyCRUDService.loadCascade(headQuery);
    List<CgformHeadVO> queryList = new ArrayList();
    CgformHeadVO query1 = new CgformHeadVO();
    query1.setCreateBy("admin");
    queryList.add(query1);
//    List<CgformHeadVO> allList = sqlToyCRUDService.loadAll(queryList);

    //  List<CgformHeadVO> list = sqlToyCRUDService.findFrom(headQuery);
    return "trigger ok ";
  }

  @RequestMapping(value = "info1")
  public String info1(
  ) {
    try {
      aliService.deal1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "trigger ok ";
  }


  @RequestMapping(value = "info2")
  public String info2(
  ) {
    try {
      aliService.deal2();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "trigger ok ";
  }

}
