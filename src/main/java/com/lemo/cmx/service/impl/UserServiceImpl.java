package com.lemo.cmx.service.impl;

import com.lemo.cmx.dao.UserDao;
import com.lemo.cmx.pojo.User;
import com.lemo.cmx.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Autowired
  private DataSourceTransactionManager transactionManager;

  @Override
  public User getUserById(Integer id) {
    DefaultTransactionDefinition def = new DefaultTransactionDefinition();
    def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW); // 事物隔离级别，开启新事务，这样会比较安全些。
    TransactionStatus status = transactionManager.getTransaction(def); // 获得事务状态
    try {
      //逻辑代码，可以写上你的逻辑处理代码
      User user = new User();
      user.setName("达");
      int insert = userDao.insert(user);
      boolean flag=false;
      if(insert>0){
        flag=userDao.deleteById(2)>0;
      }
      if(flag) {
        transactionManager.commit(status);
      } else{
        transactionManager.rollback(status);
      }
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollback(status);
    }
//      log.print("213132132");
    log.error("请求参数校验结果：");
    return null;
  }

}
