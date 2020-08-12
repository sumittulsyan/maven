$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sumittulsyan/eclipse-workspace/TaxiApp1/src/main/java/com/qa/features/Reg.feature");
formatter.feature({
  "name": "Registeration Screen",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registration Flow Validation via App.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I tap on register button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.i_tap_on_register_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat io.appium.java_client.pagefactory.AppiumFieldDecorator.getTypeForProxy(AppiumFieldDecorator.java:233)\n\tat io.appium.java_client.pagefactory.AppiumFieldDecorator.proxyForAnElement(AppiumFieldDecorator.java:248)\n\tat io.appium.java_client.pagefactory.AppiumFieldDecorator.access$0(AppiumFieldDecorator.java:246)\n\tat io.appium.java_client.pagefactory.AppiumFieldDecorator$3.proxyForLocator(AppiumFieldDecorator.java:121)\n\tat org.openqa.selenium.support.pagefactory.DefaultFieldDecorator.decorate(DefaultFieldDecorator.java:62)\n\tat io.appium.java_client.pagefactory.AppiumFieldDecorator.decorate(AppiumFieldDecorator.java:172)\n\tat org.openqa.selenium.support.PageFactory.proxyFields(PageFactory.java:113)\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:105)\n\tat com.qa.pages.RegisterPage.\u003cinit\u003e(RegisterPage.java:26)\n\tat com.qa.stepdefinition.stepdefinition.i_tap_on_register_button(stepdefinition.java:16)\n\tat ✽.I tap on register button(/Users/sumittulsyan/eclipse-workspace/TaxiApp1/src/main/java/com/qa/features/Reg.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter first name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.i_enter_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter last name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.i_enter_last_name()"
});
formatter.result({
  "status": "skipped"
});
});