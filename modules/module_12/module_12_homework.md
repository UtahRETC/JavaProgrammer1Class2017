# Module 12 Homework

<style>
@media print {
  pre {
    border: 1px solid gray;
    page-break-inside: avoid;
  }
}

.break {
  page-break-after: always;
}
</style>

#### 1. Different kinds of shapes

Start in the code in the `shapes` folder. Compile and run the `Main` class and you will see a window appear with some shapes inside of it. You will see a triangle and a diamond. These shapes use the `Triangle` and `Diamond` classes, which both inherit from the `Shape` class.

Your job is to make two new classes, `Circle` and `Square`, that both inherit from the `Shape` class just like the other shapes. To do this, you will need to write a constructor method and a `render` method. Next, you will need to add the shapes to the list in `Main`, with the right X and Y coordinates.

When you are finished, you should see a picture like this:

**TODO: Insert picture here**

Hints:

- The [`drawRect`](https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html#drawRect-int-int-int-int-) method will draw a rectangle or a square.
- The [`drawOval`](https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html#drawOval-int-int-int-int-) method will draw an oval or a circle.
- If you get stuck, use the `Triangle` and `Diamond` classes as examples!

#### 2.


Something with overriding methods
