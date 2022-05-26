package tr.com.cinigaz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.cinigaz.entities.User;
import tr.com.cinigaz.repository.UserRepository;
import tr.com.cinigaz.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findUserByuserId(Long userId) {
        User user = userRepository.findUserByuserId(userId);
        return user;
    }
}
