package exceptions;

import java.util.Arrays;
import java.util.List;

class EmailNotFoundException extends Exception {
  private static final long serialVersionUID = 1731774659546179481L;

  public EmailNotFoundException(String message) {
    super(message);
  }

  // To maintain the root cause we can use this constructor
  public EmailNotFoundException(String message, Throwable err) {
    super(message, err);
  }
}

public class CheckedExceptionCustom {
  static List<String> emailIds = Arrays.asList("abc@sts.in", "pqr@sts.in", "qwer@gmail.com");

  public static void main(String[] args) {
    try {
      new CheckedExceptionCustom().validateEmail("komal@test.com");
    } catch (EmailNotFoundException e) {
      e.printStackTrace();
    }
  }

  public boolean validateEmail(String email) throws EmailNotFoundException {
    if (emailIds.contains(email)) {
      return true;
    }
    throw new EmailNotFoundException(email + " is invalid");
  }
}
