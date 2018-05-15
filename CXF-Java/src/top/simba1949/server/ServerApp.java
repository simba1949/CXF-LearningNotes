package top.simba1949.server;

import top.simba1949.server.service.impl.WSServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * 发布WebService服务
 */
public class ServerApp {
    public static void main(String[] args) {
        System.out.println("WebService 服务发布开始");
        Endpoint.publish("http://localhost:8888/ws",new WSServiceImpl());
        System.out.println("WebService 服务发布完成");
    }
}
