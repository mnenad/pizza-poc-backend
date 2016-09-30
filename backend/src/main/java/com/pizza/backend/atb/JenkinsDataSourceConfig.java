package com.pizza.backend.atb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
@Profile("jenkins")
public class JenkinsDataSourceConfig {

    @Bean
    public EmbeddedDatabase dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase ed = builder
                                .setName("test")
                                .setType(EmbeddedDatabaseType.H2)
                                .build();
        System.out.println("*******Embeded database created*******");
        return ed;
    }
    @Bean
    public ResourceDatabasePopulator populator() {
        ResourceDatabasePopulator pop = new ResourceDatabasePopulator();
        pop.addScript(new ClassPathResource("db//migration//V1__create_order.sql"));
        pop.setContinueOnError(true);
        System.out.println("*******Embeded database populated*******");
        return pop;
    }

    @Bean
    public DataSourceInitializer dbInit(EmbeddedDatabase ds, ResourceDatabasePopulator populator) {
        DataSourceInitializer init = new DataSourceInitializer();
        init.setDataSource(ds);
        init.setDatabasePopulator(populator);
        init.setEnabled(true);
        System.out.println("*******Embeded database initialized*******");
        return init;
    }
}
