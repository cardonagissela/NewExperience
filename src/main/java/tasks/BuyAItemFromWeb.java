package tasks;

import interactions.SearchAItemForBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyAItemFromWeb implements Task {

    public static BuyAItemFromWeb value() {
        return instrumented(BuyAItemFromWeb.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SearchAItemForBuy.onWeb());
    }

}
