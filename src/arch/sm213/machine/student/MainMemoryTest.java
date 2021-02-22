package arch.sm213.machine.student;
import machine.AbstractMainMemory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MainMemoryTest {
    private MainMemory test;

    @BeforeEach
    void beforeEach() {
        test = new MainMemory(20);
    }

    @Test
    void testIsAccessAligned() {
        //these are quite self explantory
        // false tests mean the mod of the address by length is not 0 mathematically
        // true is the mod is 0 mathematically
        assertTrue(test.isAccessAligned(0, 2));
        assertFalse(test.isAccessAligned(1, 2));
        assertFalse(test.isAccessAligned(15, 2));
        assertFalse(test.isAccessAligned(15, 4));
        assertTrue(test.isAccessAligned(20, 4));
        assertTrue(test.isAccessAligned(8, 8));
        assertTrue(test.isAccessAligned(16, 8));
        assertFalse(test.isAccessAligned(5, 8));
    }

    @Test
    void testBytesToInteger() {
        assertEquals(test.bytesToInteger((byte) 0x10,(byte) 0x20 ,(byte) 0x30  ,(byte) 0x40 ), 270544960);// simple test
        assertEquals(test.bytesToInteger((byte) 0x01,(byte) 0x02 ,(byte) 0x03  ,(byte) 0x04 ), 16909060);// simple test
        assertEquals(test.bytesToInteger((byte) 0xff,(byte) 0xff ,(byte) 0xff  ,(byte) 0xff ), -1); // all 1s
        assertEquals(test.bytesToInteger((byte) 0x80,(byte) 0x80 ,(byte) 0x80  ,(byte) 0x80 ), -2139062144); // 1s in the 8th bit of each
        assertEquals(test.bytesToInteger((byte) 0x10,(byte) 0x10 ,(byte) 0x10  ,(byte) 0x10 ), 269488144);//duplicate bytes
        assertEquals(test.bytesToInteger((byte) 0xff,(byte) 0x00 ,(byte) 0x00  ,(byte) 0xff ), -16776961);//value of 0 between 1st and last byte
        assertEquals(test.bytesToInteger((byte) 0x00,(byte) 0x00 ,(byte) 0x00  ,(byte) 0xff ), 255);//value of 0 in all the bytes except last
    }

    @Test
    void testIntegerToBytes() {

        //same tests as bytes to integer however, swapped around
        byte[] t1 = test.integerToBytes(270544960);
        byte[] a1 = {(byte) 0x10,(byte) 0x20 ,(byte) 0x30  ,(byte) 0x40 };
        assertTrue(sameArray(t1, a1));
        t1 = test.integerToBytes(16909060);
        a1 = new byte[]{(byte) 0x01,(byte) 0x02 ,(byte) 0x03  ,(byte) 0x04};
        assertTrue(sameArray(t1, a1));
        t1 = test.integerToBytes(-1);
        a1 = new byte[]{(byte) 0xff,(byte) 0xff ,(byte) 0xff  ,(byte) 0xff};
        assertTrue(sameArray(t1, a1));
        t1 = test.integerToBytes(-2139062144);
        a1 = new byte[]{(byte) 0x80,(byte) 0x80 ,(byte) 0x80  ,(byte) 0x80 };
        assertTrue(sameArray(t1, a1));
        t1 = test.integerToBytes(269488144);
        a1 = new byte[]{(byte) 0x10,(byte) 0x10 ,(byte) 0x10  ,(byte) 0x10};
        assertTrue(sameArray(t1, a1));
        t1 = test.integerToBytes(-16776961);
        a1 = new byte[]{(byte) 0xff,(byte) 0x00 ,(byte) 0x00  ,(byte) 0xff };
        assertTrue(sameArray(t1, a1));
        t1 = test.integerToBytes(255);
        a1 = new byte[]{(byte) 0x00,(byte) 0x00 ,(byte) 0x00  ,(byte) 0xff };
        assertTrue(sameArray(t1, a1));
    }

    //helper method to compare byte arrays cuz i forgot the line of code for comparing elements of an array
    // and i was too lazy to google
    private boolean sameArray(byte[] b1, byte[] b2) {
        for(int x = 0; x < b1.length; x++) {
            if(b1[x] != b2[x]) {
                return false;
            }
        }
        return true;
    }

    @Test
    void testGetWithException() throws AbstractMainMemory.InvalidAddressException {
        try{
            //all of these are outside the range thus it should be catching an exception
            test.get(21, 4); //out of bounds
            test.get(17, 4); //goes out of bounds
            //didnt catch en exception therefore it didn't work
            fail("should've thrown exception");
        } catch(AbstractMainMemory.InvalidAddressException e) {
            //catches the exception therefore it worked :)
            assertTrue(true);
        }
    }

    @Test
    void testGetNoException() throws AbstractMainMemory.InvalidAddressException {
        try {
            //none of these catch an exception
            byte[] t1 = new byte[4];
            byte[] a1 = test.get(0, 4);
            //both byte arrays have empty values and same length
            assertTrue(sameArray(a1, t1));
            a1 = test.get(16, 4);
            //different memory location but should share same values and length
            assertTrue(sameArray(a1, t1));
            t1 = new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
            test.set(4, t1);
            //different memory location and this time contains values
            assertTrue(sameArray(test.get(4,4), t1));
            test.set(16, t1);
            //checking the same but at the end of the array
            assertTrue(sameArray(test.get(16,4), t1));
        } catch (AbstractMainMemory.InvalidAddressException e) {
            //if any of these caught an exception it failed.
            fail("Should not have thrown an exception");
        }
    }

    @Test
    void testSetWithException() throws AbstractMainMemory.InvalidAddressException{
        try {
            //these should give an exception
            test.set(22, new byte[]{(byte) 0xff}); //out of bounds
            test.set(18, new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff}); // goes out of bounds
            fail("should've thrown exception");
        } catch (AbstractMainMemory.InvalidAddressException e) {
            assertTrue(true);
        }
    }

    @Test
    void testSetNoException() throws AbstractMainMemory.InvalidAddressException{
        try {
            byte[] b1 = new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff};
            //set memory address [16,19] as 0xff, 0xff, 0xff
            test.set(17, b1);
            //set memory address [0,2] as 0xff, 0xff, 0xff
            test.set(0, b1);
            //test if they were correctly set in the right memory address listed above ^
            assertTrue(sameArray(b1, test.get(17, 3)));
            assertTrue(sameArray(b1, test.get(0, 3)));
            //create byte array with 4 bytes (int)
            b1 = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
            //set memory address [3,6] as 0x01, 0x02, 0x03, 0x04
            test.set(4,b1);
            //test if the int was correctly set in the proper memory address
            assertTrue(sameArray(test.get(4,4), b1));
        } catch (AbstractMainMemory.InvalidAddressException e) {
            //shouldn't have caught an exception as all the tests are valid
            fail("Should not have caught exception");
        }
    }

}
