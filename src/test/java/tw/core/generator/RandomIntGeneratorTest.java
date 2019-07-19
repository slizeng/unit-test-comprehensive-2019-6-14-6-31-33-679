package tw.core.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by jxzhong on 2017/5/18.
 */
class RandomIntGeneratorTest {

    private RandomIntGenerator randomIntGenerator;

    @BeforeEach
    void setUp() {
        this.randomIntGenerator = new RandomIntGenerator();
    }

    @Test
    void should_get_4_digits_number_string_and_every_digit_less_than_10() {
        //given
        //when
        String numStr = randomIntGenerator.generateNums(9, 4);
        //then
        assertThat(numStr).hasSize(7);
        assertThat(numStr.split("\\s").length).isEqualTo(4);
    }

    @Test()
    void should_throw_exception_when_digitMax_less_than_numbersOfNeed() {
        //given
        //when
        assertThrows(IllegalArgumentException.class, () -> randomIntGenerator.generateNums(4, 5));
    }
}