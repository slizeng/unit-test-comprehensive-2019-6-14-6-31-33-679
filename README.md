# Unit Test Comprehensive 

## Business Requirement

There is a game that realizes guessing numbers. There are four grids in the game, each with a number from 0 to 9, and the numbers for any two grids are different. You have 6 chances to guess. If you guess right, then you win; otherwise, you fail. Each time when you guess, you need to input 4 numbers in sequence. The program will give you feedback of xAxB according to the guessing situation. The number before A represents the number of correct position and number, and the number before B represents the number of correct number but wrong position.


**Example**：

> The answer is 1 2 3 4, then there are the following outputs based on different inputs

```
Input　　    Output             Instruction
1 5 6 7      1A0B                 1 correct
2 4 7 8      0A2B                 2 and 4 wrong position 
0 3 2 4      1A2B                 4 correct，2 and 3 wrong position
5 6 7 8      0A0B                 all wrong
4 3 2 1      0A4B                 4 numbers position wrong
1 2 3 4      4A0B                 win, all correct
1 1 2 3      Wrong input，let user type again without showing error message
1 2          Wrong input，let user type again without showing error message
```
 
The answer is randomly generated at the beginning of the game. There are only 6 chances for input.  Each time when you guess, the program
 should give the results of the current guess, as well as all previously guessed numbers and results for the player's reference. The 
 input interface is Console (console) to avoid too many interface codes that are not related to the problem.<br>
When inputting, separate the numbers with spaces.

## Practice Requirement:
- Step 0:<br>
    - **Clarify all business requirements of this game**
    - **Write down test cases on your notebook, to cover all business logic from end to end**,
    should follow format as below:
    ```
    GIVEN:
    WHEN:
    THEN:
    ```
- step 1:<br>
    - Checkout branch to **`step1`**
    - Play with the game via running `Main.java`
    - Go through the code base to **totally understand the implementation**
    - Draw a `task diagram` based on current implementation
    - Write down `test cases` **against your task diagram**, method naming should follow format as below:
    ```
    should_xx_xx_when_xx_xx_given_xx_xx() or should_xx_xx_when_xx_xx();
    ```
    - run Jacoco to test your coverages.
    - commit and push your changes on branch step1.
- step 2 <br>
    - Checkout branch to **`step2`**
    - Go through the tests in codebase comparing with yours
    - write down notes about what you learn, questions and thoughts.  

#### Environment Requirement
- Java 8
- IntelliJ IDEA

#### How to Start
- You can fork the following github repository as starting point
- Run `Main.java` file under the `src/main` catalogue of project
  - If `Guess Number Game, You have 6 chances to guess!` appears, then it means the project initialization is successful
- Complete unit test on corresponding file under the `src/test` catalogue of project

#### How to Test
- Implement `./gradlew clean test` under root catalogue and view test result
 
## Practice Output && Submit
- You should implement the test code on branch **`step1`** and push your repo to github repo named **unit-test-comprehensive**.
- You need to finally put your first end-to-end test cases and your learning notes into branch **`step1`**, put them under root path
- Commit your repository link to complete this Question with branch **`step1`**
