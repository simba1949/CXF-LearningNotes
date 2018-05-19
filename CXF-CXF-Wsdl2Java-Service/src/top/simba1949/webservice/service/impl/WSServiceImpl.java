package top.simba1949.webservice.service.impl;

import top.simba1949.webservice.service.WSService;

import javax.jws.WebService;

@WebService(endpointInterface = "top.simba1949.webservice.service.WSService")
public class WSServiceImpl implements WSService {
    @Override
    public String getWSServiceString(String name) {
        return "WSServiceImpl @" + name;
    }
}
