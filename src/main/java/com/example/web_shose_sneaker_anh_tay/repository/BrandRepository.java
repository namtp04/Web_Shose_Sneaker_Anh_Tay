package com.example.web_shose_sneaker_anh_tay.repository;

import com.example.web_shose_sneaker_anh_tay.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
