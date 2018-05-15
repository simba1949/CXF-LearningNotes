package top.simba1949.client;

import top.simba1949.server.service.WSService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientApp {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8888/ws?wsdl");
        QName qName = new QName("http://impl.service.server.simba1949.top/", "WSServiceImplService");

        Service service = Service.create(url, qName);
        /* 过于依赖 WSService */
        WSService wsService = service.getPort(WSService.class);
        System.err.println(wsService.sayHi("China"));
    }
}
