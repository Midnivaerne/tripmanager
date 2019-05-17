package pl.edu.agh.mwo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringBufferInputStream;
import java.io.StringWriter;

public class PhotoTest {
    @Test
    public void testGetComment() {

        Photo photo = new Photo ("");
        photo.setComment("Added new comment");
        assertEquals("Added new comment", photo.getComment());
    }

    @Test
    public void testSetComment() {
        Photo photo = new Photo ("Examplary comment");

        photo.setComment("Setter testing comment");
        assertEquals("Comment for testing setter", photo.getComment());
    }


    @Test
    public void testStringConstructor() {
        Photo photo = new Photo ("Examplary comment");
        assertEquals("Examplary comment", photo.getComment());
    }
}
