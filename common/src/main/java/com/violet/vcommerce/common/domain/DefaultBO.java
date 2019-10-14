package com.violet.vcommerce.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "public_id", nullable = false, updatable = false)
    private String publicId;

    @PrePersist
    public void prePersistPublicId() {
        this.publicId = "pro:" + this.id;
    }

}
