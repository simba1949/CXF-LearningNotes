package top.simba1949.client;

import top.simba1949.server.service.impl.WSService;
import top.simba1949.server.service.impl.WSServiceImplService;

/**
 * 客户端调用
 */
public class ClientApp {
    public static void main(String[] args) {
        // 创建WSServiceImplService对象
        WSServiceImplService service = new WSServiceImplService();
        // 创建一个代理对象WSService，代理对象即为服务端WWService对象
        WSService proxyService = service.getWSServiceImplPort();
        // 使用代理对象调用WWService的方法
        System.out.println(proxyService.getIntValue(1));
        System.out.println(proxyService.getList());
        System.out.println(proxyService.sayHello("China"));
    }
}
