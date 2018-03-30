import java.io.StringWriter;
import java.io.PrintWriter;

public class ErrorResponse {

  private static String stackTraceToString(Exception e) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    return sw.toString();
  }

  private String stack;

  public ErrorResponse(Exception e) {
    this.stack = stackTraceToString(e);
  }
}
