package com.demo.payment.service.controller;

public class PaymentResponse {
    private String x_response_code;
    private String x_response_subcode;
    private String x_response_reason_code;
    private String x_response_reason_text;
    private String x_auth_code;
    private String x_avs_code;
    private String x_trans_id;
    private String x_invoice_num;
    public String getX_response_code() {
        return x_response_code;
    }
    public void setX_response_code(String x_response_code) {
        this.x_response_code = x_response_code;
    }
    public String getX_response_subcode() {
        return x_response_subcode;
    }
    public void setX_response_subcode(String x_response_subcode) {
        this.x_response_subcode = x_response_subcode;
    }
    public String getX_response_reason_code() {
        return x_response_reason_code;
    }
    public void setX_response_reason_code(String x_response_reason_code) {
        this.x_response_reason_code = x_response_reason_code;
    }
    public String getX_response_reason_text() {
        return x_response_reason_text;
    }
    public void setX_response_reason_text(String x_response_reason_text) {
        this.x_response_reason_text = x_response_reason_text;
    }
    public String getX_auth_code() {
        return x_auth_code;
    }
    public void setX_auth_code(String x_auth_code) {
        this.x_auth_code = x_auth_code;
    }
    public String getX_avs_code() {
        return x_avs_code;
    }
    public void setX_avs_code(String x_avs_code) {
        this.x_avs_code = x_avs_code;
    }
    public String getX_trans_id() {
        return x_trans_id;
    }
    public void setX_trans_id(String x_trans_id) {
        this.x_trans_id = x_trans_id;
    }
    public String getX_invoice_num() {
        return x_invoice_num;
    }
    public void setX_invoice_num(String x_invoice_num) {
        this.x_invoice_num = x_invoice_num;
    }
    @Override
    public String toString() {
        return "PaymentResponse{" +
                "x_response_code='" + x_response_code + '\'' +
                ", x_response_subcode='" + x_response_subcode + '\'' +
                ", x_response_reason_code='" + x_response_reason_code + '\'' +
                ", x_response_reason_text='" + x_response_reason_text + '\'' +
                ", x_auth_code='" + x_auth_code + '\'' +
                ", x_avs_code='" + x_avs_code + '\'' +
                ", x_trans_id='" + x_trans_id + '\'' +
                ", x_invoice_num='" + x_invoice_num + '\'' +
                '}';
    }
}