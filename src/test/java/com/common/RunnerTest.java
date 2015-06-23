package com.common;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author Biswajit
 *
 */

@RunWith(Cucumber.class)
/**
 *                   DIFFERENT OPTIONS:
 *                   
 * glue = where to look for glue code (stepdefs and hooks)
 * monochrome = whether or not to use monochrome output
 * tags = what tags in the features should be executed
 * dryRun = true (Skip execution of glue code)
 * strict = true (will fail execution if there are undefined or pending steps)
 */

@CucumberOptions(features = "src/test/resources/com/features",
                 glue = "com.stepdefinations", 
                 tags = { " @signup , @login , @contactus " },
                 monochrome = true, plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json" })

public class RunnerTest {

}

/**
 * dryRun: if dryRun option is set to true then cucumber only checks if all the
 * steps have their corresponding step definitions defined or not. The code
 * mentioned in the Step definitions is not executed. This is used just to
 * validate if we have defined a step definition for each step or not.
 */
/**
 * Strict: if strict option is set to false then at execution time if cucumber
 * encounters any undefined/pending steps then cucumber does not fail the
 * execution and undefined steps are skipped and BUILD is SUCCESSFUL. and if
 * Strict option is set to true then at execution time if cucumber encounters
 * any undefined/pending steps then cucumber does fails the execution and
 * undefined steps are marked as fail and BUILD is FAILURE.
 */

/**
 * Monochrome: if monochrome option is set to False, then the console output is
 * not as readable as it should be. may be the output images will make this more
 * clear.
 */

/**
 * Features: features option is to specify the path to feature files. when
 * cucumber starts execution, Cucumber looks for .feature files at the
 * path/folder mentioned in features option. Whichever files are with .feature
 * extension ( if there are no compilation errors) at the path/folder mentioned
 * in features, are executed.
 */

/**
 * Glue:  glue option is to specify where the step definitions and glue code is present. Whenever cucumber encounters a step, the cucumber looks for a step definition inside all the files present in the folder mentioned in GLUE option. This also holds true for Hooks
 */

/**
 * Tags: what tags in the features should be executed or for that matter what tags should not be executed. for example: as per our example, whichever feature file or scenario would be tagged with @execueThis would be executed and whichever is tagged with @wip would not be executed. because of the "~" mentioned before @wip Tag. "~" in front of any Tag tells cucumber to skip scenario/feature tagged with that Tag.
 */
