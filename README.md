# Pet Store API

This project is designed to test the API endpoint `https://automationexercise.com/api/productsList`.

## Features:

- Uses Serenity BDD for better structured tests
- Implemented with Screenplay pattern
- Uses Java 11 and Maven 3.9.4
- Complete assertions using Hamcrest

## Setup:

1. Clone this repo
2. Navigate to the root directory
3. Run `mvn clean install` to install the dependencies
4. Run `mvn verify serenity:aggregate` to execute the tests and generate report
5. Go to the target/site/serenity/ directory and open the file index.html

## Assertions:

- Status Code is 200
- Response time is less than 1500ms
- The response contains products
