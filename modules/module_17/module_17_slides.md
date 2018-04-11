# Outline
- Lambdas - Overview
-   Methods not bound to a class
-   Executable code that can be passed around
- Implementing class as carrier of a function
-   Syntax around a function
-   convert to lambda
- Interface as type
-   functional interface
-   Built in functional interfaces
- Method Reference
-   existing method used as lambda
    
- Connection to Interfaces
- 

---
# Methods as Code Blocks
```
class Child {
    public void clean(String room) {
        System.out.println("vacuuming " + room);
        System.out.println("Cleaning windows in " + room);
    }
} 
```
```
class Parent {
    private String[] rooms = {"Living room", 
        "First Bedroom", "Bathroom", "Second Bedroom"};
    private int nextRoomIndex = 0;

    public void assignRoomToClean(Child child) {
        child.clean(rooms[nextRoomIndex]);
        nextRoomIndex = nextRoomIndex + 1;
    }
}
```
```
Parent parent = new Parent();
parent.assignRoomToClean(new Child());
```
---
# Methods as Code Blocks
```
interface Child {
    public void clean(String room);
}
class Child1 implements Child {
    public void clean(String room) {
        System.out.println("vacuuming " + room);
        System.out.println("Cleaning windows in " + room);
    }
}
class Child2 implements Child {
    public void clean(String room) {
        System.out.println("Hiding everything " +
            "under the rug in " + room);
    }
}
```
```
Parent parent = new Parent();
parent.assignRoomToClean(new Child1());
parent.assignRoomToClean(new Child2());
```
---
# Introducing Lambdas
```
Parent parent = new Parent();
parent.assignRoomToClean((String room) -> {
    System.out.println("vacuuming " + room);
    System.out.println("Cleaning windows in " + room);
});
parent.assignRoomToClean((String room) ->
    System.out.println("Hiding everything " +
         "under the rug in " + room));
```

General Syntax: (Parameter List) -> {function body}

---
# Functional Interface
Can only contain a single method.
```
interface Child {
    public int clean(String room);
}
```

Lambda Syntax: (Parameter List) -> {function body}
Lambda Rules:
- Parameter List types and positions much match Functional Interface method parameter list
- Return type of function body must match return type of Functional Interface method


---
# Rules examples
```
interface Knight{
    public Boolean battle(String weapon,
                          String[] piecesOfArmor, 
                          String enemy);
}
```
```
Knight knight1 = (String weapon, 
                  String[] piecesOfArmor, 
                  String enemy) -> {
    return true;
};
```
```
Knight knight2 = (String sword,
                  String[] piecesOfArmor,
                  String enemy) -> {
    System.out.println("Hitting " +
             enemy + " with " + sword);
    return true;
};
```
---
# Rules examples
```
interface Knight{
    public Boolean battle(String weapon,
                          String[] piecesOfArmor, 
                          String enemy);
}
```
```
Knight knight3 = (String weapon,
                  String[] piecesOfArmor,
                  String enemy) -> {
    return "win";
};
```
```
Knight knight4 = (String weapon,
                  String piecesOfArmor,
                  String enemy) -> {
    return true;
};
```
---
# Rules examples
```
interface Knight{
    public Boolean battle(String weapon,
                          String[] piecesOfArmor, 
                          String enemy);
}
```
```
Knight knight5 = (String weapon,
                  String[] piecesOfArmor) -> {
    return true;
};
```
```
Knight knight6 = (String weapon,
                  String[] piecesOfArmor,
                  String enemy,
                  String ally) -> {
     return true;
};
```

---
# Valid Shortcuts
Leave off paremter list types
```
Child child = (room) -> {
    System.out.println("doing nothing");
};
```
Leave off curly braces for single line body
```
Child child = (room) -> 
                System.out.println("doing nothing");
```
Leave off parenthesis for single parameter

```
Child child = room ->
                System.out.println("doing nothing");
```
---
# Built-in Functional Interfaces

---

# Method reference

---

# Summary
