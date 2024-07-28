package com.jscc1st.jscc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JaehoonHello {

    @GetMapping("/hi")
    public String hi(){
        return "Hello Jaehoon!!!!";
    }

    @GetMapping("/hisowon")
    public String hisowon(){
        return "Hello Sowon!!!!!!!";
    }

}
