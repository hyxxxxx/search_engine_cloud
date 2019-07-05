package com.cloud.searchengine.consumer.engine.service;

import com.cloud.searchengine.consumer.engine.service.hystrix.ContentSearchFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-provider-searcher", fallback = ContentSearchFallback.class)
public interface ContentSearchService {

    @GetMapping("/searchContentByKey/{key}")
    Object searchContentByKey(@PathVariable("key") String key);

}
