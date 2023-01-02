// package org.charlie.config;
//
// import com.zaxxer.hikari.HikariDataSource;
// import org.apache.ibatis.session.SqlSessionFactory;
// import org.mybatis.spring.SqlSessionFactoryBean;
// import org.mybatis.spring.SqlSessionTemplate;
// import org.mybatis.spring.annotation.MapperScan;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.boot.context.properties.EnableConfigurationProperties;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
// import javax.sql.DataSource;
//
// /**
//  * TODO
//  *
//  * @author Charlie-6327
//  * @date 2021/12/11
//  */
//
// @Configuration
// @MapperScan(basePackages = "org.charlie.dao.blog1", sqlSessionFactoryRef = "blog1SqlSessionFactory")
// @EnableConfigurationProperties(Blog1Properties.class)
// public class Blog1Config {
//
//     @Bean("blog1DataSource")
//     public DataSource dataSource(Blog1Properties properties) {
//         return DataSourceBuilder.create().url(properties.getUrl())
//                 .username(properties.getUsername())
//                 .password(properties.getPassword())
//                 .driverClassName(properties.getDriverClassName())
//                 .type(HikariDataSource.class).build();
//     }
//
//     @Bean("blog1SqlSessionFactory")
//     public SqlSessionFactory sqlSessionFactory(@Qualifier("blog1DataSource") DataSource dataSource) throws Exception {
//         SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//         factoryBean.setDataSource(dataSource);
//         factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/blog1/*.xml"));
//         return factoryBean.getObject();
//     }
//
//     @Bean("blog1SqlSessionTemplate")
//     public SqlSessionTemplate sqlSessionTemplate(@Qualifier("blog1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//         return new SqlSessionTemplate(sqlSessionFactory);
//     }
//
// }
