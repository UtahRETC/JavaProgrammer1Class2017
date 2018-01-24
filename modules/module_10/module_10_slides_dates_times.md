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

Use a date: `java.time.LocalDate`

---

# What are Dates and Times?

A time represents a specific time of day.

## A **time**: 14:30:45

See how Java represents a time: HH:MM:SS.
Java uses a **24-hour** clock, so 2PM is 14:00

Use a time: `java.time.LocalTime`

---

# Date and Time together

Very often, you want both a date and a time in one.

## A date and time: `2018-01-27T14:30:45`

See how Java represents a date and time: a capital letter T between the date and the time parts.

Use a date/time: `java.time.LocalDateTime`

--- 


# Practice

Write a program that outputs the current date and the current time.