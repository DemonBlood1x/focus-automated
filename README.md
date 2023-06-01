# Automated Project with JAVA, Selenium, and Maven
This project has been created to automate a web application using JAVA, Selenium and Maven.

# Test Matrix
| Step | Description | Expectation |
|---|---|---|
|1| Open Chrome Browser.|Browser opened|
|2| Go to www.google.com |Google landing page opened|
|3| Type in Google’s search “Focus Services” |Focus Services search displayed|
|4| Click on “Search button” |Focus Services page displayed|
|5| Verify the https://www.focusservices.com URL exists in the search|https://www.focusservices.com URL exists in the search|
|6| Click on that page|Focus Services page opened|
|7|Scroll down to the bottom of the page| Footer page displayed|
|8|Verify the “Now Hiring” button exists into this page|Now Hiring button displayed|
|9|Click on “Locations” Tab|Locations page displayed|
|10|Locate North America Link. Do an assert on this link. | North America link displayed|
|11|Click on Central America location.| Central America page displayed|
|12| Validate “El Salvador &amp; Nicaragua” title is displayed on the page. | El Salvador & Nicaragua title displayed| 
|13| Click on Asia Location.|Asia Page displayed|
|14|Verify if exist the “Bacolod City, Philippines” text block|The “Bacolod City, Philippines” text block exists in the page.|

# Run a Maven Project

This guide will walk you through running a Maven project with two test cases written in Java.

## Prerequisites

Before you begin, you'll need the following:

* Java 8 or later
* Maven 
* A project containing Java test cases

## Steps

1. Make sure you have the prerequisites as noted above: Java 8 or later, Maven 3+, and a project containing two Java test cases.

2. Open the project in your IDE and set the `JAVA_HOME` environment variable to its installation directory.

3. Open a command-line window, navigate to the project directory, and run the folowing command:
        
        mvn clean install
        
This command installs the project into the local repository.

4. Open a command-line window, navigate to the project directory, and run the following command:

        mvn clean test

5. The build should generate a test report, which you can find under the **target/surefire-reports** folder. 

6. Open the report and check the results of the test cases.

## Conclusion

You have now successfully run a Maven project with e2e Java test cases using the `mvn clean test` command.
