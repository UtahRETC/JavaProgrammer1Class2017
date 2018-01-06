# Dates and Times

* How much time does something take?
* How many days left in this year?
* What is today's date?
* Is this a leap year?

---

# Before we start...

* Timezones
* Leap Years
* 12 vs 24 hour

![](images/tz.gif)

---

# Basic Dates and Time in Java
* class [Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html) - Storing and working with dates (like `February 10, 2018`) **and** times (like `01:45pm`)
* class [Calendar](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html) - Manipulating 
```Java

```
[Why two different classes?](https://stackoverflow.com/a/1404216) Short answer: If you want manipulate a date and time after storing it, use Calendar.

---

# Example

```Java
import java.util.Date;
import java.util.Calendar;

class DateStuff {
  public static void main(String[] args) {
    // Get a Date with the current 
    // date and time
    Date myDate = new Date();
    // Get a Calendar with the current
    // date and time
    Calendar myCal = Calendar.getInstance();
  }
}
```

---

