package br.ufsc.inf.lapesd.semantic.gateway.api.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/semantic-gateway-api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        this.register(RequestContextFilter.class);
        this.packages("br.ufsc.inf.lapesd.semantic.gateway.api.endpoint");
        this.register(CorsInterceptor.class);
    }
}