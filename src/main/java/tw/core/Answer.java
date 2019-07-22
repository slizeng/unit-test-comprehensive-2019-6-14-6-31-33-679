package tw.core;

import tw.core.model.Record;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Answer {

    private List<String> numList;

    public static Answer createAnswer(String inputStr) {
        Answer answer = new Answer();
        List<String> inputList = Arrays.stream(inputStr.split(" ")).collect(toList());
        answer.setNumList(inputList);
        return answer;
    }

    public String check(Answer inputAnswer) {
        Record record = new Record();

        this.numList.forEach(num -> {
            int index = inputAnswer.getIndexOfNum(num);
            if (index != -1) {
                if (index == getIndexOfNum(num)) {
                    record.increaseCurrentNum();
                } else {
                    record.increaseIncludeOnlyNum();
                }
            }
        });

        return record.getValue();
    }

    public int getIndexOfNum(String num) {
        return this.numList.indexOf(num);
    }

    @Override
    public String toString() {
        return String.join(" ", numList);
    }

    private void setNumList(List<String> numList) {
        this.numList = numList;
    }
}
