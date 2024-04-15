package br.com.inmetrics.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        dryRun = false, //executa todos os testes com a opção false
        snippets = SnippetType.CAMELCASE , 
        monochrome = true,
        plugin = {"pretty", "html:target/report-html"},
        tags = "@negative and not(@wip)",
        glue = {"br.com.inmetrics.steps"}
        )

public class Runner {

}
