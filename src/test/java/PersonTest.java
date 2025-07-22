import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void setAgeThrowsWhenNegative() {
        Person p = new Person(1, "Alice Smith", 20, "Engineer");
        assertThrows(IllegalArgumentException.class, () -> p.setAge(-1));
    }

    @Test
    void equalsMethodWorks() {
        Person p1 = new Person(1, "Alice Smith", 20, "Engineer");
        Person p2 = new Person(2, "Alice Smith", 20, "Engineer");
        assertTrue(p1.equals(p2));
    }
}
