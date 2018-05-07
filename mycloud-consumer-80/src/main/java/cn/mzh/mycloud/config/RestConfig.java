package cn.mzh.mycloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author JG.Hannibal
 * @since 2017/11/9 涓嬪崍4:37
 */
@Configuration
public class RestConfig {
   @Bean
   public RestTemplate getRestTemplate() {
	   return new RestTemplate();
   }
}
    