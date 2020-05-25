package com.demo.payment.service.controller;

public class PaymentResponse {
    private Integer x_response_code;
    private String x_response_reason_text;
    
	public Integer getX_response_code() {
        return x_response_code;
    }
    public void setX_response_code(Integer x_response_code) {
        this.x_response_code = x_response_code;
    }
    
    public String getX_response_reason_text() {
        return x_response_reason_text;
    }
    public void setX_response_reason_text(String x_response_reason_text) {
        this.x_response_reason_text = x_response_reason_text;
    }
    
    @Override
    public String toString() {
        return "PaymentResponse{" +
                "x_response_code='" + x_response_code + '\'' +
                ", x_response_reason_text='" + x_response_reason_text + '\'' +
                '}';
    }
}