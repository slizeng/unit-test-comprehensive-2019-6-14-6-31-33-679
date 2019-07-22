package tw.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static tw.core.Answer.*;

/**
 * Created by jxzhong on 2017/9/23.
 */
class AnswerTest {
    private Answer actualAnswer;

    @BeforeEach
    void setUp() {
        actualAnswer = createAnswer("1 2 3 4");
    }

    @Test
    void should_return_0A0B_when_no_number_is_correct_or_included() {
        //given
        Answer inputAnswer = createAnswer("5 6 7 8");
        String expectValue = "0A0B";
        //when
        String result = actualAnswer.check(inputAnswer);
        //then
        assertEquals(result, expectValue);
    }

    @Test
    void should_return_0A1B_when_only_a_number_is_included() {
        //given
        Answer inputAnswer = createAnswer("4 5 6 7");
        String expectValue = "0A1B";
        //when
        String result = actualAnswer.check(inputAnswer);
        //then
        assertEquals(result, expectValue);
    }

    @Test
    void should_return_0A4B_when_4_numbers_are_included() {
        //given
        Answer inputAnswer = createAnswer("4 3 2 1");
        String expectValue = "0A4B";
        //when
        String result = actualAnswer.check(inputAnswer);
        //then
        assertEquals(result, expectValue);
    }

    @Test
    void should_return_1A0B_when_only_one_number_is_correct() {
        //given
        Answer inputAnswer = createAnswer("1 5 6 7");
        String expectValue = "1A0B";
        //when
        String result = actualAnswer.check(inputAnswer);
        //then
        assertEquals(result, expectValue);
    }


    @Test
    void should_return_4A0B_when_only_all_numbers_are_correct() {
        //given
        Answer inputAnswer = createAnswer("1 2 3 4");
        String expectValue = "4A0B";
        //when
        String result = actualAnswer.check(inputAnswer);
        //then
        assertEquals(result, expectValue);
    }

    @Test
    void should_return_1A1B_when_one_number_is_included_and_one_is_correct() {
        //given
        Answer inputAnswer = createAnswer("1 5 6 2");
        String expectValue = "1A1B";
        //when
        String result = actualAnswer.check(inputAnswer);
        //then
        assertEquals(result, expectValue);
    }
}