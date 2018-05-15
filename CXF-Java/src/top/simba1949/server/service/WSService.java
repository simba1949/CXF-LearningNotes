package top.simba1949.server.service;

import javax.jws.WebService;

/**
 * WebService接口
 */
@WebService
public interface WSService {
    public String sayHi(String name);
}
