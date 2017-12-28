package com.lemo.cmx.touting;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by 罗选通 on 2017/9/6.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

  @Override
  protected Object determineCurrentLookupKey() {
    return DatabaseContextHolder.getCustomerType();
  }
}
