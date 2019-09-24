package com.violet.vcommerce.vcproducts.repository;

import com.violet.vcommerce.vcproducts.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Product Repository
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> getFirstByPublicId(String publicId);

}
