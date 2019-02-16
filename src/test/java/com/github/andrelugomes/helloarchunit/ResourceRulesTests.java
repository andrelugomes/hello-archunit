package com.github.andrelugomes.helloarchunit;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(
        packages = "com.github.andrelugomes.helloarchunit.resource",
        importOptions = IgnoreTests.class
)
public class ResourceRulesTests {

    public static final String RESOURCE_PACKAGE = "com.github.andrelugomes.helloarchunit.resource";

    @ArchTest
	static final ArchRule resources_should_stay_on_resource_rackage =
		 classes().that()
				 .haveSimpleNameContaining("Resource")
		    .should()
				 .resideInAPackage(RESOURCE_PACKAGE);


}

