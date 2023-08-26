package model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.entity.Supervisor;
import model.service.SupervisorService;

@Controller
public class SupervisorController {

    @Autowired
    private SupervisorService supervisorService;

    @GetMapping("/CrearSupervisor")
    public String mostrarFormularioSupervisor(Model model) {
        model.addAttribute("supervisor", new Supervisor());
        return "crearSupervisor";
    }

    @PostMapping("/CrearSupervisor")
    public String crearSupervisor(@ModelAttribute("supervisor") Supervisor supervisor) {
        supervisorService.crearSupervisor(supervisor);
        // Puedes agregar lógica adicional aquí si es necesario
        return "redirect:/";
    }
}
