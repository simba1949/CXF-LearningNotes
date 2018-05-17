package top.simba1949.webservice.impl;

import org.springframework.stereotype.Component;
import top.simba1949.webservice.HelloWorldService;

import javax.jws.WebService;

@Component
@WebService(serviceName = "/HelloWorldService",//暴露服务名称
        targetNamespace = "http://impl.webservice.simba1949.top",//命名空间，一般是包名倒序
        endpointInterface = "top.simba1949.webservice.HelloWorldService"//接口的全路径
)
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHi(String name) {
        return "Hi @" + name;
    }
}
