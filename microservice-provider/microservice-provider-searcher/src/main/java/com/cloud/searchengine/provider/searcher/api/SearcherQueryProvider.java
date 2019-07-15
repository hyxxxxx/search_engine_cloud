package com.cloud.searchengine.provider.searcher.api;

import com.cloud.searchengine.provider.searcher.service.IndexQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/searcher")
public class SearcherQueryProvider {

    @Resource
    private IndexQueryService indexQueryService;

    @GetMapping("/searchContentByKey/{key}")
    public Object searchContentByKey(@PathVariable String key) {
//        indexQueryService.queryAllIndex();
        return key + " is Content!!!";
    }

}
