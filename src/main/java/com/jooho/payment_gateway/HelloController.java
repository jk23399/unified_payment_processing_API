package com.jooho.payment_gateway;

// Importing Spring Boot tools we need
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*********************************************************************
* @RestController tells Spring Boot:
* "This Class handles REST API requests"
* Without this, Spring Boot will Ignore this class.
**********************************************************************/
@RestController
public class HelloController {

    /*********************************************************************
    * @GetMapping connects HTTP GET requests to this method
    * When someone requests "GET http://localhost:8080/api/hello"
    * Spring Boot will execute this method.
    **********************************************************************/
    @GetMapping("/api/hello")
    public String hello() {
        // Return value becomes the HTTP response body
        // Spring Boot automatically converts this to HTTP response
        return "Hello World";
    }

    /**
     * Flow:
     * 1. Browser sends: GET http://localhost:8080/api/hello
     * 2. Tomcat receives the request
     * 3. Spring Boot finds @GetMapping("/api/hello") and calls hello()
     * 4. Method returns "Hello World!"
     * 5. Spring Boot converts it to HTTP response
     * 6. Browser displays "Hello World!"
     **/

}
