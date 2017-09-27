import com.sardina.Event;
import com.sardina.EventLog;
import com.sardina.IllegalArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class EventTests {

    Event testEvent = new Event();
    EventLog testLog = new EventLog();

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testExceptionThrows() throws IllegalArgumentException {
        expected.expect(IllegalArgumentException.class);
        testEvent.setAction("Meeting");
//        testEvent.setName("In person");
        testLog.addEvent(testEvent);
    }


    @Test
    public void addEventTest() throws IllegalArgumentException {

        testEvent.setName("Meeting");
        testEvent.setAction("In person");

        assertEquals("Test Event.set/getName() : ", testEvent.getName(), "Meeting");
        assertEquals("Test Event.set/getAction() : ", testEvent.getAction(), "In person");

        testLog.addEvent(testEvent);
        assertEquals("Test that Event is added to eventList showing size increases by 1: ", testLog.getNumEvents(), 1);

        assertTrue("Test Event throws exception if Name or Action are omitted: ", testLog.addEvent(testEvent));
    }
}