**Selenium-Cucumber-Java**

This repository contains a collection of sample projects and libraries that demonstrate how to use selenium-cucumber-java, a BDD (Behavior-Driven Development) framework with Cucumber (v 3.0.0) and Java. The projects showcase automation script development and utilize various reporters such as Allure, HTML, and JSON. Additionally, it offers the ability to capture screenshots for tests and generate error shots for failed test cases.

**Installation & Prerequisites**

JDK 1.8+ (Ensure that the Java class path is properly set)
Maven (Ensure that the .m2 class path is properly set)
Eclipse IDE
Required Eclipse Plugins:
Maven
Cucumber
Browser driver (Ensure that you have the appropriate browser driver for your desired browser and that the class path is correctly configured)

**Framework Setup**

To set up the framework, you can either fork or clone the repository from here, or download the ZIP file and set it up in your local workspace.

**Running Sample Tests**

Access the CLI of your operating system (e.g., iTerm for macOS or PowerShell for Windows) and navigate to the project directory. Then, run the following command to execute the features: mvn clean test. By default, this command will invoke the Firefox browser and execute the tests.

To run a specific feature file among multiple feature files, use the command: mvn test -Dcucumber.options="classpath:features/my_first.feature".

To run using TestNG the only simple run the testng.xml file as TestNG suite

To run sepecific scenario using tag we can use RunCucumberTest.java with tag name

**Reports:**

**Cucumber Report -**

/target/cucumber-reports/cucumberreport.html

**Test NG Report -**

/test-output/index.html

**Extent Report -**

/test-output/SparkReport/Spark.html

**Spark Report -**

/test-output/SparkReport/Spark.html

