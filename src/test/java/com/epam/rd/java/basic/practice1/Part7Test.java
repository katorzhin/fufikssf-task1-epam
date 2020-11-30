package com.epam.rd.java.basic.practice1;




import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Part7Test {

    @Test
    void str2int() {
        assertEquals(1, Part7.str2int("A"));
        assertEquals(2, Part7.str2int("B"));
        assertEquals(26, Part7.str2int("Z"));
        assertEquals(27, Part7.str2int("AA"));
        assertEquals(28, Part7.str2int("AB"));
        assertEquals(703, Part7.str2int("AAA"));
    }

    @Test
    void int2str() {
        assertEquals("A", Part7.int2str(1));
        assertEquals("B", Part7.int2str(2));
        assertEquals("Z", Part7.int2str(26));
        assertEquals("AA", Part7.int2str(27));
        assertEquals("AB", Part7.int2str(28));
    }

    @Test
    void rightColumn() {
        assertEquals("B", Part7.rightColumn("A"));
        assertEquals("C", Part7.rightColumn("B"));
        assertEquals("Z", Part7.rightColumn("Y"));
        assertEquals("AA", Part7.rightColumn("Z"));
        assertEquals("AB", Part7.rightColumn("AA"));
        assertEquals("AAB", Part7.rightColumn("AAA"));
        assertEquals("AC", Part7.rightColumn("AB"));
    }
}