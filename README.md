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
**Expected**
- User is redirected to Products page (`/inventory.html`)

### TC02 - Invalid Username
**Steps**
1. Open login page
2. Enter username: `invalid_user`
3. Enter password: `secret_sauce`
4. Click Login  
**Expected**
- Error message is displayed

### TC03 - Invalid Password
**Steps**
1. Open login page
2. Enter username: `standard_user`
3. Enter password: `wrong_pass`
4. Click Login  
**Expected**
- Error message is displayed

### TC04 - Empty Credentials
**Steps**
1. Open login page
2. Keep username empty
3. Keep password empty
4. Click Login  
**Expected**
- Error message displayed (username required)

### TC05 - Locked Out User
**Steps**
1. Open login page
2. Enter username: `locked_out_user`
3. Enter password: `secret_sauce`
4. Click Login  
**Expected**
- Error message displayed (locked out user)

---

## How AI Helped Test Design (Reasoning)
AI was used to quickly generate a balanced set of test scenarios:
- Covered both positive (happy path) and negative cases (invalid username/password)
- Identified realistic edge cases like empty fields and locked account
- Helped ensure better coverage without missing common login validations

This reduced manual brainstorming time and improved completeness of the test suite.

---

## Automated Test Case
✅ Automated: **TC01 - Valid Login**  
- Tool: Selenium WebDriver
- Language: Java
- Framework: TestNG
- Design: Page Object Model (`LoginPage`)

---

## Project Structure

---

## How to Run
### Option 1: Run from Eclipse
1. Open project in Eclipse
2. Right-click `LoginTest.java`
3. Run As → **TestNG Test**

### Option 2: Run from Maven (CLI)
```bash
mvn test
src
└── test
└── java
├── pages
│ └── LoginPage.java
└── tests
└── LoginTest.java
pom.xml
README.md