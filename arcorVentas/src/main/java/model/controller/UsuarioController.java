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
        return "redirect:/"; // Redirecciona a la página principal u otra página según tus necesidades
    }
}