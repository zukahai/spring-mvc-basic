package com.base.main.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "sinhvien")
@Data
public class Sinhvien implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @PrimaryKeyJoinColumn(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lop", nullable = false)
    private String lop;

    @Column(name = "tuoi", nullable = false)
    private Integer tuoi;

    @OneToOne(mappedBy = "sinhvien", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ThongTinSinhVien thongTinSinhVien;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "sinhvien_role",
            joinColumns = @JoinColumn(name = "sinhvien_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

   

    @OneToMany(mappedBy = "sinhvien", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Diem> diems = new HashSet<>();



	@Override
	public String toString() {
		return "Sinhvien [id=" + id + ", name=" + name + ", lop=" + lop + ", tuoi=" + tuoi + ", thongTinSinhVien="
				+ thongTinSinhVien + ", roles=" + roles + ", diems=" + diems + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLop() {
		return lop;
	}



	public void setLop(String lop) {
		this.lop = lop;
	}



	public Integer getTuoi() {
		return tuoi;
	}



	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}



	public ThongTinSinhVien getThongTinSinhVien() {
		return thongTinSinhVien;
	}



	public void setThongTinSinhVien(ThongTinSinhVien thongTinSinhVien) {
		this.thongTinSinhVien = thongTinSinhVien;
	}



	public Set<Role> getRoles() {
		return roles;
	}



	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}



	public Set<Diem> getDiems() {
		return diems;
	}


	public void setDiems(Set<Diem> diems) {
		this.diems = diems;
	}
	
	
}
