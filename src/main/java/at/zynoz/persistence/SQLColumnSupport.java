package at.zynoz.persistence;

import java.util.List;
import java.util.stream.Collectors;

public interface SQLColumnSupport {
    default String asQueryColumnList(List<String> columnNames) {
        return columnNames.stream().collect(Collectors.joining(",", "(", ")"));
    }

    default String getPlaceholdersFor(List<String> columnNames) {
        return columnNames.stream().map((ignore) -> "?").collect(Collectors.joining(",", "(", ")"));
    }
}
