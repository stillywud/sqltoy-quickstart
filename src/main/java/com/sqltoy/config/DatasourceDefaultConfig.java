package com.sqltoy.config;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class DatasourceDefaultConfig {


  @Value("${spring.datasource.url}")
  private String url;
  @Value("${spring.datasource.username}")
  private String user;
  @Value("${spring.datasource.password}")
  private String password;
  @Value("${spring.datasource.driver-class-name}")
  private String driverClass;
  @Value("${spring.datasource.druid.maxActive}")
  private Integer maxActive;
  @Value("${spring.datasource.druid.min-idle}")
  private Integer minIdle;
  @Value("${spring.datasource.druid.initial-size}")
  private Integer initialSize;
  @Value("${spring.datasource.druid.maxWait}")
  private Long maxWait;
  @Value("${spring.datasource.druid.numTestsPerEvictionRun}")
  private Long numTestsPerEvictionRun;
  @Value("${spring.datasource.druid.minEvictableIdleTimeMillis}")
  private Long minEvictableIdleTimeMillis;
  @Value("${spring.datasource.druid.testWhileIdle}")
  private Boolean testWhileIdle;
  @Value("${spring.datasource.druid.testWhileIdle}")
  private Boolean testOnBorrow;
  @Value("${spring.datasource.druid.testOnBorrow}")
  private Boolean testOnReturn;
  @Value("${spring.datasource.druid.validationQuery}")
  private String validationQuery;


  @Bean(name = "dataSource")
  @Primary
  public DataSource dataSource() {
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

