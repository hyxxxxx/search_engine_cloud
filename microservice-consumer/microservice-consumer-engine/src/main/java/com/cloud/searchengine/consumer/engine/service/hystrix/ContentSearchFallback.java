package com.cloud.searchengine.consumer.engine.service.hystrix;

import com.cloud.searchengine.consumer.engine.service.ContentSearchService;
import org.springframework.stereotype.Component;

@Component
public class ContentSearchFallback implements ContentSearchService {
    @Override
    public Object searchContentByKey(String key) {
        return "Searching Engine has been broken.";
    }
}
