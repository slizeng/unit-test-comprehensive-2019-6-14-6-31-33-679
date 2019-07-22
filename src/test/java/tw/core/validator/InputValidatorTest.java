package tw.core.validator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by jxzhong on 2017/5/17.
 */
class InputValidatorTest {
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

    @Test
    void should_return_false_when_given_a_non_Four_digits() {
        //given
        InputValidator inputValidator = new InputValidator();
        String num = "1 2 3";
        //whens
        Boolean isValidated = inputValidator.validate(num);
        //then
        assertThat(isValidated).isFalse();
    }

    @Test
    void should_return_false_when_input_a_Four_digits_and_one_digit_exceed_ten() {
        //given
        InputValidator inputValidator = new InputValidator();
        String num = "1 2 3 10";
        //whens
        Boolean isValidated = inputValidator.validate(num);
        //then
        assertThat(isValidated).isFalse();
    }

    @Test
    void should_return_false_when_given_a_Four_digits_and_two_digit_are_same() {
        //given
        InputValidator inputValidator = new InputValidator();
        String num = "1 2 3 1";
        //whens
        Boolean isValidated = inputValidator.validate(num);
        //then
        assertThat(isValidated).isFalse();
    }
}
