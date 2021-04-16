package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createDocket() {
        final ApiInfo apiInfo =
                new ApiInfoBuilder().title("api").description("API-Description").version("1").build();

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo)
                .groupName("groupName")
                .select()
                .apis(RequestHandlerSelectors.basePackage(getClass().getPackageName()))
                .paths(PathSelectors.any())
                .build();
    }
}
