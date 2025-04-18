# EspoCRM Demo Site - Automation Testing (Java)

This repository contains an automation test suite written in **Java** using **Selenium WebDriver** and **TestNG** to validate the key functionalities of the [EspoCRM Demo Site](https://demo.espocrm.com/). This project demonstrates my practical experience in test automation, following industry best practices like the Page Object Model and modular framework design.

---

## 📋 Table of Contents

- [About the Project](#about-the-project)
- [Technologies Used](#technologies-used)
- [Test Scenarios Covered](#test-scenarios-covered)
- [Getting Started](#getting-started)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## 📌 About the Project

The goal of this project is to automate UI testing for the EspoCRM demo application. The test cases cover end-to-end scenarios that a typical CRM user would perform, such as:

- Logging into the CRM
- Creating and updating leads and opportunities
- Searching records
- Validating UI elements and data

This project helped me solidify my understanding of Selenium WebDriver, TestNG, Maven, and Java automation principles. It also serves as a practical portfolio piece to demonstrate my approach to framework design and test coverage.

---

## 🛠 Technologies Used

| Component          | Details                         |
|--------------------|----------------------------------|
| Programming Language | Java 11+                      |
| Automation Tool    | Selenium WebDriver               |
| Test Framework     | TestNG                           |
| Build Tool         | Maven                            |
| Browser Driver     | ChromeDriver (tested on vX.X.X)  |
| Reporting          | TestNG default report (HTML)     |
| Design Pattern     | Page Object Model (POM)          |
| IDE                | IntelliJ IDEA / Eclipse          |
| OS Compatibility   | Windows / Linux                  |

---

## ✅ Test Scenarios Covered

| Module              | Test Case Description                      | Status |
|---------------------|--------------------------------------------|--------|
| Login               | Login with valid credentials               | ✅     |
| Login               | Login with invalid credentials             | ✅     |
| Lead Management     | Create new lead                            | ✅     |
| Lead Management     | Edit lead details                          | ✅     |
| Opportunities       | Create new opportunity                     | ✅     |
| Opportunities       | Edit and update opportunity status         | ✅     |
| Search & Filter     | Use search and filter options              | ✅     |
| Logout              | Validate logout flow                       | ✅     |
| UI Validations      | Check for broken/missing UI components     | ✅     |

---

## 🚀 Getting Started

### Prerequisites

Make sure the following are installed on your machine:

- Java 11 or higher
- Maven 3.x
- Chrome browser
- ChromeDriver (compatible with your Chrome version)

You can download ChromeDriver here: https://sites.google.com/chromium.org/driver/

### Installation

Clone the project from GitHub:

```bash
git clone https://github.com/yourusername/espocrm-automation-java.git
cd espocrm-automation-java
```

Install dependencies and build the project:

```bash
mvn clean install
```

---

## 🧪 Running Tests

### Run All Tests

```bash
mvn test
```

### Run Specific Test Class

```bash
mvn -Dtest=LoginTest test
```

### View Test Report

After test execution, open the default TestNG report:

```
/test-output/index.html
```

Just open the file in your browser to see a summary of passed/failed/skipped tests.

> Allure reporting can be integrated for advanced visual reports.

---

## 📁 Project Structure

```
espocrm-automation-java/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/           # Page classes (POM design)
│   │       └── utils/           # Utility classes (browser setup, config)
│   └── test/
│       └── java/
│           └── tests/           # TestNG test classes
│
├── drivers/                     # WebDriver executables (optional)
├── testng.xml                   # TestNG suite configuration
├── pom.xml                      # Maven project descriptor
└── README.md                    # Project documentation
```

---

## 🤝 Contributing

As I continue to learn and grow in test automation, I welcome any suggestions or feedback to improve this project. Feel free to fork, make changes, and open a pull request.

### How to Contribute:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m 'Add your message here'`
4. Push to your branch: `git push origin feature/your-feature-name`
5. Open a pull request on GitHub

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

> 🚀 Built with passion and curiosity by a budding automation tester with 1 year of hands-on experience in Java, Selenium, and TestNG.
```

---

Let me know if you'd like:
- A `pom.xml` template for this project  
- A GitHub Actions workflow for CI  
- Sample code snippets for test classes or page objects  

I’m happy to keep building this with you!
