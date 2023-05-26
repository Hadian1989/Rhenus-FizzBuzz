# Rhenus-FizzBuzz
This is a small application with a REST API that receives an input value and returns a list of results in JSON format.
By entering a number, the application returns a list of values starting with 1 to the number entered, taking into account the following rules:

- If the number is divisible by 3, then 'Fizz' should be output.
- If number is divisible by 5, 'Buzz' should be output.
- If the number is divisible by both 3 and 5, then 'FizzBuzz' should be output.
- Otherwise, only the next number should be output.


## Code Structure:

There are three classes: *RhenusFizzBuzzApplication*, *FizzBuzzController* ,*CustomErrorController* , to handle the application functionality.
For these classes there corresponded test classes, *RhenusFizzBuzzApplicationTest*, *FizzBuzzControllerTest* ,*CustomErrorControllerTest*, to verify and validate the classes. . I created two controllers for handling incoming HTTP requests and returning appropriate responses.

## How to run the app:
- First, clone the project in your local system with the command
    `git clone <repository_url>`
- Open the project with your favorite IDEA, like IntelliJ IDEA, and navigate to the Project Directory: `cd <project_directory>`
- Build the Application: Specify the command to build the Spring Boot application. Typically, you can use Maven or Gradle for building. Here IS  example command for Maven: `mvn clean install`
- Run the Application: Provide the command to run the Spring Boot application. This command may vary depending on the build tool and the project    setup. Here IS aN example:
   Maven: `mvn spring-boot:run`
- Open a web browser and visit "http://localhost:8080/fizzbuzz" to see the running application.

