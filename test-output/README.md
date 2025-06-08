# Entrata Selenium Tests

This project contains 5 automated Selenium tests for Entrata.com using Java, TestNG, and Maven.

## ✅ Technologies Used

- Java 11+
- Selenium 4
- TestNG
- Maven

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/entrata-selenium-tests.git
   cd entrata-selenium-tests
   ```

2. Run tests:
   ```bash
   mvn clean verify
   ```

## 📋 Test Cases

1. Navigate to Products Page
2. Navigate to About Page
3. Interact with Demo Form (no submission)
4. Verify dynamic content (menu hover effect)
5. Check for presence of the chat widget

## ⚠ Notes

- No form is actually submitted.
- Uses explicit waits for synchronization.