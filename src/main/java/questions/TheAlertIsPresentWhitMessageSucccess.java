package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.TestData;

import static userinterface.ResumeItems.MENSAGE_ARTICULO_AGREAGADO;

public class TheAlertIsPresentWhitMessageSucccess implements Question<Boolean> {

    public static TheAlertIsPresentWhitMessageSucccess onScreen() {
        return new TheAlertIsPresentWhitMessageSucccess();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Assert.assertEquals(Text.of(MENSAGE_ARTICULO_AGREAGADO).viewedBy(actor).toString(), TestData.getTestdata().get(0).get("producto"));
        return true;
    }
}
