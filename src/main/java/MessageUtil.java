public class MessageUtil {

9. private String message;

10.

11. public MessageUtil(String message) {

12. this.message = message;

13. }

14.

15. public String printMessage() {

16. System.out.println(message);

17. return message;

18. }

19.

20. public String salutationMessage() {

21. message = "Hi!" + message;

22. System.out.println(message);

23. return message;

24. }

}