package com.arley.automatizacion.runner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/purchase.feature",
        glue = "com.arley.automatizacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PurchaseRunner{

        }

