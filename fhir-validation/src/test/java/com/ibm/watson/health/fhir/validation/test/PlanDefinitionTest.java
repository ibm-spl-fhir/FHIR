/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watson.health.fhir.validation.test;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import com.ibm.watson.health.fhir.model.format.Format;
import com.ibm.watson.health.fhir.model.parser.FHIRParser;
import com.ibm.watson.health.fhir.model.path.FHIRPathNode;
import com.ibm.watson.health.fhir.model.path.evaluator.FHIRPathEvaluator;
import com.ibm.watson.health.fhir.model.resource.OperationOutcome.Issue;
import com.ibm.watson.health.fhir.model.resource.PlanDefinition;
import com.ibm.watson.health.fhir.validation.FHIRValidator;

public class PlanDefinitionTest {
    public static void main(String[] args) throws Exception {
        try (InputStream in = PlanDefinitionTest.class.getClassLoader().getResourceAsStream("JSON/plandefinition.json")) {  
            PlanDefinition planDefinition = FHIRParser.parser(Format.JSON).parse(in);
            List<Issue> issues = FHIRValidator.validator().validate(planDefinition);
            for (Issue issue : issues) {
                System.out.println("severity: " + issue.getSeverity().getValue() + ", details: " + issue.getDetails().getText().getValue() + ", expression: " + issue.getExpression().get(0).getValue());
            }
            FHIRPathEvaluator.DEBUG = true;
            Collection<FHIRPathNode> result = FHIRPathEvaluator.evaluator().evaluate(planDefinition, "%resource.descendants().as(canonical)");
            System.out.println("result: " + result);
        }
    }
}