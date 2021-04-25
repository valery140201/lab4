import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


class csvReaderTest {

    @Test
    public void csvToListTest() throws IOException {
        String expectedValue = "ID: 54174, Zuwena, Female, 05.12.1943, L, Salary: 3100";
        List<Human> humanTestList = new LinkedList<>();
        csvReader.csvToList(humanTestList);
        Human testHuman = humanTestList.get(25894);
        Assertions.assertEquals(expectedValue, testHuman.toStringWithoutDivisionID());
    }
}