package top.simba1949.server.service.impl;

import top.simba1949.server.service.WSService;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @WebService(endpointInterface = "top.simba1949.server.service.WSService")
 * endpointInterface 接口的全限定名
 */
@WebService(endpointInterface = "top.simba1949.server.service.WSService")
public class WSServiceImpl implements WSService {

        public String sayHello(String name) {
            return "Hi @" + name;
        }

        public List<String> getList() {
            List<String> list = new ArrayList<String>();
            list.add("libai");
            list.add("dufu");
            list.add("baijuyi");
            return list;
        }

        public int getIntValue(int intValue) {
            return intValue;
        }

}
