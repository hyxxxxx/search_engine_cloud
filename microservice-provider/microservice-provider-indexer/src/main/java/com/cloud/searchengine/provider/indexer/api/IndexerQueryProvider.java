package com.cloud.searchengine.provider.indexer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/indexer")
public class IndexerQueryProvider {

    @GetMapping("/queryAllIndex")
    public Object queryAllIndex() {
        return Arrays.asList(123, 234, 345, 456);
    }

}
