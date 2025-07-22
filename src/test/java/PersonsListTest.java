import org.example.Person;
import org.example.PersonsList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonsListTest {
    @Test
    void findByNameReturnsCorrectPerson() {
        PersonsList list = new PersonsList();
        Person p = new Person(1, "Bob Johnson", 30, "Doctor");
        list.add(p);
        assertEquals(p, list.findByName("Bob Johnson"));
    }

    @Test
    void findByNameThrowsOnBadFormat() {
        PersonsList list = new PersonsList();
        assertThrows(IllegalArgumentException.class, () -> list.findByName("BobJohnson"));
        assertThrows(IllegalArgumentException.class, () -> list.findByName("Bob"));
        assertThrows(IllegalArgumentException.class, () -> list.findByName(""));
    }

    @Test
    void cloneCreatesPersonWithSamePropertiesButNewId() {
        PersonsList list = new PersonsList();
        Person p = new Person(1, "Alice Smith", 25, "Engineer");
        Person cloned = list.clone(p, 99);
        assertNotEquals(p.getId(), cloned.getId());
        assertEquals(p.getName(), cloned.getName());
        assertEquals(p.getAge(), cloned.getAge());
        assertEquals(p.getOccupation(), cloned.getOccupation());
        assertTrue(p.equals(cloned));
    }
}

