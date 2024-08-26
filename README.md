Certainly! Below is a `README.md` file that corresponds to the given `pom.xml` configuration. This `README.md` file provides an overview of the project, instructions for setup, usage, and any relevant information for contributors.

---

# Basqar Project

## Overview

**Basqar** is a Java-based test automation project that utilizes the following technologies:
- **Selenium** for browser automation.
- **Cucumber** for behavior-driven development (BDD).
- **TestNG** as the test framework.
- **ExtentReports** for generating detailed test reports.
- **Apache POI** for working with Excel files.

This project is intended to provide a robust framework for automating web applications and is maintained by Mehmet Simsek.

## Project Structure

- **GroupId:** `org.example`
- **ArtifactId:** `Basqar`
- **Version:** `1.1`

## Prerequisites

Ensure you have the following installed on your system:

- Java Development Kit (JDK) 1.8 or higher
- Apache Maven 3.6.0 or higher

## Setup

### Clone the Repository

```bash
git clone https://github.com/yourusername/basqar.git
cd basqar
```

### Build the Project

To build the project and download all dependencies, run:

```bash
mvn clean install
```

### Running Tests

You can run the tests using Maven. The project is configured to use TestNG and Cucumber, so tests can be executed using:

```bash
mvn test
```

## Dependencies

The project relies on several key dependencies, which are managed by Maven. Below is a brief description of each:

- **Selenium (v4.23.0):** A framework for automating web applications.
- **Cucumber (v7.18.0):** A tool for running automated tests defined in a BDD style.
  - Includes `cucumber-java`, `cucumber-testng`, and `cucumber-picocontainer`.
- **TestNG (v7.10.0):** A testing framework inspired by JUnit.
- **ExtentReports (v5.1.2):** A reporting library for creating beautiful test reports.
- **Apache POI (v5.3.0):** A library for reading and writing Microsoft Office documents, specifically Excel.

## Reporting

Test results are generated using **ExtentReports**. After running tests, the reports can be found in the `target/surefire-reports` directory. These reports provide a detailed view of test execution, including pass/fail status, screenshots, and more.

## Contributing

If you would like to contribute to this project, please follow the steps below:

1. Fork the repository.
2. Create a new branch for your feature/bugfix.
3. Commit your changes with clear commit messages.
4. Push your branch to your forked repository.
5. Submit a pull request with a detailed description of your changes.

## Developer

- **Mehmet Simsek**
  - Email: simsekmehmet00@gmail.com

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
