package com.example.web_shose_sneaker_anh_tay.exception;

import com.longnh.exceptions.BaseErrorMessage;

public enum ErrorMessage implements BaseErrorMessage {
    MATERIAL_NOT_FOUND("Material not found"),
    ORIGIN_NOT_FOUND("Origin not found"),
    SIZE_NOT_FOUND("Size not found"),
    CATEGORY_NOT_FOUND("Category not found"),
    SHOP_NOT_FOUND("Shop not found"),
    ;

    String val;

    ErrorMessage(String label) {
        val = label;
    }

    @Override
    public String val() {
        return val;
    }
}
