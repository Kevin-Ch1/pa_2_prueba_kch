package com.edu.uce.negocio;

public class NotificadorSMS {

    public void enviar(String cliente, String mensaje) {
        System.out.println("Se envia sms a: " + cliente);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
