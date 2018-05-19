package top.simba1949.webservice.client;

import top.simba1949.webservice.service.UserService;
import top.simba1949.webservice.service.UserServiceService;

public class ClientApp {
    public static void main(String[] args) {
        UserServiceService service = new UserServiceService();
        UserService proxyService = service.getUserServicePort();
        System.out.println(proxyService.getString());
    }
}
