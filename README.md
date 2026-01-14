# Automated Testing Assignment – Deliverables

## 📄 Overview
This repository contains AI-generated test cases, an automated test script, and clear execution steps as part of an interview assignment.  
The objective is to demonstrate test case design, automation skills, and the ability to document execution clearly.

---

## 🤖 AI-Generated Test Cases

### TC_01 – Verify Application Launch
- **Precondition:** Application URL is available
- **Steps:**
  1. Open the browser
  2. Navigate to the application URL
- **Expected Result:** Application homepage loads successfully

---

### TC_02 – Verify Login with Valid Credentials
- **Precondition:** User is registered
- **Steps:**
  1. Open login page
  2. Enter valid username and password
  3. Click on Login button
- **Expected Result:** User is logged in and redirected to dashboard

---

### TC_03 – Verify Login with Invalid Credentials
- **Steps:**
  1. Open login page
  2. Enter invalid username or password
  3. Click on Login button
- **Expected Result:** Proper error message is displayed

---

### TC_04 – Verify Logout Functionality
- **Precondition:** User is logged in
- **Steps:**
  1. Click Logout button
- **Expected Result:** User is logged out and redirected to login page

---

## 🧪 Automated Script (Selenium + Java)

Below is a sample automation script that covers the above test cases:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com/login");

        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.id("loginBtn")).click();

        driver.findElement(By.id("logout")).click();

        driver.quit();
    }
}
▶️ Execution Steps
Clone the GitHub repository:

bash
Copy code
git clone <repository-url>
Navigate to project directory:

bash
Copy code
cd <project-folder>
Install dependencies:

bash
Copy code
mvn clean install
Execute automated tests:

bash
Copy code
mvn test
✅ Deliverables Covered
AI-generated test cases ✔

Automated test script ✔

Execution steps ✔
