package com.user.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class ActiveRecordPluginConfig {
    /**
     * 初始化连接池
     * @return
     */
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "user.datasource.druid")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    /**
     * 设置数据源代理
     */
//    @Bean
//    public TransactionAwareDataSourceProxy transactionAwareDataSourceProxy() {
//        TransactionAwareDataSourceProxy transactionAwareDataSourceProxy = new TransactionAwareDataSourceProxy();
//        transactionAwareDataSourceProxy.setTargetDataSource(druidDataSource());
//        return transactionAwareDataSourceProxy;
//    }

//    @Bean
//    public ActiveRecordPlugin initActiveRecordPlugin() {
//        ActiveRecordPlugin arp = new ActiveRecordPlugin(transactionAwareDataSourceProxy());
//        arp.setDialect(new MysqlDialect());
//        arp.setShowSql(false);
//        _MappingKit.mapping(arp);
//        arp.start();
//        return arp;
//    }


    /**
     * 设置事务管理
     */
//    @Bean
//    public DataSourceTransactionManager dataSourceTransactionManager() {
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(transactionAwareDataSourceProxy());
//        return dataSourceTransactionManager;
//    }
}