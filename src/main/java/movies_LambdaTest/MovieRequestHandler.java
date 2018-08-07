package movies_LambdaTest;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import movies_LambdaTest.requests.Movies_Request;

/**
 * StreamHandler
 */
public class MovieRequestHandler {
    
    public void handleRequest(Movies_Request request, Context context) {
        LambdaLogger log = context.getLogger();
        log.log(String.format("Werte: %s, %s", request.getTitle(), request.getYear()));
        System.out.println(request.getTitle());
        System.out.println(request.getYear());
    }

    
}