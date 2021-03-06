package com.liuke.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean("文件服务")
    public Docket userApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("文件服务")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/file/.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }

    @Bean("测试")
    public Docket personApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("测试")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/test/.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Bingo系统接口文档")
                .description("~~~~~~~~~~")
                .termsOfServiceUrl("https://xingtian.github.io/trace.github.io/")
                .version("1.0")
                .build();
    }
}
