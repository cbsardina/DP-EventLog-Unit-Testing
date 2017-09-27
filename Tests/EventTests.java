import com.sardina.Event;
import com.sardina.EventLog;
import com.sardina.IllegalArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class EventTests {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testExceptionThrows() throws IllegalArgumentException {
        System.out.println("----- Testing testExceptionThrows() ------");
        Event testEvent = new Event();
        EventLog testLog = new EventLog();
        expected.expect(IllegalArgumentException.class);

        //bad action string throws exception and passes test
//        testEvent.setAction("CarrierPigeon");
        testEvent.setAction("MorseCode");

        //good action string will not pass test b/c does not throw exception
//        testEvent.setAction("Face2Face");
//        testEvent.setAction("PhoneCall");
//        testEvent.setAction("TextMessaging");
//        testEvent.setAction("Unknown");

        testLog.addEvent(testEvent);
    }

    @Test
    public void addEventTest() throws IllegalArgumentException {
        System.out.println("----- testing addEventTest() -----");
        Event testEvent = new Event();
        EventLog testLog = new EventLog();
        testEvent.setName("Meeting");
        testEvent.setAction("Unknown");

        assertEquals("Test Event.set/getName() : ", testEvent.getName(), "Meeting");
        assertEquals("Test Event.set/getAction() : ", testEvent.getAction(), "Unknown");

        testLog.addEvent(testEvent);
        assertEquals("Test that Event is added to eventList showing size increases by 1: ", testLog.getNumEvents(), 1);
        assertTrue("Test Event throws exception if Name or Action are omitted: ", testLog.addEvent(testEvent));
    }

}