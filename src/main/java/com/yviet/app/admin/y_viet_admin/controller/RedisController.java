package com.yviet.app.admin.y_viet_admin.controller;

import com.yviet.app.admin.y_viet_admin.service.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/redis")
@CrossOrigin
public class RedisController {

    @Autowired
    private RedisService redisService;


    @PostMapping()
    public ResponseEntity<String> saveData(@RequestParam String key, @RequestParam String value) {
        redisService.saveData(key, value);
        return ResponseEntity.ok("Data saved successfully!");
    }

    @GetMapping()
    public ResponseEntity<Object> getData(@RequestParam String key) {
        Object value = redisService.getData(key);
        return ResponseEntity.ok(value);
    }


}
