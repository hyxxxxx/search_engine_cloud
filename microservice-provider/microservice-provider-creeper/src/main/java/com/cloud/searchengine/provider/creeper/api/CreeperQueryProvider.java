package com.cloud.searchengine.provider.creeper.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/creeper")
public class CreeperQueryProvider {

    @GetMapping("/queryAllLinks")
    public Object queryAllLinks() {
        return Arrays.asList("link1.com", "link2.com", "link3.com");
    }

}
