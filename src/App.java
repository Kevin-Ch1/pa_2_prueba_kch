import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido p1 = new Pedido("Kevin Chicaiza",
                "Mentas",
                150,
                "kevinCh@gmail.com",
                "0999999999");

        Pedido p2 = new Pedido("Kevin Chicaiza",
                "Mentas",
                70,
                "kevinCh@gmail.com",
                "0999999999");

        Pedido p3 = new Pedido("Kevin Chicaiza",
                "Mentas",
                20,
                "kevinCh@gmail.com",
                "0999999999");

        PedidoService service = new PedidoService();
        System.out.println("====================");
        service.registrar(p1);
        System.out.println("====================");
        service.registrar(p2);
        System.out.println("====================");
        service.registrar(p3);
    }
}
