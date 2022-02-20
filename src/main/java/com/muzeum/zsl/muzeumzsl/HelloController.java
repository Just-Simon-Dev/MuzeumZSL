package com.muzeum.zsl.muzeumzsl;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloController {

    @RequestMapping(value = "/hellou", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map hellou(){
        return Collections.singletonMap("hello","Hellou nigga");
    }
}
