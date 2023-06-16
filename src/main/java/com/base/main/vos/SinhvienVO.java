package com.base.main.vos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class SinhvienVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "name can not null")
    private String name;

    @NotNull(message = "lop can not null")
    private String lop;

    @NotNull(message = "tuoi can not null")
    private Integer tuoi;

	@Override
	public String toString() {
		return "SinhvienVO [name=" + name + ", lop=" + lop + ", tuoi=" + tuoi + "]";
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
