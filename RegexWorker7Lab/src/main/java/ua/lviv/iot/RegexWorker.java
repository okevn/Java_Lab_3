package ua.lviv.iot;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWorker {

    private List<String> indexList = new LinkedList<>();

    public static String readInputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public List<String> searchIndex(final String string) {
        Pattern pattern = Pattern.compile(
                "([0-7]\\d\\d\\d\\d)|([8]\\d[0][0]\\d)|([8][9][0][1][0-1])");

        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String indexNumber = matcher.group();
            System.out.println(indexNumber);
            indexList.add(indexNumber);
        }
        return indexList;
    }

    public void showResult(final List<String> indexList) {
        for (String index : indexList) {
            System.out.println("Index: " + index);
        }
    }
}
