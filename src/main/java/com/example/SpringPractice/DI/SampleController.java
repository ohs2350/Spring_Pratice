package com.example.SpringPractice.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    /**
     * 스프링에서 의존성 주입 방법
     * 1. 필드값
     * 2. 생성자
     * 3. setter
     */
    @Autowired
    SampleService1 sampleService1;
    final SampleService2 sampleService2;
    SampleService3 sampleService3;

    @Autowired
    public SampleController(SampleService2 sampleService2) {
        this.sampleService2 = sampleService2;
    }

    @Autowired
    public void setSampleService3(SampleService3 sampleService3) {
        this.sampleService3 = sampleService3;
    }

    @GetMapping("/sample")
    public String Sample(Model model) {
        String result1 = sampleService1.getResult();
        String result2 = sampleService2.getResult();
        String result3 = sampleService3.getResult();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        model.addAttribute("result1", result1);
        model.addAttribute("result2", result2);
        model.addAttribute("result3", result3);

        return "index";
    }
}
