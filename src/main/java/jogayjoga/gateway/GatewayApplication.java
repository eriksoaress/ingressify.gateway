// package jogayjoga.gateway;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;
// import org.springframework.context.annotation.Bean;

// @EnableSwagger2
// @EnableDiscoveryClient
// @SpringBootApplication
// public class GatewayApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(GatewayApplication.class, args);
//     }

//     @Bean
//     public Docket api() {
//         return new Docket(DocumentationType.SWAGGER_2)
//                 .select()
//                 .apis(RequestHandlerSelectors.basePackage("jogayjoga.gateway.controllers"))
//                 .paths(PathSelectors.any())
//                 .build();
//     }
// }

package jogayjoga.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    
}
