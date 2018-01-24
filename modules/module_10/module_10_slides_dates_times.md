# Dates and Times

Almost all software uses dates and times. It is important to know how to use them.

Dates and times work differently in Java 8 compared to previous versions.

If you search on the internet, you may find examples that use older code based on Java 6 or 7. **Do not use** these in your programs or in the exam.

__Book__: Chapter 3, pages 138 to 152

---

# What are Dates and Times?

A date represents a specific day. It can be any day in the past, in the future, or today.

## Today's **date**: 2018-01-27

See how Java represents a date: YYYY-MM-DD

Use a date: [`java.time.LocalDate`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)

---

# What are Dates and Times?

A time represents a specific time of day.

## A **time**: 14:30:45

See how Java represents a time: HH:MM:SS.
Java uses a **24-hour** clock, so 2PM is 14:00

Use a time: [`java.time.LocalTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)

---

# Date and Time together

Very often, you want both a date and a time in one.

## A date and time: `2018-01-27T14:30:45`

See how Java represents a date and time: a capital letter T between the date and the time parts.

Use a date/time: [`java.time.LocalDateTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)

--- 

# Common Operations

## Right now: `.now()`
This works on all classes
```
LocalDate d = LocalDate.now();
LocalTime t = LocalTime.now();
LocalDateTime dt = LocalDateTime.now();
```

--- 
# Common Operations

## A specific date or time: `.of()`

```java
LocalDate yesterday = LocalDate.of(2017, 1, 26);
LocalTime noon = LocalTime.of(12, 0);
LocalDateTime l = LocalDateTime.of(2017, 1, 26, 12, 0);
```

You can also combine a date and time object to create a `LocalDateTime`: 

```java
LocalDateTime l2 = LocalDateTime.of(yesterday, noon);
```

Let's see this [in practice]().

---

# Older ways

There are a lot of examples on the internet that use older ways of using dates and times. **Do not use these**.

```java
//DO NOT USE!
Date d = new Date();
Calendar c = Calendar.getInstance();
```

![](images/cowboy-shaking-head.gif)

The book has more old examples you should not use.

---

# Adding and Subtracting

Methods are named `minus` and `plus` followed by the unit (Seconds, Days, Weeks), like this:

```java
LocalDate d = LocalDate.now();
//Add a year
LocalDate nextYear = d.plusYears(1);
// Subtract two months
LocalDate fourMonthsAgo = d.minusMonths(4);
// Add two weeks
LocalDate twoWeeksFromNow = d.plusWeeks(2);
// Subtract a day
LocalDate yesterday = d.minusDays(1);
```

You can use these on `LocalDate`, `LocalTime` and `LocalDateTime`. 

<big>❓</big>How would you subtract 15 seconds from a day object?
<big>❓</big>What happens when you call `.addMinutes(1)` to a `LocalDate` object?

--- 

# Practice

Write a small program that prints your next birthday.

Extra: Also print the day of the week of your next ten birthdays.

_Hint: look up the `getDayOfWeek()` method._

---

# Method Chaining

This is a good time to introduce a pattern that is used a lot in Java: **method chaining**.

Method chaining is calling several methods in the same statement: `thing.doThis().thenThat().thenSomethingElse()`

We can use this with the add / subtract methods as follows:

```java
LocalDateTime l = LocalDateTime.now();
LocalDateTime someTime = l.plusYears(1).minusDays(1);
```
<big>❓</big>What date / time would `someTime` be?

--- 

# Periods

A `Period` is a specific length of time. Defining periods makes your code more readable and reusable.

```java
Period aYear = Period.ofYears(1);
Period aQuarter = Period.ofMonths(3);
Period oneMonthAndFourDays = Period.of(0, 1, 4);

LocalDate d = LocalDate.now();
LocalDate nextYear = d.plus(aYear);
```

---

# The Real World

In the real world, we do not write dates as `2018-01-27` but as `1/27/2018` or `January 27, 2018` (in the United States).

To represent dates and times in 'human readable` format, we use a **Formatter**.


`LocalDate`
`LocalTime` ▶▶▶▶▶▶ **Formatter** ▶ Human readable time / date
`LocalDatetime`

---

# Summary

```java
// A date: December 7, 
LocalDate d = LocalDate.of(1972, 12, 7);
```

--- 

# Other useful methods (extra)

If you want to determine if one date / time is before or after another: `.isbefore()` / `.isAfter()`

If you want to know the `Period` since or until another date / time: `.until()` / `since()`

```java
LocalDate now = LocalDate.now();
LocalDate christmas = LocalDate.of(2018, 12, 25);
Period untilChristmas = now.until(christmas);
```

--- 

# What about time zones? (extra)

The classes we learned about use **Local** times and dates. This is all you need for the exam. It is possible to work with time zones in Java, but we will not cover this in class.

![](images/tz.gif)
