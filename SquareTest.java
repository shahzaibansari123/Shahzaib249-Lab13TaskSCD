package lab10Task01Shahzaib;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class SquareTest {
	@Test
	void test() {
		MainClass obj = new MainClass();
		int output=obj.square(5);   //output != 5 then "failed"
		assertEquals(25,output);    //expected result square of is 25
	}
}

