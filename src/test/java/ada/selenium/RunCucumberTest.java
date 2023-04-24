package ada.selenium;

import org.junit.platform.suite.api.*;


import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("ada/selenium")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@IncludeTags("2")
@ExcludeTags("")


public class RunCucumberTest {
}
