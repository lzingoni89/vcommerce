package com.violet.vcommerce.vcproducts.web.rest.vm;

import com.violet.vcommerce.vcproducts.service.dto.ProductDTO;
import lombok.Data;

/**
 * View Model extending the UserDTO, which is meant to be used in the product management UI.
 */
@Data
public class ManagedProductVM extends ProductDTO {

    public ManagedProductVM() {
        // Empty constructor needed for Jackson.
    }

}
