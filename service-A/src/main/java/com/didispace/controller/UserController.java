package com.didispace.controller;

import com.didispace.dao.UserFeignClient;
import com.didispace.dao.UserRepository;
import com.didispace.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("/{id}")
//    public User findById(@PathVariable Long id) {
//        User findOne = this.userRepository.findOne(id);
//        return findOne;
//    }

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
}
