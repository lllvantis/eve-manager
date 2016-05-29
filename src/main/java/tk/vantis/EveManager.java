package tk.vantis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Index Controller
 * Created by Vantis on 2016/4/21.
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class EveManager {

    @Bean
    public SqlSessionTemplate readOnlySqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(readOnlySqlSessionFactory());
    }

    @Bean
    public SqlSessionTemplate writableSqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(writableOnlySqlSessionFactory());
    }

    @Bean
    @ConfigurationProperties(prefix = "mybatis")
    public SqlSessionFactory readOnlySqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(readOnlyDataSource());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    @ConfigurationProperties(prefix = "mybatis")
    public SqlSessionFactory writableOnlySqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(writableDataSource());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.readOnlyDataSource")
    public DataSource readOnlyDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDefaultReadOnly(true);
        return dataSource;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.readOnlyDataSource")
    public DataSource writableDataSource() {
        return new DataSource();
    }

    @Bean
    public PlatformTransactionManager readOnlyTransactionManager() {
        return new DataSourceTransactionManager(readOnlyDataSource());
    }

    @Bean
    public PlatformTransactionManager writableTransactionManager() {
        return new DataSourceTransactionManager(writableDataSource());
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(EveManager.class, args);
    }
}
