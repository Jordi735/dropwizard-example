package nl.jordidorren;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ApiApplication extends Application<ApiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ApiApplication().run(args);
    }

    @Override
    public String getName(){
        return "Api";
    }

    @Override
    public void initialize(final Bootstrap<ApiConfiguration> bootstrap) {
    }

    @Override
    public void run(final ApiConfiguration configuration, final Environment environment) {
        environment.jersey().register(configuration.getItemResource());
    }

}
