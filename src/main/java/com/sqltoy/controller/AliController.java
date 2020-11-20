package com.sqltoy.controller;


import com.sqltoy.quickstart.service.StaffInfoService;
import org.sagacity.sqltoy.dao.SqlToyLazyDao;
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
  @RequestMapping(value = "info")
  public String info(
  ) {
    return "trigger ok ";
  }


}
