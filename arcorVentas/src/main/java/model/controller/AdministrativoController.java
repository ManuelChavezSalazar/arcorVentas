package model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.entity.Administrativo;
import model.service.AdministrativoService;

@Controller
public class AdministrativoController {

    @Autowired
    private AdministrativoService administrativoService;

    @GetMapping("/CrearAdministrativo")
    public String mostrarFormularioAdministrativo(Model model) {
        model.addAttribute("administrativo", new Administrativo());
        return "crearAdministrativo";
    }

    @PostMapping("/CrearAdministrativo")
    public String crearAdministrativo(@ModelAttribute("administrativo") Administrativo administrativo) {
        administrativoService.crearAdministrativo(administrativo);
        // Puedes agregar lógica adicional aquí si es necesario
        return "redirect:/";
    }
}
