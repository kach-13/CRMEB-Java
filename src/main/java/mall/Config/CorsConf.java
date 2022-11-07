//package mall.Config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class CorsConf {
//    @Bean
//    public FilterRegistrationBean corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//
//        // 设置你要允许的网站域名，如果全允许则设为 *
//        //config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedOrigin("http://localhost:8080");
//
//        //自定义可选：Origin, X-Requested-With, Content-Type, Accept, Connection, User-Agent, Cookie,token
//        //String allowHeaders = "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With, Authorization";
//        config.addAllowedHeader("http://localhost:8080");
//        config.addExposedHeader("Authorization");
//
//        //以下或者用config.addAllowedMethod("*"); 为了满足360安全要求禁用了options以及put,deleted方法
//        config.addAllowedMethod("OPTIONS");
//        config.addAllowedMethod("HEAD");
//        config.addAllowedMethod("GET");
//        // config.addAllowedMethod("PUT");
//        config.addAllowedMethod("POST");
//        // config.addAllowedMethod("DELETE");
//        config.addAllowedMethod("PATCH");
//
//
//
//        source.registerCorsConfiguration("/**", config);
//        // return new CorsFilter(source);
//        final FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
//        // 这个顺序很重要哦，为避免麻烦请设置在最前
//        bean.setOrder(0);
//        return bean;
//    }
//}
