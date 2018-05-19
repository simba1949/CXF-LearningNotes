package top.simba1949.webservice.client;

import top.simba1949.webservice.service.WSService;
import top.simba1949.webservice.service.impl.WSServiceImplService;

public class ClientApp {
    public static void main(String[] args) {
        WSServiceImplService service = new WSServiceImplService();
        // proxyService 是代理service
        WSService proxyService = service.getWSServiceImplPort();
        System.out.println(proxyService.getWSServiceString("LiBai"));
    }
}
