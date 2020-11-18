package com.arthurfritz.cache.resource;

import com.arthurfritz.cache.dto.CacheResponse;
import com.arthurfritz.cache.service.CacheDelayService;
import io.netty.util.internal.StringUtil;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;

@Path("/no-cache")
public class NoCacheResource {

    private final CacheDelayService cacheDelayService;

    @Inject
    public NoCacheResource(CacheDelayService cacheDelayService) {
        this.cacheDelayService = cacheDelayService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CacheResponse getForecast(@DefaultValue(StringUtil.EMPTY_STRING) @QueryParam("key") String key) {
        long executionStart = System.currentTimeMillis();
        LocalDateTime execution =  this.cacheDelayService.randomInformation(key);
        long executionEnd = System.currentTimeMillis();
        return new CacheResponse(key, execution, executionStart, executionEnd);
    }
}
