$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/DeleteLead.feature");
formatter.feature({
  "name": "Delete a lead",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the Delete lead functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter User Name as \u003cuserName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click Login",
  "keyword": "And "
});
formatter.step({
  "name": "Click crmsfa",
  "keyword": "And "
});
formatter.step({
  "name": "Click lead tab",
  "keyword": "And "
});
formatter.step({
  "name": "Click Find Lead",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Find Lead First Name as \u003cfName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click Find Lead button",
  "keyword": "And "
});
formatter.step({
  "name": "Capture First Lead Id",
  "keyword": "And "
});
formatter.step({
  "name": "Click First Lead Id",
  "keyword": "And "
});
formatter.step({
  "name": "Click Delete",
  "keyword": "When "
});
formatter.step({
  "name": "Click Find Lead",
  "keyword": "And "
});
formatter.step({
  "name": "Enter First Lead Id",
  "keyword": "And "
});
formatter.step({
  "name": "Click Find Lead button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the expected message as \u003cexpectedMsg\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "fName",
        "expectedMsg"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa",
        "Kumaran",
        "No records to display"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa",
        "Chintu",
        "No records to display"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the Delete lead functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter User Name as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typeUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typePassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.clickCrmSfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click lead tab",
  "keyword": "And "
});
formatter.match({
  "location": "MyHomePage.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead",
  "keyword": "And "
});
formatter.match({
  "location": "MyLeads.clickFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Find Lead First Name as Kumaran",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.typeFirstNameFL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.clickFindLeadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Capture First Lead Id",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.getFirstLeadId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click First Lead Id",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.clickFirstLeadId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete",
  "keyword": "When "
});
formatter.match({
  "location": "ViewLead.clickDeleteButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead",
  "keyword": "And "
});
formatter.match({
  "location": "MyLeads.clickFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter First Lead Id",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.typeLeadID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.clickFindLeadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the expected message as No records to display",
  "keyword": "Then "
});
formatter.match({
  "location": "FindLeadsPage.verifyErrorMsg(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the Delete lead functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter User Name as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typeUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typePassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.clickCrmSfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click lead tab",
  "keyword": "And "
});
formatter.match({
  "location": "MyHomePage.clickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead",
  "keyword": "And "
});
formatter.match({
  "location": "MyLeads.clickFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Find Lead First Name as Chintu",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.typeFirstNameFL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.clickFindLeadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Capture First Lead Id",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.getFirstLeadId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click First Lead Id",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.clickFirstLeadId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete",
  "keyword": "When "
});
formatter.match({
  "location": "ViewLead.clickDeleteButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead",
  "keyword": "And "
});
formatter.match({
  "location": "MyLeads.clickFindLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter First Lead Id",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.typeLeadID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "FindLeadsPage.clickFindLeadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the expected message as No records to display",
  "keyword": "Then "
});
formatter.match({
  "location": "FindLeadsPage.verifyErrorMsg(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});