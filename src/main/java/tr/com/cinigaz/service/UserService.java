package tr.com.cinigaz.service;

import tr.com.cinigaz.entities.User;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "UserService")
public interface UserService {
    @WebMethod()
    @WebResult(name = "User")
    User findUserByuserId(Long userId);
}
