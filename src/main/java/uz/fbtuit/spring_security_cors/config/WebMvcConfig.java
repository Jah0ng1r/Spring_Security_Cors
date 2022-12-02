package uz.fbtuit.spring_security_cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/coffee")
                .allowedOrigins("http://localhost:8000")
                .allowedMethods("GET", "DELETE");
    }
}
