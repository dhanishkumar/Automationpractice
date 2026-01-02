🛒 Shopping Automation Testing Framework
📌 Project Overview
This project is a Selenium + Java Automation Testing Framework designed for testing a Shopping / E‑Commerce web application. It follows the Page Object Model (POM) design pattern and supports Data-Driven Testing, TestNG, Extent Reports, and Maven for build management.
The framework is structured for scalability, maintainability, and reusability, making it suitable for real‑time automation projects and fresher‑level QA portfolios.

🧰 Technology Stack 🚀
Tool / Technology	Description
Java (JDK 1.8)	Programming Language
Selenium WebDriver	Browser Automation
TestNG	Test Execution & Reporting
Maven	Build & Dependency Management
Extent Reports	HTML Test Reports
Eclipse IDE	Development Environment
Git	Version Control
📂 Project Structure Explanation 🗂️
Shopping
│
├── src/main/java
│   └── (Application source if required)
│
├── src/test/java
│   ├── com.Shopping.PageObject
│   │   ├── MyAccount.java
│   │   ├── PersonalInfo.java
│   │   ├── Signin.java
│   │   └── YourAddress.java
│   │
│   ├── com.Shopping.TestCase
│   │   ├── BaseClass.java
│   │   └── TestCases.java
│   │
│   └── com.Shopping.Utilities
│       ├── DataDrivenTesting.java
│       ├── ExtentReportWithListeners.java
│       └── ReadConfiguration.java
│
├── Drivers
├── Screenshots
├── Configuration
├── test-output
├── target
├── pom.xml
├── testng.xml
└── shopping.html

📘 Package‑Wise Detailed Explanation
🔹 1. com.Shopping.PageObject
This package contains Page Object Model (POM) classes. Each class represents one web page and stores:
* WebElements (Locators)
* Page-specific actions
📄 Signin.java
* Handles login functionality
* Contains locators for email, password, and login button
📄 MyAccount.java
* Manages account dashboard validation
* Verifies successful login
📄 PersonalInfo.java
* Handles user profile / personal information updates
📄 YourAddress.java
* Manages address add/update operations
✔ Benefit: Separates UI logic from test logic

🔹 2. com.Shopping.TestCase
This package contains actual test execution logic.
📄 BaseClass.java
* Browser setup & teardown
* WebDriver initialization
* Common methods (launch URL, screenshot capture)
📄 TestCases.java
* Contains TestNG @Test methods
* Calls Page Object methods
* Implements test scenarios like:
    * Login Test
    * Profile Validation
    * Address Update

🔹 3. com.Shopping.Utilities
This package contains supporting utility classes.
📄 ReadConfiguration.java
* Reads values from config.properties
* Handles:
    * Browser name
    * Application URL
📄 DataDrivenTesting.java
* Reads test data from Excel
* Supports multiple test iterations
📄 ExtentReportWithListeners.java
* Generates HTML test execution reports
* Captures screenshots on failure
* Uses TestNG Listeners

📁 Important Folders
📂 Drivers
* Stores browser driver files
* Example:
    * chromedriver.exe
    * msedgedriver.exe
📂 Screenshots
* Stores failure screenshots
* Automatically attached to Extent Reports
📂 Configuration
* Stores configuration files
* Example: config.properties

⚙️ Configuration File Example
browser=chrome
url=https://example-shopping-site.com

🧪 TestNG Configuration (testng.xml)
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Shopping Test Suite">
    <test name="Shopping Tests">
        <classes>
            <class name="com.Shopping.TestCase.TestCases"/>
        </classes>
    </test>
</suite>

📊 Reporting 📈
* Uses Extent Reports
* Auto‑generated after execution
* Includes:
    * Test Steps
    * Pass / Fail Status
    * Screenshots on failure
Report Location:
/test-output/ExtentReport.html

🧪 Sample Test Scenarios
🔐 Login Module
Test Case ID	Scenario	Expected Result
TC_LOGIN_01	Login with valid credentials	User should login successfully
TC_LOGIN_02	Login with invalid password	Error message should be displayed
TC_LOGIN_03	Login with blank fields	Validation message should appear
👤 My Account Module
Test Case ID	Scenario	Expected Result
TC_ACC_01	Verify account dashboard	Account page should load
TC_ACC_02	Update personal info	Details should update successfully
🏠 Address Module
Test Case ID	Scenario	Expected Result
TC_ADD_01	Add new address	Address should be saved
TC_ADD_02	Update existing address	Address should update
▶️ How to Run the Project 🏃‍♂️
Option 1: Using TestNG
1. Right‑click testng.xml
2. Run As → TestNG Suite
Option 2: Using Maven
mvn test

✅ Key Features ✨
✔ Page Object Model (POM) ✔ Data‑Driven Testing (Excel) ✔ TestNG Listeners ✔ Extent HTML Reports ✔ Screenshot Capture on Failure ✔ Maven Dependency Management ✔ Clean & Scalable Structure

👨‍💻 Author 👨‍💻
Dhanish Kumar B.Tech (Computer Science) – 2025 Manual & Automation Tester
🔗 GitHub: https://github.com/dhanishkumar 🔗 LinkedIn: https://linkedin.com/in/dhanish-kumar-533aaa173

📌 Note 📝
This framework is ideal for:
* QA Freshers
* Automation Practice
* Interview Demonstration
* Academic / Training Projects

⭐ If you like this project, give it a star ⭐ and share it!
