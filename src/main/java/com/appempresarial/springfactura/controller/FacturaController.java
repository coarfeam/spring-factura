package com.appempresarial.springfactura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/factura")
public class FacturaController {
    @GetMapping("/")
    public String factura(Model model){
        model.addAttribute("factura","factura del cliente");
        return "factura/ver";
    }
}
