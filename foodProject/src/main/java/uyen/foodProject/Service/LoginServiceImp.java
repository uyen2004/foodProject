package uyen.foodProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uyen.foodProject.Repository.UserRepository;
import uyen.foodProject.Entity.UserEntity;
import java.util.List;

@Service
public class LoginServiceImp implements LoginService{
    @Autowired
    UserRepository userRepository;
    @Override
    public boolean checkLogin(String email, String password){
        List<UserEntity> users = userRepository.findByEmaiAndPassword(email, password);
        return users.size() > 0;
    }
}
