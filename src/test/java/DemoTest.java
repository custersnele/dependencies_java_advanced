import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest {

	@Test
	void hasLetterA() {
		String text = "aap";
		assertTrue(text.contains("a"));
	}

}
