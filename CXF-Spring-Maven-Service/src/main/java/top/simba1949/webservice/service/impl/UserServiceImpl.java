package top.simba1949.webservice.service.impl;

import org.springframework.stereotype.Component;
import top.simba1949.webservice.service.UserService;

@Component("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public String getString() {
        return "UserServiceImpl";
    }
}
