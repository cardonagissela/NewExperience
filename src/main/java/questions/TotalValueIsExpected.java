package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.TestData;

import java.util.List;

import static userinterface.ResumeItems.*;

public class TotalValueIsExpected implements Question<Boolean> {

    public static TotalValueIsExpected onScreen() {
        return new TotalValueIsExpected();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        List<WebElementFacade> listTd = RESUMEN.resolveAllFor(actor);

        for (WebElementFacade elemto: listTd){
            System.out.println(
                    elemto.findElement(By.tagName("td")).getText()
            );

        }

        Assert.assertEquals(Value.of(CANTIDAD_ARTICULOS).viewedBy(actor).toString(), TestData.getTestdata().get(0).get("cantidad"));
        Assert.assertEquals(Text.of(VALOR_TOTAL).viewedBy(actor).toString(), Double.parseDouble(Text.of(VALOR_UNIDAD).viewedBy(actor).toString())*Double.parseDouble(TestData.getTestdata().get(0).get("cantidad")));

        return true;
    }
}
