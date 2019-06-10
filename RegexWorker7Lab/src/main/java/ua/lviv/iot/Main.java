package ua.lviv.iot;

import java.util.List;

public class Main {
    public static void main(final String[] args) {
        RegexWorker regexWorker = new RegexWorker();
        String text = RegexWorker.readInputText();
        List<String> index = regexWorker.searchIndex(text);
        regexWorker.showResult(index);
    }
}
