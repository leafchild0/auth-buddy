package com.leafchild0.authclient;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

/**
 * @author victor
 * @date 09.03.2020
 */
@Component
public class TokenCheckFilter extends ZuulFilter {

	@Override
	public String filterType() {

		return "pre";
	}

	@Override
	public int filterOrder() {

		return 5 - 1;
	}

	@Override
	public boolean shouldFilter() {

		RequestContext ctx = RequestContext.getCurrentContext();
		return ctx.getRequest().getParameter("Authorization") != null;
	}

	@Override
	public Object run() {

		// Make a call to auth service and check token is valid
		return null;
	}
}
