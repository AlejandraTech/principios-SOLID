/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GestorArchivos;

/**
 *
 * @author AlejandraTech
 */
public interface GestorArchivos {

    String leerArchivo(String path);

    void escribirArchivo(String contenido, String path);

    String encriptarContenido(String contenido);

}
