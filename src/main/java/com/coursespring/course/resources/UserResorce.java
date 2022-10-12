package com.coursespring.course.resources;

import com.coursespring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResorce {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "matheus", "matheuswech@outlokk.com", "231", "123");
        return ResponseEntity.ok().body(u);
    }
}
