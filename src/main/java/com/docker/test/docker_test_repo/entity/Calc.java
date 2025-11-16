package com.docker.test.docker_test_repo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "calc")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer no;

    @Column(name = "num1")
    private Integer num1;

    @Column(name = "num2")
    private Integer num2;

    @Column(name = "sum")
    private Integer sum;

}
