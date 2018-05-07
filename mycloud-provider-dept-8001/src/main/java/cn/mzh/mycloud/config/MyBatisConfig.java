package cn.mzh.mycloud.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author xp-zhao@logictech.cn
 * @CreateOn 2016/12/20^ 13:16 in dwSecurities
 * @Modify 2017/05/11^ 11:16 in lt by wb-jin@logictech.cn
 * @Path /
 * @ContentType Content-Type/application-json
 * @Parameter
 * @Remark
 */
@Configuration
@MapperScan("cn.mzh.mycloud.mapper")
public class MyBatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
//        分页插件
        PageHelper pageHelper = new PageHelper();
        Properties props = new Properties();
        props.setProperty("reasonable", "true");
        props.setProperty("supportMethodsArguments", "true");
        props.setProperty("returnPageInfo", "check");
        props.setProperty("params", "count=countSql");
        pageHelper.setProperties(props);
        sessionFactory.setPlugins(new Interceptor[]{pageHelper});
//        mybatis xml映射
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:sqlmap/*.xml"));
        sessionFactory.setTypeAliasesPackage("cn.mzh.mycloud.vo");
        return sessionFactory.getObject();
    }
}
