package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BUSQUEDA_PRENDA = Target.the("Buscador de articulos").located(By.id("search_query_top"));
    public static final Target BOTON_BUSCAR = Target.the("Buscar prenda").located(By.name("submit_search"));
    public static final Target BOTON_AGREGAR_CARRO = Target.the("Boton para agregar a carrito").located(By.linkText("Add to cart"));

    public static final Target BOTON_AGREGAR_CARRO_RESUMEN = Target.the("Boton para agregar a carrito").located(By.id("add_to_cart"));


    public static final Target BOTON_MAS_DETALLE = Target.the("Boton para mas detalle").located(By.linkText("More"));

    public static final Target CANTIDAD_PRENDAS = Target.the("Cantidad de prendas").located(By.id("quantity_wanted"));

    public static final Target CONTINUAR_RESUMEN = Target.the("Cantidad de prendas").located(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a"));







}
