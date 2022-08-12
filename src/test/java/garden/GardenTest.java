package garden;

import garden.factories.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;


public class GardenTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testAbstractFactory() {
        Application app;
        GardenFactory gardenFactory = new IranianGardenFactory();
        app = new Application(gardenFactory);
        app.look();
        String[] outs = systemOutRule.getLog().split("\n");
        assertEquals("you are looking at chenar", outs[0]);
        assertEquals("you are looking at khatmi", outs[1]);
        gardenFactory = new JapaneseGardenFactory();
        app = new Application(gardenFactory);
        app.look();
        outs = systemOutRule.getLog().split("\n");
        assertEquals("you are looking at japanese tree", outs[2]);
        assertEquals("you are looking at japanese flower", outs[3]);
    }
}
