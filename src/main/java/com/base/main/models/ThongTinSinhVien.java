package com.base.main.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "thongtinsinhvien")
public class ThongTinSinhVien {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private Integer id;

    @Column(name = "quequan", nullable = false)
    private String quequan;

    @Column(name = "diachi", nullable = false)
    private String diachi;

    @Column(name = "sdt", nullable = false)
    private String sdt;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sinhvien_id", referencedColumnName = "id")
    private Sinhvien sinhvien;

}