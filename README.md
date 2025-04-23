# EspoCRM Demo Site - Automation Testing (Java)

This repository contains an automation test suite written in **Java** using **Selenium WebDriver** and **TestNG** to validate the key functionalities of the [EspoCRM Demo Site](https://demo.espocrm.com/). The project is designed using the **Page Object Model (POM)** and supports **data-driven testing**, providing a maintainable and scalable test automation framework.

---

## 📋 Table of Contents

- [About the Project](#about-the-project)
- [Technologies Used](#technologies-used)
- [Test Scenarios Covered](#test-scenarios-covered)
- [Getting Started](#getting-started)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Contributing](#contributing)

---

## 📌 About the Project

This project automates UI testing for the EspoCRM demo web application. Key areas tested include:

- User login/logout
- Creation and editing of leads, contacts, accounts, opportunities, and emails
- Page and data validations
- End-to-end workflows

The main focus is on tests and reusable components within `src/test/java`. `src/main/java` contains placeholder content (`App.java`), which can be extended in the future for utility or core logic.

---

## 🛠 Technologies Used

| Component           | Details                           |
|---------------------|------------------------------------|
| Language            | Java 11+                           |
| Automation Framework| Selenium WebDriver                 |
| Test Framework      | TestNG                             |
| Build Tool          | Maven                              |
| Reporting           | TestNG HTML + ExtentReports        |
| Design Pattern      | Page Object Model (POM)            |
| Data Provider       | Apache POI for Excel               |
| Browser Driver      | ChromeDriver                       |
| IDE                 | IntelliJ IDEA / Eclipse            |
| OS Compatibility    | Windows / Linux                    |

---

## ✅ Test Scenarios Covered

| Module         | Test Class                                  | Description                              |
|----------------|----------------------------------------------|------------------------------------------|
| Login          | `LoginPageTest.java`                         | Valid & invalid login test cases         |
| Dashboard      | `LandingPageTest.java`                       | Dashboard UI validation                  |
| Leads          | `LeadPageTest.java`                          | Create, edit, and validate lead details  |
| Accounts       | `AccountPageTest.java`                       | Account module validation                |
| Data-Driven    | `AccountPageFlowDataSetTesting.java`         | Data-driven account creation             |
| Contacts       | `ContactPageTests.java`                      | Contact creation flow                    |
| Opportunities  | `OpportunitiesPageTest.java`                | Create and edit opportunities            |
| Emails         | `EmailPageTest.java`                         | Basic email module testing               |
| Full Workflow  | `End to End Testing.xml`                     | Combined test flow simulation            |

---

## 🚀 Getting Started

### Prerequisites

Install the following:

- Java 11 or later
- Maven 3.x
- Google Chrome
- [ChromeDriver](https://sites.google.com/chromium.org/driver/) (match your browser version)

### Clone the Repository

```bash
git clone https://github.com/yourusername/espocrm-automation-java.git
cd espocrm-automation-java
```

### Build the Project

```bash
mvn clean install
```

---

## 🧪 Running Tests

### Run All Tests

```bash
mvn test
```

### Run a Specific Class

```bash
mvn -Dtest=LoginPageTest test
```

### Run via XML Suite

```bash
mvn test -DsuiteXmlFile=LeadPageTest.xml
```

### Reports

- TestNG Report: `test-output/index.html`
- Extent Report (if used): `/Reports/ExtentReport.html`

---

## 📁 Project Structure

```
espocrm-automation-java/
│
├── src/
│   ├── main/java/
│   │   └── MyProject/demo/us/espocrm/com/
│   │       └── App.java                   # Placeholder or starter class
│   └── test/java/
│       └── MyProject/demo/us/espocrm/com/
│           ├── pageObjectClass/           # All Page Object classes
│           │   ├── LoginPage.java
│           │   ├── LeadPageLocators.java
│           │   ├── OpportunitiesPageLocators.java
│           │   ├── AccountPageLocators.java
│           │   ├── ContactPageLocators.java
│           │   └── EmailPageLocators.java
│           ├── testBase/                  # Test classes
│           │   ├── BaseClass.java
│           │   ├── LoginPageTest.java
│           │   ├── LeadPageTest.java
│           │   ├── AccountPageTest.java
│           │   ├── AccountPageFlowDataSetTesting.java
│           │   ├── ContactPageTests.java
│           │   ├── OpportunitiesPageTest.java
│           │   └── EmailPageTest.java
│           └── utility/                   # Utils and Reporting
│               ├── ExtentReportManager.java
│               └── TestDataProviderClass.java
│
├── .settings/                             # Eclipse config files
├── .classpath
├── .project
├── *.xml                                  # TestNG suite files
│   ├── testng.xml
│   ├── AccountCreationDataDrivenTesting.xml
│   ├── AccountPageTest.xml
│   ├── EmailPageTest.xml
│   ├── LeadPageTest.xml
│   ├── OpportunitiesTest.xml
│   ├── End to End Testing.xml
│   └── contanctCreateFlowtesting.xml
├── pom.xml                                # Maven config
├── test-output/                           # TestNG reports
├── target/                                # Compiled output
└── README.md                              # This file
```

---

## 🤝 Contributing

I'm continuously learning and improving this framework. Contributions and suggestions are welcome!

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-feature-name`
3. Commit changes: `git commit -m "Added something useful"`
4. Push the branch: `git push origin feature/your-feature-name`
5. Create a Pull Request

---

> 🚀 Built with curiosity and hands-on experience by a passionate QA Automation Engineer, focused on writing clean, scalable, and real-world test automation.

---
