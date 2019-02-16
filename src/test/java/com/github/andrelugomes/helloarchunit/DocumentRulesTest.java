package com.github.andrelugomes.helloarchunit;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.Test;
import org.springframework.data.mongodb.core.mapping.Document;

public class DocumentRulesTest {
    
    private final JavaClasses classes = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DONT_INCLUDE_TESTS)
            .importPackages("com.github.andrelugomes.helloarchunit");

    @Test
    public void models_should_be_annotated_with_Document() {
        var documentRule = classes()
            .that()
                .resideInAPackage("..model..")
            .should()
                .beAnnotatedWith(Document.class);

        documentRule.check(classes);
    }

    @Test
    public void models_should_be_annotated_with_Document_doesnt_reside_out_of_package() {
        classes()
            .that()
                .resideOutsideOfPackage("..model..")
            .should()
                .notBeAnnotatedWith(Document.class)
            .check(classes);
    }
}
