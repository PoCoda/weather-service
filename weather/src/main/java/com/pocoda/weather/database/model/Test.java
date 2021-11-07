package com.pocoda.weather.database.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "test")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Test {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "key", nullable = false)
    private String key;

    @Column(name = "value", nullable = false)
    private String value;
}
