package runners;

import org.junit.platform.suite.api.*;
import io.cucumber.junit.platform.engine.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty")
public class TestRunner {
}
