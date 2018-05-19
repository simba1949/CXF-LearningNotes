package top.simba1949;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import top.simba1949.webservice.service.impl.WSServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * 注意：EndpointImpl 是 apache jar下的类：org.apache.cxf.jaxws.EndpointImpl;
 * Endpoint 是jdk中类：javax.xml.ws.Endpoint;
 */
public class CXFServer {
    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.publish("http://localhost:8881/ws", new WSServiceImpl());
        EndpointImpl endpointImpl = (EndpointImpl) endpoint;

        // 添加日志拦截器
        //如果没有指定路径，默认在控制台输出
        endpointImpl.getInInterceptors().add(new LoggingInInterceptor());
        endpointImpl.getOutInterceptors().add(new LoggingOutInterceptor());

        //指定路径
        /*
        endpointImpl.getInInterceptors().add(new LoggingInInterceptor("D:/in.txt"));
        endpointImpl.getOutInterceptors().add(new LoggingOutInterceptor("D:/out.txt"));
        */
    }
}
