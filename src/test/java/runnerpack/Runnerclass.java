package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\eclipse\\May java batch 1\\CucumberTest\\src\\test\\resources\\feature",
glue= {"stepdef","hook"},monochrome=true,publish=true,dryRun=false,
plugin= {"html:report/webreport.html","json:report/jsonreport.json",
		"rerun:target/rerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags="@Hook")
public class Runnerclass {

}
