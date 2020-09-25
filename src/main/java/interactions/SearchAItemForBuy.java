package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import util.TestData;

import static userinterface.HomePage.*;

public class SearchAItemForBuy implements Interaction {

    public static Performable onWeb() {
        return new SearchAItemForBuy();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SendKeys.of(TestData.getTestdata().get(0).get("producto")).into(BUSQUEDA_PRENDA));
        BOTON_BUSCAR.resolveFor(actor).submit();
        Click.on(BOTON_AGREGAR_CARRO).performAs(actor);

    }

}
