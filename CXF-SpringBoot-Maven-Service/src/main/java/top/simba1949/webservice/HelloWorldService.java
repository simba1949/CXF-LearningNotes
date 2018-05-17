package top.simba1949.webservice;

import javax.jws.WebService;

@WebService
public interface HelloWorldService {

    public String sayHi(String name);
}
