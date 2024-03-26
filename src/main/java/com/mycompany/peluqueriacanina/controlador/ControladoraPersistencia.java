/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.controlador;

import com.mycompany.peluqueriacanina.controlador.exceptions.NonexistentEntityException;
import com.mycompany.peluqueriacanina.modelo.Cliente;
import com.mycompany.peluqueriacanina.modelo.Mascota;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JDANIEL
 */
public class ControladoraPersistencia {

    MascotaJpaController mjc = new MascotaJpaController();
    ClienteJpaController cjc = new ClienteJpaController();

    public void guardarMascota(Mascota m) {

        mjc.create(m);

    }

    public void guardarCliente(Cliente cliente) {

        cjc.create(cliente);
    }

    public List<Mascota> mostrarMascotas() {

        return mjc.findMascotaEntities();

    }

    public void eliminarDatos(int indice) {

        try {
            mjc.destroy(indice);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Mascota obtenerMascota(int numeroCliente) {

        return mjc.findMascota(numeroCliente);

    }

    public void modificarMascota(Mascota masco) {

        try {
            mjc.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Cliente buscarCliente(int idCliente) {

        return cjc.findCliente(idCliente);

    }

    public void ModicarCliente(Cliente duenio) {

        try {
            cjc.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
