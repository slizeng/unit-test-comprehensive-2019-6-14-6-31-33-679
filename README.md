# Unit Test Comprehensive 

## Business Requirement

There is a game that realizes guessing numbers. There are four grids in the game, each with a number from 0 to 9, and the numbers for any two grids are different. You have 6 chances to guess. If you guess right, then you win; otherwise, you fail. Each time when you guess, you need to input 4 numbers in sequence. The program will give you feedback of xAxB according to the guessing situation. The number before A represents the number of correct position and number, and the number before B represents the number of correct number but wrong position.


**Example**：

> The answer is 1 2 3 4, then there are the following outputs based on different inputs

```
Input　　    Output             Instruction
1 5 6 7     1A0B               one correct number (1) only
2 4 7 8     0A2B               two included number (2, 4) but with wrong position only 
0 3 2 4     1A2B               one correct number(4)，and two inlucded number(3, 2)
5 6 7 8     0A0B               all wrong
4 3 2 1     0A4B               4 included numbers with wrong position
1 2 3 4     4A0B               4 correct numbers
1 1 2 3     Wrong input，should let user type again without showing error message
1 2         Wrong input，should let user type again without showing error message
```
 
The answer is randomly generated at the beginning of the game. There are only 6 chances for input.  Each time when you guess, the program
 should give the results of the current guess, as well as all previously guessed numbers and results for the player's reference. The 
 input interface is Console (console) to avoid too many interface codes that are not related to the problem.<br>
When inputting, separate the numbers with spaces.

## Practice Requirement:
- Step 0: stay on branch `master`<br>
    - step 0-0: 
        - Clarify all business requirements of this game
    - step 0-1: 
        - Write down `sad pass` test cases into `CASES.md`, to cover the scenarios with **invalid inputs**, commit your changes<br>
            For example:
            ```
            GIVEN: a game started and there are guess chances left
            WHEN: guess with typing empty and press enter
            THEN: console will NOT print result and prompt user to input
            ```
    - step 0-2: 
        - Write down `happy pass` test cases into `CASES.md` , to cover the scenarios with **valid inputs**, commit your changes <br>
            For example:
            ```
            GIVEN: a game started and there are guess chances left
            AND: the answer is 1 2 3 4
            WHEN: guess with typing '5 6 7 8'
            THEN: console will print result guess result as 0A0B and guess history including this trail
            AND: prompt user to input
            ```

- step 1:
    - step 1-0:
        - Checkout branch to `step1`
    - step 1-1:
        - Play with the game via running `Main.java`, thinking how to test this game completely, review your cases. (only focus on core business)
        - Go through the code base to **totally understand the implementation** and take reference to given `diagram`: diagram.png 
    - step 1-2: <br>
        - Complete `unit tests` in `AnswerTest`, _tests should be focus on the Answer only_ <br>
            For example:
            ```
            @Test
            void should_return_0A0B_when_no_number_is_correct_or_included() {
                //given
                Answer actualAnswer = createAnswer("1 2 3 4");
                Answer inputAnswer = createAnswer("5 6 7 8");
                String expectValue = "0A0B";
                //when
                String result = actualAnswer.check(inputAnswer);
                //then
                assertEquals(result, expectValue);
            }
            ```
    - step 1-3:<br>
        - Complete `unit tests` in `InputValidatorTest`, _tests should be focus on the InputValidator only_ <br>
            For example:
            ```
            @Test
            void should_return_true_when_validate_4_diff_digits_separated_by_single_space() {
                //given
                InputValidator inputValidator = new InputValidator();
                String input = "1 2 3 4";
                //when
                Boolean isValidated = inputValidator.validate(input);
                //then
                assertTrue(isValidated);
            }
            ```
    - step 1-4:
        - run Jacoco to test your coverages.
        - commit and push your changes on branch step1.
    - step 1-5: **OPTIONAL** <br>
        - Try to complete more tests against other classes to improve your test coverage.

- step 2:
    - step 2-0:
        - Checkout branch to **`step2`**
        - Run Jacoco to test coverage
        - Go through the tests in codebase comparing with yours
    - step 2-1:
        - Draw a concept map with topic: **`What I Learnt with Unit Test`**:
            - think about the `difference of thoughts` when you were focus on end to end tests and unit tests, and try to understand why we need to write unit tests like that. 
            - should include key words as below at least: `End to end test`, `Unit test`, `Test pyramid`, `Business requirements`, `Stub`, 
                `Mock`, `Test cases`, `Boundary value`, `Equivalence class`, `Happy pass`, `Sad pass` and etc
    - step 2-2:
        - checkout branch to `step 1`, commit screenshot of your concept map as `NOTES.png`

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
- You need to collect `CASES.md` and `NOTES.png` into branch **`step1`** as well, put them under root path
- Commit your repository link to complete this Question, fill branch as **`step1`**
