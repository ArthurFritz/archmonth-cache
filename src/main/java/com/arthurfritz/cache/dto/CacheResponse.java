package com.arthurfritz.cache.dto;

import java.time.LocalDateTime;

public class CacheResponse {

    private String key;
    private LocalDateTime execution;
    private Long startExecution;
    private Long endExecution;

    public CacheResponse(String key,
                         LocalDateTime execution,
                         Long startExecution,
                         Long endExecution) {
        this.key = key;
        this.execution = execution;
        this.endExecution = endExecution;
        this.startExecution = startExecution;
    }

    public LocalDateTime getExecution() {
        return execution;
    }

    public Long getEndExecution() {
        return endExecution;
    }

    public Long getStartExecution() {
        return startExecution;
    }

    public Long getDuration() {
        return this.endExecution - this.startExecution;
    }

    public String getParameter() {
        return key;
    }
}
