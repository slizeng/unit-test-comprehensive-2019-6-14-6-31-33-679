package tw.core.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by jxzhong on 2017/5/17.
 */
class InputValidatorTest {
    @Test
    void should_return_true_when_validate_4_diff_digits_separated_by_single_space() {
        //given
        InputValidator inputValidator = new InputValidator();
        String input = "0 1 2 9";
        //when
        Boolean isValid = inputValidator.validate(input);
        //then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_validate_a_non_four_digits() {
        //given
        InputValidator inputValidator = new InputValidator();
        String input = "1 2 3";
        //whens
        Boolean isValid = inputValidator.validate(input);
        //then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_validate_input_a_four_digits_and_one_digit_exceed_ten() {
        //given
        InputValidator inputValidator = new InputValidator();
        String input = "1 2 3 10";
        //whens
        Boolean isValid = inputValidator.validate(input);
        //then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_validate_a_four_digits_and_two_digits_are_same() {
        //given
        InputValidator inputValidator = new InputValidator();
        String input = "1 2 3 1";
        //whens
        Boolean isValid = inputValidator.validate(input);
        //then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_validate_input_given_invalid_separators() {
        //given
        InputValidator inputValidator = new InputValidator();
        String invalidInput = "1_2\t3\n4";
        //whens
        Boolean isValid = inputValidator.validate(invalidInput);
        //then
        assertFalse(isValid);
    }
}
