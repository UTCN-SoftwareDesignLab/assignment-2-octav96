package bookStore.service;

import bookStore.dto.UserDTO;
import bookStore.entity.User;

import java.util.List;

public interface UserService {
    public User create(UserDTO userDTO);
    public List<User> getAll();
    public List<User> findAll();
    public void deleteByUsername(String username);
    void updateUser(String address, String username);

}
