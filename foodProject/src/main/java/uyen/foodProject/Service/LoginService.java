package uyen.foodProject.Service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    boolean checkLogin(String email, String password);
}
