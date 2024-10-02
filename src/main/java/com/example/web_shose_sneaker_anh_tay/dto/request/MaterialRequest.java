package com.example.web_shose_sneaker_anh_tay.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MaterialRequest {
    @NotBlank(message = "Tên chất liệu không được trống")
    @Size(min = 2, max = 50, message = "Tên chất liệu phải từ 2 đến 50 ký tự")
    private String name;
}
