package top.simba1949.server.service;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface WSService {
    public String sayHello(String name);

    public List<String> getList();

    public int getIntValue(int intValue);
}
