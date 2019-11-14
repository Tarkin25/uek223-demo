package ch.noseryoung.demo.domain.user;

import java.util.List;
import java.util.NoSuchElementException;

public interface UserService {

    List<User> findAll();

    User findById(Integer id) throws NoSuchElementException;

    User save(User user);

    User updateById(Integer id, User user) throws NoSuchElementException;

    void deleteById(Integer id);

}
