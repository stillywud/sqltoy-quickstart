package com.sqltoy.service;

import com.sqltoy.listener.ApplicationContextUtils;
import com.sqltoy.quickstart.vo.CgformHeadVO;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sagacity.sqltoy.dao.SqlToyLazyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Component
public class AliServiceImpl {

  @Autowired
  SqlToyLazyDao sqlToyLazyDao;

  @Autowired
  DataSourceTransactionManager dataSourceTransactionManager;

  private final Log logger = LogFactory.getLog(getClass());

  @Transactional
  public void deal() throws Exception {

    DataSource dataSource1 = (DataSource) ApplicationContextUtils.getBean("dsMysqlDataSource");

    sqlToyLazyDao.query()
        .sql("select * from cgform_head  where id='2c908f9475d987890175d9bb0a170050'")
        .dataSource(dataSource1).getOne();
    CgformHeadVO cgformHeadVO = new CgformHeadVO();
    cgformHeadVO.setId("2c908f9475d987890175d9bb0a170050");
    cgformHeadVO = sqlToyLazyDao.load(cgformHeadVO);
    logger.info(cgformHeadVO);
    String version = cgformHeadVO.getJformVersion();
    logger.info("当前的版本为" + version);
    int v = Integer.parseInt(version);
    v = v + 1;
    cgformHeadVO.setJformVersion(String.valueOf(v));
    sqlToyLazyDao.saveOrUpdate(cgformHeadVO);
    cgformHeadVO = sqlToyLazyDao.load(cgformHeadVO);
    logger.info("增加之后的版本" + cgformHeadVO.getJformVersion());

    sqlToyLazyDao.save(cgformHeadVO);
    throw new Exception("测试意外");

  }

  @Transactional("dataSourceTransactionManager")
  public void deal1() throws Exception {

    DataSource dataSource1 = (DataSource) ApplicationContextUtils.getBean("dsMysqlDataSource");
    CgformHeadVO model = new CgformHeadVO();
    List<?> list = sqlToyLazyDao.query()
        .sql("select * from cgform_head  where id='2c908f9475d987890175d9bb0a170050'")
        .dataSource(dataSource1).resultType(CgformHeadVO.class).find();
    CgformHeadVO cgformHeadVO = (CgformHeadVO) (list.get(0));
    logger.info(cgformHeadVO);
    String version = cgformHeadVO.getJformVersion();
    logger.info("当前的版本为" + version);
    int v = Integer.parseInt(version);
    v = v + 1;
    cgformHeadVO.setJformVersion(String.valueOf(v));
    sqlToyLazyDao.update().dataSource(dataSource1).one(cgformHeadVO);
    list = sqlToyLazyDao.query()
        .sql("select * from cgform_head  where id='2c908f9475d987890175d9bb0a170050'")
        .dataSource(dataSource1).resultType(CgformHeadVO.class).find();
    cgformHeadVO = (CgformHeadVO) (list.get(0));
    logger.info("增加之后的版本" + cgformHeadVO.getJformVersion());

    sqlToyLazyDao.save().dataSource(dataSource1).one(cgformHeadVO);
    throw new Exception("测试意外");

  }


  public void deal2() throws Exception {

    //方法内的事务控制
    DefaultTransactionDefinition def = new DefaultTransactionDefinition();
    def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    TransactionStatus status = dataSourceTransactionManager.getTransaction(def);
    try {

      DataSource dataSource1 = (DataSource) ApplicationContextUtils.getBean("dsMysqlDataSource");
      CgformHeadVO model = new CgformHeadVO();
      List<?> list = sqlToyLazyDao.query()
          .sql("select * from cgform_head  where id='2c908f9475d987890175d9bb0a170050'")
          .dataSource(dataSource1).resultType(CgformHeadVO.class).find();
      CgformHeadVO cgformHeadVO = (CgformHeadVO) (list.get(0));
      logger.info(cgformHeadVO);
      String version = cgformHeadVO.getJformVersion();
      logger.info("当前的版本为" + version);
      int v = Integer.parseInt(version);
      v = v + 1;
      cgformHeadVO.setJformVersion(String.valueOf(v));
      sqlToyLazyDao.update().dataSource(dataSource1).one(cgformHeadVO);
      list = sqlToyLazyDao.query()
          .sql("select * from cgform_head  where id='2c908f9475d987890175d9bb0a170050'")
          .dataSource(dataSource1).resultType(CgformHeadVO.class).find();
      cgformHeadVO = (CgformHeadVO) (list.get(0));
      logger.info("增加之后的版本" + cgformHeadVO.getJformVersion());

      sqlToyLazyDao.save().dataSource(dataSource1).one(cgformHeadVO);
    } catch (Exception ex) {
      dataSourceTransactionManager.rollback(status);
      throw ex;
    }
    dataSourceTransactionManager.commit(status);
//    throw new Exception("测试意外");

  }
}
