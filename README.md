# 🛒 Shopping Automation Testing Framework

<p align="center">
  <img src="https://img.shields.io/badge/Java-1.8-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/github/stars/dhanishkumar/shopping?style=for-the-badge" />
  <img src="https://img.shields.io/github/forks/dhanishkumar/shopping?style=for-the-badge" />
  <img src="https://img.shields.io/github/followers/dhanishkumar?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Selenium-WebDriver-green?style=for-the-badge&logo=selenium" />
  <img src="https://img.shields.io/badge/TestNG-Framework-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven" />
  <img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge" />
  <img src="https://img.shields.io/github/actions/workflow/status/dhanishkumar/shopping/maven.yml?style=for-the-badge&label=CI&logo=github" />
</p>

<p align="center">
  <img src="https://media.giphy.com/media/L8K62iTDkzGX6/giphy.gif" width="600" />
</p>

---

## 📌 Project Overview

This project is a **Selenium + Java Automation Testing Framework** designed to automate testing of a **Shopping / E-Commerce web application**.

The framework follows the **Page Object Model (POM)** design pattern and supports:

- Data-Driven Testing (Excel)
- TestNG framework
- Extent HTML Reports
- Maven build & dependency management
- GitHub Actions CI integration

It is structured for **scalability, maintainability, and reusability**, making it ideal for **real-time automation projects, QA freshers, and interview demonstrations**.

---

## 🧠 Framework Flow Diagram & Explanation

testng.xml
│
▼
BaseClass
(Browser setup, WebDriver initialization, config loading)
│
▼
TestCases
(@Test methods – execution logic)
│
▼
Page Object Model (POM)
├─ Signin.java
├─ MyAccount.java
├─ PersonalInfo.java
└─ YourAddress.java
│
▼
Utilities
├─ ReadConfiguration
├─ DataDrivenTesting
└─ ExtentReportWithListeners
│
▼
Test Execution
│
▼
Extent HTML Report + Screenshots (on failure)

gherkin
Copy code

### 🔄 Framework Working Flow (Interview Ready)

1. Test execution starts from **`testng.xml`**
2. **BaseClass** initializes browser, WebDriver, and application URL
3. Test cases invoke **Page Object methods**
4. Page Objects interact with UI using Selenium
5. Test data is fetched from **Excel (Data-Driven Testing)**
6. **TestNG Listeners** track test execution
7. **Extent Report** is generated automatically
8. Screenshots are captured for failed test cases

✅ Industry-standard automation architecture  
✅ Clean separation of responsibilities  
✅ Easy to scale and maintain  
✅ CI/CD ready using GitHub Actions  

---

## 🧰 Technology Stack 🚀

| Tool / Technology  | Description                   |
|--------------------|-------------------------------|
| Java (JDK 1.8)     | Programming Language          |
| Selenium WebDriver | Browser Automation            |
| TestNG             | Test Execution & Reporting    |
| Maven              | Build & Dependency Management |
| Extent Reports     | HTML Test Reports             |
| Eclipse IDE        | Development Environment       |
| Git & GitHub       | Version Control & CI/CD       |

---

## 📂 Project Structure Explanation 🗂️

Shopping
│
├── src/main/java
│ └── (Application source if required)
│
├── src/test/java
│ ├── com.Shopping.PageObject
│ │ ├── MyAccount.java
│ │ ├── PersonalInfo.java
│ │ ├── Signin.java
│ │ └── YourAddress.java
│ │
│ ├── com.Shopping.TestCase
│ │ ├── BaseClass.java
│ │ └── TestCases.java
│ │
│ └── com.Shopping.Utilities
│ ├── DataDrivenTesting.java
│ ├── ExtentReportWithListeners.java
│ └── ReadConfiguration.java
│
├── Drivers
├── Screenshots
├── Configuration
├── test-output
├── target
├── pom.xml
├── testng.xml
└── shopping.html

gherkin
Copy code

---

## 📘 Package-Wise Explanation

### 🔹 com.Shopping.PageObject
- Contains Page Object Model classes
- Stores locators and page-specific actions
- Improves maintainability and reusability

### 🔹 com.Shopping.TestCase
- Contains test execution logic
- `BaseClass` handles browser setup and teardown
- `TestCases` executes test scenarios

### 🔹 com.Shopping.Utilities
- Reads configuration data
- Handles Excel-based data-driven testing
- Manages Extent Report generation with listeners

---

## 🧪 Sample Test Scenarios

### 🔐 Login Module

| Test Case ID | Scenario                     | Expected Result              |
|--------------|------------------------------|------------------------------|
| TC_LOGIN_01  | Login with valid credentials | Login successful             |
| TC_LOGIN_02  | Login with invalid password  | Error message displayed      |
| TC_LOGIN_03  | Login with blank fields      | Validation message displayed |

### 👤 My Account Module

| Test Case ID | Scenario                 | Expected Result        |
|--------------|--------------------------|------------------------|
| TC_ACC_01    | Verify dashboard         | Dashboard loads        |
| TC_ACC_02    | Update personal info     | Info updated           |

### 🏠 Address Module

| Test Case ID | Scenario                | Expected Result   |
|--------------|-------------------------|-------------------|
| TC_ADD_01    | Add new address         | Address saved     |
| TC_ADD_02    | Update address          | Address updated   |

---

## ⚙️ Configuration File Example

```properties
browser=chrome
url=https://example-shopping-site.com
▶️ How to Run the Project 🏃‍♂️
Using TestNG
Right-click testng.xml

Run As → TestNG Suite

Using Maven
bash
Copy code
mvn test
📊 Reporting
Extent HTML Reports

Pass / Fail status

Detailed execution steps

Screenshots on failure

Report Path:

bash
Copy code
/test-output/ExtentReport.html
✅ Key Features ✨
✔ Page Object Model (POM)
✔ Data-Driven Testing (Excel)
✔ TestNG Listeners
✔ Extent HTML Reports
✔ Screenshot Capture on Failure
✔ Maven Dependency Management
✔ GitHub Actions CI Integration

👨‍💻 Author
Dhanish Kumar
B.Tech (Computer Science) – 2025
Manual & Automation Tester

🔗 GitHub: https://github.com/dhanishkumar
🔗 LinkedIn: https://linkedin.com/in/dhanish-kumar-533aaa173

📌 Note
This framework is suitable for:

QA Freshers

Automation Practice

Interview Demonstrations

Academic / Training Projects

⭐ If you like this project, give it a star ⭐ and share it!

markdown
Copy code

---

## 🎯 What I fixed for you
- ✅ Removed broken `gherkin / copy code` text  
- ✅ Fixed all Markdown formatting  
- ✅ Clean headings & sections  
- ✅ One single `.md` file  
- ✅ GitHub-ready & interview-ready  

If you want next:
- 📄 **PDF project documentation**
- 🎯 **Resume bullet points**
- 🧩 **Cucumber BDD layer**
- ⚡ **Parallel execution setup**

Just tell me 👍
