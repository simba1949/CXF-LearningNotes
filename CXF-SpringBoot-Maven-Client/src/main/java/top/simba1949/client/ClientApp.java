package top.simba1949.client;

import top.simba1949.webservice.HelloWorldService;
import top.simba1949.webservice.impl._002fHelloWorldService;

public class ClientApp {
    public static void main(String[] args) {
        _002fHelloWorldService service = new _002fHelloWorldService();
        HelloWorldService proxyService = service.getHelloWorldServiceImplPort();
        System.out.println(proxyService.sayHi("55"));
    }
}
