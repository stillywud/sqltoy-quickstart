package com.sqltoy.config;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


@Configuration
public class DatasourceMysqlConfig {


  @Value("${spring.datasource1.url}")
  private String url;
  @Value("${spring.datasource1.username}")
  private String user;
  @Value("${spring.datasource1.password}")
  private String password;
  @Value("${spring.datasource1.driver-class-name}")
  private String driverClass;
  @Value("${spring.datasource1.druid.maxActive}")
  private Integer maxActive;
  @Value("${spring.datasource1.druid.min-idle}")
  private Integer minIdle;
  @Value("${spring.datasource1.druid.initial-size}")
  private Integer initialSize;
  @Value("${spring.datasource1.druid.maxWait}")
  private Long maxWait;
  @Value("${spring.datasource1.druid.numTestsPerEvictionRun}")
  private Long numTestsPerEvictionRun;
  @Value("${spring.datasource1.druid.minEvictableIdleTimeMillis}")
  private Long minEvictableIdleTimeMillis;
  @Value("${spring.datasource1.druid.testWhileIdle}")
  private Boolean testWhileIdle;
  @Value("${spring.datasource1.druid.testWhileIdle}")
  private Boolean testOnBorrow;
  @Value("${spring.datasource1.druid.testOnBorrow}")
  private Boolean testOnReturn;
  @Value("${spring.datasource1.druid.validationQuery}")
  private String validationQuery;

  @Bean(name = "dataSourceTransactionManager")
  public DataSourceTransactionManager dataSourceTransactionManager() {
    DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
    dataSourceTransactionManager.setDataSource(dsMysqlDataSource());
    return dataSourceTransactionManager;
  }

  @Bean(name = "dsMysqlDataSource")
  //@Primary
  public DataSource dsMysqlDataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driverClass);
    dataSource.setUrl(url);
    dataSource.setUsername(user);
    dataSource.setPassword(password);

    //连接池配置
    dataSource.setMaxActive(maxActive);
    dataSource.setMinIdle(minIdle);
    dataSource.setInitialSize(initialSize);
    dataSource.setMaxWait(maxWait);
    dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    dataSource.setTestWhileIdle(testWhileIdle);
    dataSource.setTestOnBorrow(testOnBorrow);
    dataSource.setTestOnReturn(testOnReturn);
    dataSource.setValidationQuery(validationQuery);
    dataSource.setPoolPreparedStatements(true);
    dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);

    return dataSource;
  }

}

