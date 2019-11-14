package ch.noseryoung.demo.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(Integer id) throws NoSuchElementException {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public User save(User user) {
        user.setId(null);

        return repository.save(user);
    }

    @Override
    public User updateById(Integer id, User user) throws NoSuchElementException {
        User oldUser = findById(id);

        user.setId(id);
        user.setAuctions(oldUser.getAuctions());

        return repository.save(user);
    }

    @Override
    public void deleteById(Integer id) {
        if(!repository.existsById(id)) throw new NoSuchElementException();

        repository.deleteById(id);
    }
}
