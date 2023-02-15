package com.order.mgmt.api;

import com.dominos.common.consul.model.ordermanagement.Config;
import com.order.mgmt.Config2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final Config config;
    private final Config2 config2;

    @GetMapping(value = {"test", "/test/{name}"})
    public ResponseEntity<String> testAPI(@RequestParam(name = "name", required = false) String name) {
        return ResponseEntity.ok(config2.getName() + config.getProductVersion());
//        return ResponseEntity.ok("Success");
    }
}
