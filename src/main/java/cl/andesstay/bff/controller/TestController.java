package cl.andesstay.bff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public/test")
    public String publicTest() {
        return "Endpoint publico funcionando";
    }

    @GetMapping("/private/test")
    public String privateTest() {
        return "Endpoint protegido funcionando";
    }

    @GetMapping("/admin/test")
    public String adminTest() {
        return "Endpoint ADMIN funcionando";
    }
}