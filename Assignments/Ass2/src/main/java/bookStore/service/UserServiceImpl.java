package bookStore.service;

import bookStore.dto.UserDTO;
import bookStore.entity.User;
import bookStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository;



    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(),userDTO.getPassword(),
                userDTO.getAge(),userDTO.getAddress(), userDTO.getRole());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAll() {
        final Iterable<User> users = userRepository.findAll();
        List<User> users1 = new ArrayList<>();
        users.forEach(users1::add);

        return users1;
    }

    @Override
    public void deleteByUsername(String username) {
        userRepository.deleteByUsername(username);
    }

    @Override
    public void updateUser(String address, String username) {
        userRepository.updateUser(address,username);
    }


}
