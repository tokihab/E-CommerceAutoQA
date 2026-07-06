# AF

AF is a Maven-based UI automation project built with Selenium and TestNG. It was developed as a learning exercise, but the code is organized around a real application flow rather than a step-by-step tutorial. The focus is on writing maintainable browser tests, structuring page objects cleanly, and keeping the suite readable as it grows.

The suite targets [Automation Exercise](https://automationexercise.com/) and covers user journeys such as registration, login, product browsing, search, category navigation, and product review submission.

## What This Project Shows

- Page Object Model usage with a shared base page class.
- Test classes that extend a common test base for browser setup and teardown.
- TestNG suite execution through `testng.xml`.
- A practical mix of direct element actions, `Select` handling for dropdowns, and occasional `JavascriptExecutor` use when standard clicks or scrolling are not enough.
- A learning-oriented style that favors clarity over abstraction-heavy framework code.

## Conventions Used

- Page classes live under `src/main/java/pages` and wrap UI behavior behind small helper methods.
- Most locators are declared with `@FindBy`, and `PageFactory` initializes them in `PageBase`.
- Test classes live under `src/test/java/tests` and keep assertions close to the flow being verified.
- `TestBase` handles browser startup and shutdown, opening Firefox, maximizing the window, and navigating to the base URL.
- Test methods are written as end-to-end flows with clear method names such as `TPD`, `TPS`, `TPC`, `TPR`, `TR`, and `TLI`.
- Some tests use `Thread.sleep` to wait for page transitions, reflecting a straightforward learning-phase approach.

## Coverage At a Glance

- Registration flow: signup, account creation, account deletion, and returning to the home page.
- Login flow: sign in, verify logout state, and sign out.
- Products flow: open the product listing, inspect a product, search by name, browse categories, and submit a review.

## Project Structure

- `src/main/java/pages` - page objects and shared page base.
- `src/test/java/tests` - TestNG test cases and test setup.
- `testng.xml` - suite configuration.

## Running the Tests

1. Make sure Java 21, Maven, Firefox, and a compatible `geckodriver` are available on your machine.
2. From the project root, run:

```bash
mvn test
```

Test execution is driven by `testng.xml`.

## Notes

- This repository is intentionally compact and learning-focused.
- The current implementation keeps the framework simple so the test flow remains easy to follow.