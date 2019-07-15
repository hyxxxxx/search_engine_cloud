package com.cloud.searchengine.provider.searcher.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-provider-indexer")
public interface IndexQueryService {

    @GetMapping("/indexer/queryAllIndex")
    Object queryAllIndex();


}
