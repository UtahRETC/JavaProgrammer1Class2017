# Java 8 Programmer 1 UtahRETC Class Content

We're using [OCA: Oracle Certified Associate Java SE 8
Programmer](http://www.wiley.com/WileyCDA/WileyTitle/productCd-1118957407.html)
as a reference of the content that should covered in this class. Keep in mind
that the goal is that by the end of the class, students will be able to take
the Programmer I certificate test and pass.

### Slides

Slides are generated using [Marp](https://yhatt.github.io/marp/) which uses
markdown for its formatting. This will give us a consistant look and feel to
every slide deck, even when different people are working on different sections.
For an introduction to markdown, follow
[this](https://daringfireball.net/projects/markdown/syntax) link. And for
examples of how Marp translates markdown formatting into slides, follow
[this](https://raw.githubusercontent.com/yhatt/marp/master/example.md) link for
an example slide deck.

### Getting started

Follow these steps to create a new slide deck:

1. Pick a section in the [outline documentation](classes/outline.md) and make
   sure you are familiar and confortable with the content.
2. Create a new class directory in the `classes` folder. If you have class 2,
   then create `classes/class_02`.
3. Make a copy of the [sample outline](samples/sample_outline.md) and rename it
   to `class_N_outline.md` where `N` is your class number (obvs). Save this in
   your class directory.
4. Repeat the previous step with the [sample slides](samples/sample_slides.md)
   and [sample homework](samples/sample_homework.md).
5. Using Marp, export your slides and homeword as a PDFs and save them to the
   class folder. (`File > Export Slides as PDF`)
6. I'm using [`ghmd`](https://github.com/alxlu/ghmd) (`npm i -g ghmd`) to
   generate an html file of the homework, opening it in Chrome, and using the
   save to PDF option when printing the file. I then save it to the class
   folder.
