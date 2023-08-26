package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.entity.Vendedor;
import model.repository.IVendedorRepository;

@Service
public class VendedorService {
    @Autowired
    private IVendedorRepository vendedorRepository;

    public VendedorService() {
        super();
    }

    public Vendedor crearVendedor(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public List<Vendedor> obtenerTodosLosVendedores() {
        return vendedorRepository.findAll();
    }
}

