package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import model.entity.Usuario;
import model.service.UsuarioService;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(path = "/CrearUsuario", method = RequestMethod.GET)
    public String mostrarFormularioUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "crearUsuario"; // Nombre del archivo JSP (sin la extensión .jsp)
    }

    @RequestMapping(path = "/CrearUsuario", method = RequestMethod.POST)
    public String crearUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.crearUsuario(usuario);
        return "redirect:/CrearUsuario"; // Redirige después de crear el usuario
    }
    
    @RequestMapping("/ListarUsuarios")
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = usuarioService.obtenerTodosLosUsuarios(); // Cambia esto según tu lógica de servicio
        model.addAttribute("usuarios", usuarios);
        return "listarUsuarios";
    }


}
