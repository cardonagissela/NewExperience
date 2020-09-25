package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import questions.TheAlertIsPresentWhitMessageSucccess;
import questions.TotalValueIsExpected;
import tasks.BuyAItemFromWeb;
import tasks.BuyItemsFromWeb;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DefinicionComparaArticulo {

    @Given("^que el usuario se encuewntra registrado$")
    public void que_el_usuario_se_encuewntra_registrado(List<Map<String,String>> listado) {
        LoadTestData.values(listado);
    }

    @When("^el usario desea comprar un articulo a traves de la pagina$")
    public void el_usario_desea_comprar_un_articulo_a_traves_de_la_pagina() {
        theActorInTheSpotlight().attemptsTo(BuyAItemFromWeb.value());
    }



    @Then("^el puede ver que el articulo se agrego$")
    public void el_puede_ver_el_articulo_se_agrego() {
        theActorInTheSpotlight().should(seeThat(TheAlertIsPresentWhitMessageSucccess.onScreen()));
    }


    @When("^el usario desea comprar un articulo n veces$")
    public void el_usario_desea_comprar_un_articulo_n_veces() {
        theActorInTheSpotlight().attemptsTo(BuyItemsFromWeb.value());
    }

    @Then("^el puede ver el valor total a pagar$")
    public void el_puede_ver_el_valor_a_pagar() {
        theActorInTheSpotlight().should(seeThat(TotalValueIsExpected.onScreen()));
    }



}
