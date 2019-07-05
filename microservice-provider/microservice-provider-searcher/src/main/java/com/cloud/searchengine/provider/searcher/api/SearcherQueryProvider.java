package com.cloud.searchengine.provider.searcher.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searcher")
public class SearcherQueryProvider {

    @GetMapping("/searchContentByKey/{key}")
    public Object searchContentByKey(@PathVariable String key) {
        return key + " is Content!!!";
    }

}
