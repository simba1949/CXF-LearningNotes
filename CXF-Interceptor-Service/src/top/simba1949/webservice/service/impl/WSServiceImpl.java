package top.simba1949.webservice.service.impl;

import top.simba1949.webservice.service.WSService;

import javax.jws.WebService;

@WebService(serviceName = "wSService",
        targetNamespace = "http://impl.service.webservice.simba1949.top",
        endpointInterface = "top.simba1949.webservice.service.WSService")
public class WSServiceImpl implements WSService {
    @Override
    public String getString(String name) {
        return null;
    }
}
