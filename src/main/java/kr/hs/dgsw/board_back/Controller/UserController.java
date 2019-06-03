package kr.hs.dgsw.board_back.Controller;


import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List Users(){
        return this.userService.findAll();
    }

    @PostMapping("/adduser")
    public Long add(User user){
        return userService.add(user);
    }

    @PutMapping("/modifyuser")
    public int modify(User user){
        return userService.modify(user);
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @DeleteMapping("/deleteuser/{id}")
    public int deleteById(@PathVariable Long id){
        return userService.deleteById(id);
    }

}
