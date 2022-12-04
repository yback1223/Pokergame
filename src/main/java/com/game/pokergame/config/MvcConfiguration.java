package com.game.pokergame.config;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**") // / 이후의 모든 파일에 적용
            .addResourceLocations("classpath:/templates/", "classpath:/static/") // 파일 찾는 곳을 추가
            .setCacheControl(CacheControl.maxAge(10, TimeUnit.SECONDS)); // 캐시 유효 기간 10분
    }


}


