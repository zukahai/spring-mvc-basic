package com.base.main.controllers;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.main.models.Sinhvien;
import com.base.main.services.SinhvienService;
import com.base.main.vos.SinhvienVO;

@Validated
@Controller
@RequestMapping("/api")
public class APIController {
	@Autowired
    private SinhvienService sinhvienService;
	
	@GetMapping("/sinhvien")
	public ResponseEntity<Object> findAll() {
		return ResponseEntity.ok().body(sinhvienService.findAll());
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "sinhvien/create", produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResponseEntity<Object> save(@RequestBody SinhvienVO sinhvienVO) {
		int sinhVienId = sinhvienService.save(sinhvienVO);
        return ResponseEntity.ok().body(sinhvienService.getById(sinhVienId));
    }
	
}
