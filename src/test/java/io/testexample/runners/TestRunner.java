package io.testexample.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.testexample.utils.JavaUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@CucumberOptions(plugin = {"pretty",
        "html:target/htmlReports/cucumber.html",
        "json:target/jsonReports/cucumber.json",
        "junit:target/xmlReport/cucumber.xml"},
        features="src/test/resources/features",
        glue = "io/testexample/stepDefs",
        tags = "",
        dryRun = false,
        publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {

//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
    @Parameters("baseURI")
    @BeforeClass
    public void setUp(@Optional("https://rahulshettyacademy.com") String baseURI){
        JavaUtils.setBaseURI(baseURI);
    }
}
