package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResumeItems {

    public static final Target MENSAGE_ARTICULO_AGREAGADO = Target.the("Resumen de articulos de compra").located(By.id("layer_cart_product_title"));

    public static final Target CANTIDAD_ARTICULOS = Target.the("cantidad articulos").located(By.className("cart_quantity text-center"));
    public static final Target VALOR_TOTAL = Target.the("Valor total").located(By.id("total_product_price_1_1_0"));

    public static final Target VALOR_UNIDAD = Target.the("Valor total").located(By.id("product_price_1_1_0"));

    public static final Target RESUMEN = Target.the("Valor total").located(By.id("cart_summary"));


}
