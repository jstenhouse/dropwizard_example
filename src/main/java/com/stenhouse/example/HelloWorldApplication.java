package com.stenhouse.example;

import com.codahale.metrics.health.HealthCheck;
import com.stenhouse.example.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by jason on 12/27/15.
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public void initialize(final Bootstrap<HelloWorldConfiguration> bootstrap) {}

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {

        environment.healthChecks().register("always_healthy", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.healthy();
            }
        });

        environment.jersey().register(new HelloWorldResource());
    }
}
