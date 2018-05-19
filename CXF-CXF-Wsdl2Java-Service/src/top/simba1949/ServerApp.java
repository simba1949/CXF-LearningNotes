package top.simba1949;

import org.apache.cxf.jaxws.EndpointImpl;
import top.simba1949.webservice.service.impl.WSServiceImpl;

public class ServerApp {
    public static void main(String[] args) {
        System.out.println("服务发布开始");
        EndpointImpl.publish("http://localhost:8880/ws",new WSServiceImpl());
        System.out.println("服务发布完成");
    }
}
