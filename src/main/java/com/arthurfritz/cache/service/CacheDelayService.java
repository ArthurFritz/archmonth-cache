package com.arthurfritz.cache.service;

import io.quarkus.cache.CacheResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;

@ApplicationScoped
public class CacheDelayService {

    private final Logger LOG = LoggerFactory.getLogger(CacheDelayService.class);

    @CacheResult(cacheName = "cache-example")
    public LocalDateTime randomInformationCache(String parametro) {
        return randomInformation(parametro);
    }

    public LocalDateTime randomInformation(String parametro) {
        LOG.info("Call parameter {} not used cache", parametro);
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return LocalDateTime.now();
    }
}
