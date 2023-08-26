package model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.entity.Vendedor;
import model.service.VendedorService;

@Controller
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;
    
    @GetMapping("/CrearVendedor") // Mapeo para GET /arcorVentas/CrearVendedor
    public String mostrarFormularioVendedor(Model model) {
        model.addAttribute("vendedor", new Vendedor()); // Agregar un vendedor vacío al modelo
        return "crearVendedor"; // Nombre del archivo JSP sin la extensión ".jsp"
    }


    @PostMapping("/CrearVendedor")
    public String crearVendedor(@ModelAttribute("vendedor") Vendedor vendedor) {
        vendedorService.crearVendedor(vendedor);
        // Puedes agregar lógica adicional aquí si es necesario
        return "redirect:/"; // Nombre del archivo JSP sin la extensión ".jsp"
    }

}
