import harnesses.ResourceLoader;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Tests for the dojo.
 */
public class DojoTest {
	
	@Before
	public void setup() {

	}

    @Test
    public void test_congrats_order_paid_off_for_ios_8_10_0() throws IOException {
        Map congrats = JSONMapper.toObject(
                ResourceLoader.getFileAsString("congrats/congrats/congrats_order_paid_off_for_ios_8_10_0.json"),
                Map.class
        );

        Cliente cliente = new iOS();

        Congrat congrat = new Congrat(congrats);

        assertEquals(
                ((List<Map>)congrat.asMap(cliente).get("sections")).get(0).get("type"),
                "mlu_offline_payment"
        );

        assertEquals(
                ((List<Map>)congrats.get("sections")).get(0).get("type"),
                "mlu_offline_payment"
        );

    }

    @Test
    public void test_congrats_order_paid_off_for_android_7_12_0() throws IOException {
        Map congrats = JSONMapper.toObject(
                ResourceLoader.getFileAsString("congrats/congrats/congrats_order_paid_off_for_android_7_12_0.json"),
                Map.class
        );

        assertEquals(
                ((List<Map>)congrats.get("sections")).get(0).get("type"),
                "offline_payment"
        );

    }

    @Test
    public void test_congrats_order_paid_off_for_ios_8_10_0_sent_to_android_7_12_0() throws IOException {
        Map congrats = JSONMapper.toObject(
                ResourceLoader.getFileAsString("congrats/congrats/congrats_order_paid_off_for_ios_8_10_0.json"),
                Map.class
        );

        Cliente cliente = new Android();

        Congrat congrat = new Congrat(congrats);

        assertEquals(
                ((List<Map>)congrat.asMap(cliente).get("sections")).get(0).get("type"),
                "offline_payment"
        );
    }

    @Test
    public void test_congrats_order_paid_off_for_android_7_12_0_sent_to_ios_8_10_0() throws IOException {
        Map congrats = JSONMapper.toObject(
                ResourceLoader.getFileAsString("congrats/congrats/congrats_order_paid_off_for_android_7_12_0.json"),
                Map.class
        );

        Cliente cliente = new iOS();

        Congrat congrat = new Congrat(congrats);

        assertEquals(
                ((List<Map>)congrat.asMap(cliente).get("sections")).get(0).get("type"),
                "mlu_offline_payment"
        );
    }

    @Test
    public void test_congrats_order_paid_off_for_android_103() throws IOException {
        Map congrats = JSONMapper.toObject(
                ResourceLoader.getFileAsString("congrats/congrats/congrats_order_paid_off_for_android_7_12_0.json"),
                Map.class
        );

        Cliente cliente = new Android103();

        Congrat congrat = new Congrat(congrats);

        assertEquals(
                ((List<Map>)congrat.asMap(cliente).get("sections")).get(0).get("type"),
                "OFFLINE_PAYMENT"
        );
    }

    @Test
    public void test_congrats_order_paid_off_for_ios_9() throws IOException {
        Map congrats = JSONMapper.toObject(
                ResourceLoader.getFileAsString("congrats/congrats/congrats_order_paid_off_for_android_7_12_0.json"),
                Map.class
        );

        Cliente cliente = new iOS9();

        Congrat congrat = new Congrat(congrats);

        assertFalse(((List<Map>)congrat.asMap(cliente).get("sections")).stream().anyMatch(x -> x.get("type").equals("exit")));
    }

    @Test
    public void test_congrats_order_paid_off_for_android_10() throws IOException {
        Map congrats = JSONMapper.toObject(
                ResourceLoader.getFileAsString("congrats/congrats/congrats_order_paid_off_for_android_7_12_0.json"),
                Map.class
        );

        Cliente cliente = new Android10();

        Congrat congrat = new Congrat(congrats);

        assertFalse(((List<Map>)congrat.asMap(cliente).get("sections")).stream().anyMatch(x -> x.get("type").equals("exit")));
    }

}
