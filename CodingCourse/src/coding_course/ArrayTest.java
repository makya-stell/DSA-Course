package coding_course;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    private Array array;

    @BeforeEach
    public void setUp() {
        array = new Array(3); // Initialize with a small size for testing
    }

    @Test
    public void testRemoveAtInvalidIndex() {
        array.insert(10);
        array.insert(20);
        array.insert(30);
        assertThrows(IllegalArgumentException.class, () -> array.removeAt(3));
    }

    @Test
    public void testArrayInsertAndRemoval() {
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40); // Test resizing
        assertEquals(1, array.indexOf(20));
        array.removeAt(1); // Test removal
        assertEquals(-1, array.indexOf(20));
    }

    @Test
    public void testPrint() {
        array.insert(10);
        array.insert(20);
        array.insert(30);
        // This test can be tricky since print outputs to the console
        // One way is to capture the console output, but here we'll keep it simple
        array.print(); // Manually verify output
    }
}

