import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido p1 = new Pedido("Kevin Chicaiza",
                "Mentas",
                50,
                "kevinCh@gmail.com",
                "0999999999");

        PedidoService service = new PedidoService();
        service.registrar(p1);

    }
}
