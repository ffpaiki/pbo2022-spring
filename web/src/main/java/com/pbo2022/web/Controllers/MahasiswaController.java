package com.pbo2022.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MahasiswaController {
    @GetMapping("/mahasiswa")
    public String index() {
        return "mahasiswa/index";
    }
}
