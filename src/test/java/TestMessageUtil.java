import org.junit.Test;

27. import org.junit.Ignore;

28. import static org.junit.Assert.assertEquals;

29.

30. public class TestMessageUtil {

31.

32. String message = "Robert";

33. MessageUtil messageUtil = new MessageUtil(message);

34.

35. @Test

36. public void testPrintMessage() {

37. System.out.println("Inside testPrintMessage()");

38. assertEquals(message,messageUtil.printMessage());

39. }

40.

41. @Test

42. public void testSalutationMessage() {

43. System.out.println("Inside testSalutationMessage()");

44. message = "Hi!" + "Robert";

45. assertEquals(message,messageUtil.salutationMessage());

46. }

}