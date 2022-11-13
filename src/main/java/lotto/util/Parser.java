package lotto.util;

import lotto.validator.ParserValidator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {

    public static List<Integer> convertStringToIntegerList(String prizeNumber) {
        ParserValidator.check(prizeNumber);

        return Stream.of(prizeNumber.split(","))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
}
