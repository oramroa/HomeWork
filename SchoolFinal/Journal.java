package SchoolFinal;

import java.util.List;
import java.util.Map;

public class Journal {
    private Subject subject;
    private Map<Child, List<Journal>> records;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setRecords(Map<Child, List<Journal>> records) {
        this.records = records;
    }

    public Subject getSubject() {
        return subject;
    }

    public Map<Child, List<Journal>> getRecords() {
        return records;
    }
}
