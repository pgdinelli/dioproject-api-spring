package pg.spring.api.service;

import pg.spring.api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
