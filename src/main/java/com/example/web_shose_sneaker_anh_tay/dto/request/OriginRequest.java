package com.example.web_shose_sneaker_anh_tay.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OriginRequest {
    @NotBlank(message = "Tên xuất xứ không được trống")
    @Size(min = 2, max = 50, message = "Tên xuất xứ phải từ 2 đến 50 ký tự")
    private String name;
}
