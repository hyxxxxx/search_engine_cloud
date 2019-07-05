package com.cloud.searchengine.provider.analyzer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/analyzer")
public class AnalyzerQueryProvider {

    @GetMapping("/queryAllWords")
    public Object queryAllWords() {
        return Arrays.asList("a", "b", "c");
    }

}
