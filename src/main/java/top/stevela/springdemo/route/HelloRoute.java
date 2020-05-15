package top.stevela.springdemo.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import top.stevela.springdemo.handle.HelloHandle;

@Configuration
public class HelloRoute {

    @Bean
    public RouterFunction<ServerResponse> routeHello(HelloHandle helloHandle) {
        return RouterFunctions
                .route(RequestPredicates.GET("/test")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), helloHandle::hello);
    }


}
