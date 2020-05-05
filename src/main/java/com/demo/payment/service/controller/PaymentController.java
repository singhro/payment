package com.demo.payment.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
public class PaymentController {

    private static final Logger LOG = LoggerFactory.getLogger(PaymentController.class);


    @GetMapping("/test/payments")
    public String test(){
        LOG.info("Test Method");
        LOG.debug("Test Method");
        return "Get Payment";
    }

    @PostMapping("/test/payments")
    public String createPayment(@RequestBody Map<Object,Object> attributes){
        LOG.info("Create Payment Method "+attributes);
        LOG.debug("Create Payment Method " + attributes);
        String response = "<html><body><h1>Payment Success</h1></body</html>";
        return response;
    }
}
