package com.violet.vcommerce.common.web.dto.abs;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Base abstract class for most common dto
 */
@Data
@NoArgsConstructor
public abstract class DefaultVO {

    private String publicId;

}
