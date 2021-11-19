package mbn.devops.hellospringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {

    @GetMapping("/rest")
    public String sayREST() {
        return "Great, let's take a REST with spring boot!";
    }
}
