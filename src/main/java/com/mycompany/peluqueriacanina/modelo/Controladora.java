/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.modelo;

import com.mycompany.peluqueriacanina.controlador.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author JDANIEL
 */
public class Controladora {
    
    ControladoraPersistencia controller = new ControladoraPersistencia();
    Cliente cliente = new Cliente();
    Mascota mascota = new Mascota();
    
    public void guardar(String nombre, String color, String nombreDuenio, String observaciones, String raza, String tel, String alergico, String atencio) {
        
        cliente.setNombre(nombreDuenio);
        cliente.setTelefono(tel);
        
        mascota.setNombre(nombre);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setAlergico(alergico);
        mascota.setAtencion(atencio);
        mascota.setObservacion(observaciones);
        mascota.setDuenio(cliente);
        
        controller.guardarCliente(cliente);
        controller.guardarMascota(mascota);
        
    }

    public List<Mascota> mostrarMascotas() {

       return controller.mostrarMascotas();

    }

    public void eliminarDatos(int indice) {


        controller.eliminarDatos(indice);

    }

    public Mascota obtenerMascota(int numeroCliente) {

        
        return controller.obtenerMascota(numeroCliente);

    }

    public void actualizarDatos(Mascota mascota, String nombre, String color, String nombreDuenio,
            String observaciones, String raza, String tel, String alergico, String atencio) {


        
       
        mascota.setNombre(nombre);
        mascota.setColor(color);
        mascota.setObservacion(observaciones);
        mascota.setRaza(raza);
        mascota.setAtencion(atencio);
        mascota.setAlergico(alergico);
        
        controller.modificarMascota(mascota);
        
        Cliente duenio = this.buscarCliente(mascota.getDuenio().getIdCliente());
        duenio.setNombre(nombreDuenio);
        duenio.setTelefono(tel);
        
        this.modificarCliente(duenio);
        

    }

    private Cliente buscarCliente(int idCliente) {


        return controller.buscarCliente(idCliente);

    }

    private void modificarCliente(Cliente duenio) {


        controller.ModicarCliente(duenio);
    }
    
}
