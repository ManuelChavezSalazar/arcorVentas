package model.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import model.entity.Usuario;
import model.service.UsuarioService;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService UsuarioService;

    @RequestMapping(path = "/CrearUsuario", method = RequestMethod.GET)
    public String mostrarFormularioUsuario(Model model) {
        model.addAttribute("usuario", new Usuario()); // Prepara un objeto Usuario en el modelo
        return "crearUsuario"; // Asumiendo que tienes una vista llamada "crearUsuario"
    }

    @RequestMapping(path = "/CrearUsuario", method = RequestMethod.POST)
    public String crearUsuario(@ModelAttribute Usuario usuario) {
        UsuarioService.crearUsuario(usuario);
        if ("Vendedor".equals(usuario.getTipo())) {
            return "redirect:/CrearVendedor"; // Redirige a la página de crearVendedor
        } else if ("Supervisor".equals(usuario.getTipo())) {
            return "redirect:/CrearSupervisor"; // Redirige a la página de crearSupervisor
        } else if ("Administrativo".equals(usuario.getTipo())) {
            return "redirect:/CrearAdministrativo"; // Redirige a la página de crearAdministrativo
        } else {
            return "redirect:/"; // Redirige a la página principal si el tipo no coincide
        }
    }
}