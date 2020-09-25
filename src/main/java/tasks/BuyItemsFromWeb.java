package tasks;

import interactions.SearchAItemForBuy;
import interactions.SearchItemsForBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyItemsFromWeb implements Task {

    public static BuyItemsFromWeb value() {
        return instrumented(BuyItemsFromWeb.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SearchItemsForBuy.onWeb());
    }

}
