package com.github.andrelugomes.helloarchunit;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(
        packages = RepositoryRulesTests.REPOSITORY_PACKAGE,
        importOptions = ImportOption.DontIncludeTests.class
)
public class RepositoryRulesTests {

    public static final String REPOSITORY_PACKAGE = "com.github.andrelugomes.helloarchunit";

    @ArchTest
	static final ArchRule repositories_should_stay_on_repository_package =
        classes()
            .that()
                 .areInterfaces()
                 .and()
				 .haveNameMatching(".*Repository")
		    .should()
                 .beInterfaces()
            .andShould()
				 .resideInAPackage("..repository..");


}

