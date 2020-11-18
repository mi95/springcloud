package com.app.config;

import com.app.model._MappingKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveRecordPluginConfig {
    // 以下三个信息在 src/mian/resources/application.properties配置的数据库连接信息
    @Value("${user.datasource.druid.username}")
    private String username;

    @Value("${user.datasource.druid.password}")
    private String password;

    @Value("${user.datasource.druid.url}")
    private String url;

    @Value("${user.datasource.druid.driverClassName}")
    private String driverClassName;

    @Bean
    public ActiveRecordPlugin initActiveRecordPlugin() {

        DruidPlugin druidPlugin = new DruidPlugin(url, username, password, driverClassName);

        ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);

        arp.setShowSql(false);

        arp.getEngine().setToClassPathSourceFactory();

        _MappingKit.mapping(arp);

        druidPlugin.start();
        arp.start();

        return arp;
    }
}