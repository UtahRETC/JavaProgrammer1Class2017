# Java cert prep class (Project 1)

# Content

- *DONE* Put together slides for previous week's review.
- *DONE* Put together slides for Git intro.
- *DONE* Put together slides for GitHub intro.
- *DONE* Put together slides for class structure changes.
- *DONE* Put together slides for homework.
- *DONE* Put together actual homework.
- *DONE* Compile list of Pluralsight videos for next week's lesson and
  coordinate with instructors for that week so they know what students are
  prepping with.
- *DONE* Decide if we're going to introduce IDE's: not for now.
- *DONE* Talk to next week's instructors about what videos students will watch.

## Videos and homework

Require students to watch the Pluralsight content listed below and for the
homework, they will take notes on the video and push them to GitHub. Commits
for video notes should be at five different times.

- Representing Complex Types with Classes
  https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m5&clip=0&mode=live

- Class Initializers and Constructors
  https://app.pluralsight.com/player?course=java-fundamentals-language&author=jim-wilson&name=java-fundamentals-language-m6&clip=0&mode=live

Also, I was thinking we could have then write a paragraph or so that describes
the new terminology and topics introduced in class:

- Git
- GitHub
- Version Control
- Open Source

## Outline

1. Go over homework
2. Review last week's content (Martijn's Summary)
3. Git
4. GitHub account setup
5. Pluralsight account setup
6. Explain class structure change
7. Go over homework

## Resources

- https://software-carpentry.org/blog/2012/12/some-of-the-things-weve-learned-about-teaching-git.html
- https://recompilermag.com/issues/issue-1/how-to-teach-git/
- https://swcarpentry.github.io/git-novice/guide/

# For next week

- “Representing Complex Types with Classes” which goes over the basics of
  classes and how they are used, access modifiers, methods, return statements,
  “this”, and fields encapsulation.

- “Class Initializers and Constructors” which goes over constructors, initial
  state, constructor overloading, and initialization blocks.

They’re both from this course
https://app.pluralsight.com/library/courses/java-fundamentals-language/table-of-contents
which lines up really well with what we’re trying to do.


## Summary of this week's lesson

Below are slides that can be used as this week's summary. They review git
commits and how to use them:

-----------------------------------------------------------------------------

`git add`: Use this command to tell Git to start tracking the changes you make to a file. Example: `git add HelloWorld.java`

`git commit`: Use this command once you are done with a set of updates to your code and you are ready to package them so that you can share them with others. `git commit -m "Fixing a bug"`

`git push`: Use this command to make your commits available to the rest of your team. Example: `git push origin master`

`git status`: Use this command to get information about your repository. Tells you what files Git is not tracking and which ones you have modified.

`git clone`: Use this command to download a copy of a repository to your own computer. Only need to do this once.

-----------------------------------------------------------------------------

```bash
> # After you cloned your repo and cd into the folder
> git status
> git add Calculator.java
> git add Main.java
> git commit -m "Finished the Calculator homework"
> git push origin master
```

-----------------------------------------------------------------------------
