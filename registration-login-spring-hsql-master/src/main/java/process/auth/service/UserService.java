package process.auth.service;

import process.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
