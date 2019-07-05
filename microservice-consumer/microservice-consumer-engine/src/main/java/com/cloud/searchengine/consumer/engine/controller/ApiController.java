package com.cloud.searchengine.consumer.engine.controller;

import com.cloud.searchengine.consumer.engine.service.ContentSearchService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/engine")
public class ApiController {

    @Resource
    private ContentSearchService contentSearchService;

    @RequestMapping("/search/{key}")
    public Object search(@PathVariable String key) {
        return contentSearchService.searchContentByKey(key);
    }

}
