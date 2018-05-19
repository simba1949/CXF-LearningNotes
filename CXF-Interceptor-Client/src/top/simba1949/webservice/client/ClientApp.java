package top.simba1949.webservice.client;

import top.simba1949.webservice.service.impl.WSService;

public class ClientApp {
    public static void main(String[] args) {
        WSService wsService = new WSService();
        top.simba1949.webservice.service.WSService proxyService = wsService.getWSServiceImplPort();
        System.out.println(proxyService.getString("66666666"));
    }
}
