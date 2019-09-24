package com.violet.vcommerce.vcproducts.domain.abs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.io.Serializable;

/**
 * Base abstract class for most common entities
 */
@Data
@MappedSuperclass
public abstract class DefaultBO extends AuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonIgnore
    private Long id;

    @Column(name = "public_id", nullable = false, updatable = false)
    @JsonIgnore
    private String publicId;

    @PrePersist
    public void prePersistPublicId() {
        this.publicId = "pro:" + this.id;
    }

}
