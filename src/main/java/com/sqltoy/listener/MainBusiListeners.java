package com.sqltoy.listener;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 启动监听
 */
@Component
public class MainBusiListeners implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    ApplicationContextUtils.setContext(event.getApplicationContext());
  }
}
