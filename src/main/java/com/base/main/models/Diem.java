package com.base.main.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "diem")
public class Diem {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sinhvien_id", nullable = false)
    private Sinhvien sinhvien;

}
