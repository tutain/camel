package com.demo.camel.router;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author tu
 */
public class RestRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        errorHandler(defaultErrorHandler().maximumRedeliveries(0));
        from("").to("direct:");
        from("").to("");
    }
}
