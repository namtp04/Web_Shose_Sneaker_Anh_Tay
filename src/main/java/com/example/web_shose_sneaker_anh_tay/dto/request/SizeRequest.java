package com.example.web_shose_sneaker_anh_tay.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SizeRequest {
    @NotBlank(message = "Tên size không được trống")
    @Size(min = 1, max = 50, message = "Tên size phải từ 1 đến 50 ký tự")
    private String name;
}
