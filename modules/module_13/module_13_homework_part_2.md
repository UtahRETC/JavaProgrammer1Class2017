# Module 13 Homework

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
-----------------------------------------------------------------------
#### 1. Old MacDonald Had a Farm

This is a classic English children's song about a farmer that has a farm with animals that make different sounds. We are going to write the song using Java and polymorphism!

To do this, start with the abstract `Animal` class. Notice how you can set its name and sound, but it is abstract. Please `extend` it with some specific animal subclasses. Here are the names and sounds of the subclasses you need to make:

- `Cow`: 'moo'
- `Dog`: 'woof'
- `Cat`: 'meow'
- `Horse`: 'neigh'
- `Duck`: 'quack'

The next thing you need to do is finish implementing the `main` method. Create an array of Animal objects and call `singVerse()` on each of them. Since all of these objects extend `Animal`, you can call `singVerse()` on them.

The last thing you need to do is finish implementing the `Animal` class's `singVerse` method, so the entire song can be sung. When you are finished, your terminal output should match this:

```text
Old MacDonald Had A Farm
Brought to you by Java!

Old MacDonald had a farm, E I E I O!
And on that farm he had a cow, E I E I O!
With a moo, moo, here, and a moo, moo there,
Here a moo, there a moo, everywhere a moo, moo,
Old MacDonald had a farm, E I E I O!

Old MacDonald had a farm, E I E I O!
And on that farm he had a dog, E I E I O!
With a woof, woof, here, and a woof, woof there,
Here a woof, there a woof, everywhere a woof, woof,
Old MacDonald had a farm, E I E I O!

Old MacDonald had a farm, E I E I O!
And on that farm he had a cat, E I E I O!
With a meow, meow, here, and a meow, meow there,
Here a meow, there a meow, everywhere a meow, meow,
Old MacDonald had a farm, E I E I O!

Old MacDonald had a farm, E I E I O!
And on that farm he had a horse, E I E I O!
With a neigh, neigh, here, and a neigh, neigh there,
Here a neigh, there a neigh, everywhere a neigh, neigh,
Old MacDonald had a farm, E I E I O!

Old MacDonald had a farm, E I E I O!
And on that farm he had a duck, E I E I O!
With a quack, quack, here, and a quack, quack there,
Here a quack, there a quack, everywhere a quack, quack,
Old MacDonald had a farm, E I E I O!

```


------------------------------------------------------------------------
