package com.violet.vcommerce.zuulserver.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@CommonsLog
@Component
public class PostTimeElapsedFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        var request = RequestContext.getCurrentContext().getRequest();

        var timeElapsed = System.currentTimeMillis() - ((long) request.getAttribute("timeStart"));
        request.setAttribute("timeEnd", timeElapsed);

        log.info(String.format("Time elapsed %s", timeElapsed));

        return null;
    }
}
