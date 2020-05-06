package com.demo.payment.service.controller;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
public class PaymentController {

    @GetMapping("/test/payments")
    public String test(){
        System.out.println("Test Method");
        System.err.println("Test Method");
        return "Get Payment";
    }

    @PostMapping(value = "/test/payments", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = MediaType.TEXT_HTML_VALUE)
    public String createPayment(@RequestBody MultiValueMap<Object,Object> attributes){
        System.out.println("Create Payment Method "+attributes);
        System.err.println("Create Payment Method " + attributes);
        String response = "<html><body><h1>Payment Success</h1></body</html>";
        return response;
    }
	
	@GetMapping("/test/payments/receipt")
    public String receipt(){
        System.out.println("Receipt Get Method Invoked");
        System.err.println("Receipt Get Method Invoked");
        return "Get Payment Receipt";
    }

    @PostMapping(value = "/test/payments/receipt", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = MediaType.TEXT_HTML_VALUE)
    public String createPaymentReceipt(@RequestBody MultiValueMap<Object,Object> attributes){
        System.out.println("Create Payment Receipt Method "+attributes);
        System.err.println("Create Payment Receipt Method " + attributes);
        String response = "<html><body><h1>Payment Receipt Success</h1></body</html>";
        return response;
    }
	
	@GetMapping("/test/payments/silent")
    public String silent(){
        System.out.println("Silent Get Method Invoked");
        System.err.println("Silent Get Method Invoked");
        return "Get Payment Silent";
    }

    @PostMapping(value = "/test/payments/Silent", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = MediaType.TEXT_HTML_VALUE)
    public String createPaymentSilent(@RequestBody MultiValueMap<Object,Object> attributes){
        System.out.println("Silent Payment Receipt Method "+attributes);
        System.err.println("Silent Payment Receipt Method " + attributes);
        String response = "<html><body><h1>Silent Invoked</h1></body</html>";
        return response;
    }
}
