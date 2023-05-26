# Rhenus-fizzbuzz
This is a small application with a REST API that receives an input value and returns a list of results in JSON format.
By entering a number, the application returns a list of values starting with 1 to the number entered, taking into account the following rules:

- If the number is divisible by 3, then 'Fizz' should be output.
- If number is divisible by 5, 'Buzz' should be output.
- If the number is divisible by both 3 and 5, then 'FizzBuzz' should be output.
- Otherwise, only the next number should be output.


## Code Structure:

There are three classes: *RhenusFizzBuzzApplication*, *FizzBuzzController* ,*CustomErrorController* , to handle the application functionality.
For these classes there corresponded test classes, *RhenusFizzBuzzApplicationTest*, *FizzBuzzControllerTest* ,*CustomErrorControllerTest*, to verify and validate the classes. . I created two controllers for handling incoming HTTP requests and returning appropriate responses.

## To run the program:
- First, clone the project in your local system.
- Open the project with your favorite IDEA, like IntelliJ IDEA.
- Then you can easily run the code. 
- To see the result: please open the address: "http://localhost:8080/fizzbuzz"
