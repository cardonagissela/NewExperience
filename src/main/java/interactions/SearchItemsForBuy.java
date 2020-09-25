package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import util.TestData;

import static userinterface.HomePage.*;

public class SearchItemsForBuy implements Interaction {

    public static Performable onWeb() {
        return new SearchItemsForBuy();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SendKeys.of(TestData.getTestdata().get(0).get("producto")).into(BUSQUEDA_PRENDA));
        BOTON_BUSCAR.resolveFor(actor).submit();
        Click.on(BOTON_MAS_DETALLE).performAs(actor);
        CANTIDAD_PRENDAS.resolveFor(actor).clear();
        SendKeys.of(TestData.getTestdata().get(0).get("cantidad")).into(CANTIDAD_PRENDAS).performAs(actor);
        Click.on(BOTON_AGREGAR_CARRO_RESUMEN).performAs(actor);

        Click.on(CONTINUAR_RESUMEN).performAs(actor);





    }
}
