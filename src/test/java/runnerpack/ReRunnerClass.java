package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",
glue="stepdef",monochrome=true,publish=true,dryRun=false,
plugin= {"html:report/webreport.html","json:report/jsonreport.json"},tags="@failed")
public class ReRunnerClass {

}
