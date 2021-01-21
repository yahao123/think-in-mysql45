package com.wyh.think.in.mysql45.test1.service;

import com.wyh.think.in.mysql45.test1.mapper.T1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

@Service
public class T1Service {

    @Autowired
    DataSourceTransactionManager dataSourceTransactionManager;


    @Autowired
    TransactionDefinition transactionDefinition;

    @Autowired
    private T1Mapper t1Mapper;

    public void  test1(){
        //开启事务
        TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(transactionDefinition);
        try {
            int i = t1Mapper.updatedwherid7();
            //提交事务
            dataSourceTransactionManager.commit(transactionStatus);
        }catch (Exception e){
            e.printStackTrace();
            //回滚事务
            dataSourceTransactionManager.rollback(transactionStatus);
        }
    }



}
