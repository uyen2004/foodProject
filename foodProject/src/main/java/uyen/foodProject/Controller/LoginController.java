package uyen.foodProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uyen.foodProject.Payload.Request.SigninRequest;
import uyen.foodProject.Payload.Response.DataResponse;
import uyen.foodProject.Service.LoginService;

@RestController
@RequestMapping("/signin")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("")
    public ResponseEntity<?> signin(@RequestBody SigninRequest request){
        DataResponse dataResponse = new DataResponse();
        dataResponse.setStatus(HttpStatus.OK.value());
        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
    }
}
