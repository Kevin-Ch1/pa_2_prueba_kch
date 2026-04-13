package com.edu.uce.negocio;

public class PedidoService {

    private NotificadorMail n1 = new NotificadorMail();
    private NotificadorSMS n2 = new NotificadorSMS();

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total del pedido: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        if (pedido.getTotal() > 100) {
            n1.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atentido");
        } else {
            n2.enviar(pedido.getTelefono(), "Se ha creado un pedido para ser atentido");
        }

    }
}
