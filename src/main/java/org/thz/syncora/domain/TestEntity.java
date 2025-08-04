package org.thz.syncora.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "test-tb")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
