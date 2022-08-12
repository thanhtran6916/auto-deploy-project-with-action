package com.example.demoautodeploywithaction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {

    @GetMapping
    public ResponseEntity<String> demoAction() {
        return new ResponseEntity<>("Hello word!", HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<String> postAction() {
        return new ResponseEntity<>("post action", HttpStatus.OK);
    }
}
