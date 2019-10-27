package com.violet.vcommerce.zuulserver.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@CommonsLog
@Component
public class PreTimeElapsedFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        var request = RequestContext.getCurrentContext().getRequest();
        log.info(String.format("%s request routed to %s", request.getMethod(), request.getRequestURL().toString()));

        request.setAttribute("timeStart", System.currentTimeMillis());

        return null;
    }
}
