package top.simba1949.webservice.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.simba1949.webservice.HelloWorldService;

import javax.xml.ws.Endpoint;

@Configuration
public class CXFConfig {

    @Autowired
    private Bus bus;

    @Autowired
    HelloWorldService helloWorldService;

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus,helloWorldService);
        endpoint.publish("/HelloWorldService");

        return endpoint;
    }
}
