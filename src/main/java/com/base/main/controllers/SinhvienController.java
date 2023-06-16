package com.base.main.controllers;

import com.base.main.models.Sinhvien;
import com.base.main.services.SinhvienService;
import com.base.main.vos.SinhvienUpdateVO;
import com.base.main.vos.SinhvienVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@Controller
@RequestMapping("/sinhvien")
public class SinhvienController {
    @Autowired
    private SinhvienService sinhvienService;

    @GetMapping
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("sinhviens", sinhvienService.findAll());
        return "sinhvien/index";
    }

    @GetMapping("/delete/{id}")
    public String Delete(ModelMap modelMap, @Valid @NotNull @PathVariable("id") int id)throws Exception {
        sinhvienService.delete(id);
        return "redirect:/sinhvien";
    }

    @GetMapping("/create")
    public String FormCreate()throws Exception {
        return "sinhvien/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createSinhVien(ModelMap modelMap, @Valid SinhvienVO sinhvienVO, HttpServletRequest request) throws Exception {
        System.out.println("Create: " + sinhvienVO);

        // Log the form data
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            String paramValue = request.getParameter(paramName);
            System.out.println(paramName + ": " + paramValue);
        }

        int sinhVienId = this.sinhvienService.save(sinhvienVO);
        return "redirect:/sinhvien";
    }
    



    @GetMapping("/edit/{id}")
    public String HomeEdit(ModelMap modelMap, @Valid @NotNull @PathVariable("id") int id)throws Exception {
        Sinhvien sinhvien = this.sinhvienService.getById(id);
        modelMap.addAttribute("sinhvien", sinhvien);
        return "sinhvien/edit";
    }

    @RequestMapping(value = "/edit/{id}",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String editSinhVien(@Valid SinhvienUpdateVO sinhvienUpdateVO,
                               @Valid @NotNull @PathVariable("id") int id
    ) throws Exception {
        this.sinhvienService.update(id, sinhvienUpdateVO);
        return "redirect:/sinhvien/";
    }
}
