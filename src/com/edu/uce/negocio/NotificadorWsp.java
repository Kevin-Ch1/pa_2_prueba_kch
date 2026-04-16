package com.edu.uce.negocio;

public class NotificadorWsp {

    public void enviar(String cliente, String mensaje) {
        System.out.println("Se envia Whatsapp a: " + cliente);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
