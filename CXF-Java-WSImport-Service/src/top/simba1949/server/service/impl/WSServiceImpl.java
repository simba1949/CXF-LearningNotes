package top.simba1949.server.service.impl;

import top.simba1949.server.service.WSService;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "top.simba1949.server.service.WSService")
public class WSServiceImpl implements WSService {
        @Override
        public String sayHello(String name) {
            return "Hi @" + name;
        }

        @Override
        public List<String> getList() {
            List<String> list = new ArrayList<>();
            list.add("libai");
            list.add("dufu");
            list.add("baijuyi");
            return list;
        }

        @Override
        public int getIntValue(int intValue) {
            return intValue;
        }

}
