package com.xiaoshabao.bill.bd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置
 * <p>使用static-path-pattern后无法找到ui界面，需要再webconfig中重新注入路径</p>
 * Swagger2测试界面访问 http://localhost:8080/swagger-ui.html <br>
 * 注解使用@ApiOperation<br>
 * 		body 使用@RequestBody接收数据 POST有效<br>
 *		path 在url中配置{}的参数<br>
 *		query 普通查询参数 例如 ?query=q ,jquery ajax中data设置的值也可以，例如 {query:”q”},springMVC中不需要添加注解接收<br>
 *		header 使用@RequestHeader接收数据<br>
 *		form 笔者未使用，请查看官方API文档<br>
 * </p>
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	
	/**
	 * 创建界面访问api
	 * @return
	 */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("页面接口")
                .apiInfo(apiInfo())
                .select()
                //需要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.xiaoshabao.bill.bd.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    
    
    /**
	 * 创建api接口测试（可以创建多个开启本方法bean注解即可）
	 * @return
	*/
//    @Bean
    public Docket createApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("api接口")
                .apiInfo(apiInfo())
                .select()
                //需要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.xiaoshabao.bill.bd.api"))
                .paths(PathSelectors.any())
                .build();
    } 

    /**
     * Api的基本信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("资源构建RESTful APIs")
                .description("描述项目是111")
//                .termsOfServiceUrl("http://servviceurl.com/")
//                .contact(new Contact("资源项目", "http://Contacturl.com/", "manxx5521@163.com"))
                .version("1.0")
                .build();
    }

}