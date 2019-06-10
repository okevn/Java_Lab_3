package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RegexWorkerTest {
    public List<String> list = new LinkedList<>();
    private String inputText;

    @BeforeEach
    void setUp() {
        inputText = "tyctugvyvyvyi 11111 " +
                "hvykgvyvbygkihil 79000 kvslm;" +
                "smc 00000 re";
        list.add("11111");
        list.add("79000");
        list.add("00000");
    }

    @Test
    void searchIndex() {
        RegexWorker regexWorker = new RegexWorker();
        List<String> indexList = regexWorker.searchIndex(inputText);
        assertNotNull(indexList);
        assertEquals(list, indexList);
    }
}
