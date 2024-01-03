package fst.sir.tp1.service;

import fst.sir.tp1.bean.Compte;
import fst.sir.tp1.bean.User;
import fst.sir.tp1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
   private  UserDao userDao;

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }
    public User findByNomuserAndAndPrenomuser(String nomuser, String prenomuser) {
        return userDao.findByNomuserAndAndPrenomuser(nomuser, prenomuser);
    }
    public  List<User> findAll() {
        return userDao.findAll();
    }

    public void deleteById(Long aLong) {
        userDao.deleteById(aLong);
    }
    public int save(User user) {
        if (findByEmail(user.getEmail()) != null) {
            return -1;
        } else {
            userDao.save(user);
            return 1;
        }
    }
    //end fun
}
