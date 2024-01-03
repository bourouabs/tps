package fst.sir.tp1.ws;

import fst.sir.tp1.bean.User;
import fst.sir.tp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users/")
public class UserWs {
    @Autowired
    private UserService userService;

    @GetMapping("email/{email}")
    public User findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }
    @GetMapping("nomuser/{nomuser}/prenom/{prenomuser}")
    public User findByNomuserAndAndPrenomuser(@PathVariable String nomuser,@PathVariable String prenomuser) {
        return userService.findByNomuserAndAndPrenomuser(nomuser, prenomuser);
    }
    @GetMapping("")

    public List<User> findAll() {
        return userService.findAll();
    }
    @DeleteMapping ("id/{id}")

    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
   @PostMapping("")
    public int save(@RequestBody User user) {
        return userService.save(user);
    }
}
