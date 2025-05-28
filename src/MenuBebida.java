import java.util.ArrayList;

public class MenuBebida {
    public static void main(String[] args) {
        ArrayList<Bebida> menu = new ArrayList<>();

        menu.add(new Refresco("Coca-Cola", "500ml", true));
        menu.add(new Refresco("Fanta", "330ml", false));
        menu.add(new Zumo("Zumo de Naranja", "250ml", "Naranja"));
        menu.add(new Zumo("Zumo de Manzana", "250ml", "Manzana"));
        menu.add(new Agua("Agua Mineral", "1L", true));
        menu.add(new Agua("Agua del grifo", "500ml", false));

        System.out.println("📋 Menú de Bebidas:\n");
        for (Bebida bebida : menu) {
            System.out.println(bebida.getDescripcion());
        }
    }
}
