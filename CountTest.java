package lab10Task01Shahzaib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CountTest {
	@Test
	void test() {
		MainClass obj = new MainClass();
		int output=obj.countA("Shahzaib");
		assertEquals(2,output);
	}
}
