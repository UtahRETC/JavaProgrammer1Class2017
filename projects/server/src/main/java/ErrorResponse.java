import java.io.PrintWriter;
import java.io.StringWriter;

public class ErrorResponse {
  private String stack;

  private static String stackTraceToString(Exception e) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    return sw.toString();
  }

  public ErrorResponse(Exception e) {
    this.stack = stackTraceToString(e);
  }
}
