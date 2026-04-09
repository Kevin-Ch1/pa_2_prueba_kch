import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido p1 = new Pedido("Kevin Chicaiza", "Mentas", 200, "kevinCh@gmail.com");

        PedidoService service = new PedidoService();
        service.registrar(p1);

    }
}
