# AI-Generated Test Case Builder + Script Execution (SauceDemo Login)

## Website Used
https://www.saucedemo.com

## Requirement
Verify login functionality of SauceDemo:
- Successful login should redirect user to Products page
- Invalid login should show appropriate error message

---

## AI-Generated Test Cases (Login) – 5 Cases

### TC01 - Valid Login
**Steps**
1. Open SauceDemo login page
2. Enter username: `standard_user`
3. Enter password: `secret_sauce`
4. Click Login  

**Expected Result**
- User is redirected to Products page (`/inventory.html`)

---

### TC02 - Invalid Username
**Steps**
1. Open login page
2. Enter username: `invalid_user`
3. Enter password: `secret_sauce`
4. Click Login  

**Expected Result**
- Error message is displayed

---

### TC03 - Invalid Password
**Steps**
1. Open login page
2. Enter username: `standard_user`
3. Enter password: `wrong_pass`
4. Click Login  

**Expected Result**
- Error message is displayed

---

### TC04 - Empty Credentials
**Steps**
1. Open login page
2. Leave username empty
3. Leave password empty
4. Click Login  

**Expected Result**
- Error message displayed (username required)

---

### TC05 - Locked Out User
**Steps**
1. Open login page
2. Enter username: `locked_out_user`
3. Enter password: `secret_sauce`
4. Click Login  

**Expected Result**
- Error message displayed (locked out user)

---

## How AI Helped Test Design (Reasoning)
AI was used to generate comprehensive login test scenarios by:
- Covering both positive (happy path) and negative login cases
- Identifying realistic edge cases such as empty input fields and locked user accounts
- Ensuring broader test coverage without missing common validation scenarios

This significantly reduced manual test design effort while improving completeness and quality of the test cases.

---

## Automated Test Case
- **Automated Test:** TC01 – Valid Login
- **Tool:** Selenium WebDriver
- **Language:** Java
- **Framework:** TestNG
- **Design Pattern:** Page Object Model (POM)

---

## Project Structure
saucedemo-ai-test
├── pom.xml
├── README.md
└── src
└── test
└── java
├── pages
│ └── LoginPage.java
└── tests
└── LoginTest.java

---

## How to Run the Test

### Option 1: Run from Eclipse
1. Open the project in Eclipse
2. Right-click `LoginTest.java`
3. Select **Run As → TestNG Test**
4. Chrome browser opens and executes the login test

### Option 2: Run using Maven
1. Open terminal in project root directory
2. Run the command:
   ```bash
   mvn test
   
 ---
