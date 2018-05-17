package top.simba1949.server.service.impl;

import top.simba1949.server.service.WSService;

import javax.jws.WebService;
/**
 * WebService接口实现类
 */
@WebService
public class WSServiceImpl implements WSService {
    @Override
    public String sayHi(String name) {

        return "Hi @" + name;
    }
}
