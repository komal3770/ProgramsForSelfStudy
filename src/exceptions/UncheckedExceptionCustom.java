package exceptions;

import java.util.regex.Pattern;

class DomainNotAllowedException extends RuntimeException {
  private static final long serialVersionUID = 6364429183259096292L;

  public DomainNotAllowedException(String message) {
    super(message);
  }
}

public class UncheckedExceptionCustom {
  String domainPattern =
      "^[a-zA-Z0-9_.+-]+@(?:(?:[a-zA-Z0-9-]+\\.)?[a-zA-Z]+\\.)?(sts|gmail)\\.com$";

  public static void main(String[] args) {
    new UncheckedExceptionCustom().validateDomail("komal@sts.com"); // valid
    new UncheckedExceptionCustom().validateDomail("komal@test.com"); // invalid
    System.out.println("Graceful closed the main");
  }

  public boolean validateDomail(String email) {
    if (Pattern.matches(domainPattern, email)) return true;
    throw new DomainNotAllowedException(email + " contains invalid domain name");
  }
}
