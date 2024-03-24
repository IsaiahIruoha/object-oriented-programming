# ELEC 279 Introduction to Objected Oriented Programming

## Classes
- Emphasizes the significance of classes, the cornerstone of OOP.
- Programming in Java often involves defining classes and utilizing predefined ones.
- All programmer-defined types are classes.
- Every program itself is a class.

### Characteristics of Classes
- **Encapsulation**: Key characteristic, encapsulating instance variables, methods, and other classes.
- Clean and efficient design and coding result from good encapsulation.

### Content of a Class
- Class definition contains instance variables (data items) and methods.
- Instance variables and methods are termed members of a class.
- Usually, instance variables are declared first, followed by method definitions.

## The `new` Operator
- Objects of a class are declared using variables of the class type.
- The `new` operator creates the object.
- Example: `BankAccount account1 = new BankAccount();`

## Constructors
- Special methods designed to initialize instance variables for an object.
- Must have the same name as the class and no return type.
- Two types of constructors: no-argument and parameterized.

### Example Constructors
```java
public BankAccount() {
    owner = "";
    balance = 0.0;
}

public BankAccount(String ownerName, double firstDepositAmount) {
    owner = ownerName;
    balance = firstDepositAmount;
}
```
- Constructors are invoked when objects of the class are created using `new`.

### Invoking Another Method in a Constructor
- Legal to invoke another method within a constructor for cleaner initialization.
- Allows for better organization and readability.

### `this` Parameter
- Refers to the object created by the constructor.
- Enables disambiguation when local variables have the same names as instance variables.

### Examples of `this` Usage
- Ensures clarity and avoids variable ambiguity.

## Best Practices
- **Include a No-Argument Constructor** to allow default object creation.
- **Default Variable Initializations**: Java automatically initializes instance variables, but explicit initialization is recommended for clarity and predictability.

# ELEC 279 Introduction to Objected Oriented Programming: Classes (II)

## Create Objects Using `new` Operator
```java
BankAccount account1 = new BankAccount();
BankAccount account2 = new BankAccount("Tom", 100.0);
```

## Constructors
```java
public class BankAccount {
    private String owner;
    private double balance;
    
    public BankAccount() {
        owner = "";
        balance = 0.0;
    }
    
    public BankAccount(String ownerName, double firstDepositAmount) {
        owner = ownerName;
        balance = firstDepositAmount;
    }
};
```

## The `public` and `private` Modifiers
```java
public class BankAccount {
    public String owner;
    int accountId;
    private double balance;
    private double interestRate;
    
    public void deposit(double amount) {...}
    public double withdrawAll() {...}
    private double computeInterest() {...}
};
```

## Accessor and Mutator Methods
- Accessor methods (`get`) allow obtaining values without changing them.
- Mutator methods (`set`) allow changing values in a controlled manner.
- They ensure data encapsulation and information hiding.

## Information Hiding and Encapsulation
- Information hiding separates how to use a class from its implementation details.
- Encapsulation combines data and methods into a single unit, hiding implementation details.

## API
- The API describes how to use a class.
- Understanding the API is crucial for effective utilization of predefined classes.

## More Details about Methods
- Method definitions consist of a heading and a method body.
- Methods can return a value (`typeReturned methodName(paramList)`) or perform an action (`void methodName(paramList)`).
- `return` statements are used to return values from methods.

## Local Variables
- Variables declared within a method are local variables.
- They are only accessible within the method's scope.

## Global Variables
- Java does not have global variables.
- Global variables can lead to abuse and are not encouraged in Java.

## Blocks
- Blocks are sets of Java statements enclosed in braces `{}`.
- Variables declared within a block are local to that block.

## The Methods `equals()` and `toString()`
- `equals()` compares two objects for equality.
- `toString()` returns a String representation of the object's data.

## Overloading
- Overloading occurs when methods in the same class have the same name but different parameter types.
- Signatures of overloaded methods must be different.

## Pitfall: Overloading Based on Return Type
- Java does not permit overloading based on return types.

## Operators Overloading
- Java does not support operator overloading.
- Methods must be used instead to carry out desired operations.

# ELEC 279 Introduction to Objected Oriented Programming: Static Methods & Variables

## Overloading

### Definition
Overloading occurs when two or more methods in the same class have the same method name but different parameter types.

### Example
```java
public class BankAccount {
    private String owner;
    private int accountId;
    private String govId;
    
    public boolean setIdentity(String owner, int accountId) {…}
    public boolean setIdentity(String owner, String govId) {…}
};
```

### Valid Overloading
- To be valid, any overloaded definitions of a method must have different signatures.
- A signature consists of the name of a method together with its list of parameter types.
- For example, the signature of the method `public boolean setIdentity(String owner, int accountId)` is `setIdentity(String, int)`.
- Different signatures must have different numbers and/or types of parameters.

### Pitfall: Overloading Based on Return Type
- Java does not permit methods with the same signature and different return types in the same class.

### Operators Overloading
- Java does not support operator overloading.
- Methods must be used instead to carry out desired operations.
- For example, instead of overloading the `+` operator, you can define a method like `public double plus(double number1, double number2)`.

## Static Variables

### Definition
- A static variable is a variable that belongs to the class as a whole, not just to one object.
- There is only one copy of a static variable per class, unlike instance variables where each object has its own copy.

### Example
```java
public class BankAccount {
    private static int myStaticVariable = 0;
};
```

### Initialization
- Static variables can be declared and initialized at the same time.
- If not explicitly initialized, a static variable will be automatically initialized to a default value.

### Final Static Variables
- A static variable should generally be defined private, unless it is also a defined constant, through the `final` keyword.
- The value of a static defined constant cannot be altered, therefore it is safe to make it public.

# ELEC 279 Introduction to Objected Oriented Programming: Classes (IV)

## Wrapper Classes
- Wrapper classes provide a mechanism to "wrap" primitive values in an object so that primitives can perform activities reserved for objects.
- Wrapper classes contain predefined constants and static methods for various operations like converting primitive types to and from string objects, converting to various bases, or comparing various objects.
- Each primitive type has a corresponding wrapper class.

## Boxing and Unboxing
- Boxing: converting a value of a primitive type to an object of its wrapper class.
- Unboxing: converting an object of a wrapper class to the corresponding value of a primitive type.
- Starting from Java version 5.0, automatic boxing and unboxing are supported.

## Constants and Static Methods in Wrapper Classes
- Wrapper classes include useful constants and static methods.
- Examples:
  - Integer.MAX_VALUE, Integer.MIN_VALUE
  - Double.MAX_VALUE, Double.MIN_VALUE
  - Static methods for parsing and converting numeric values from/to strings.

## Variables and Memory
### Memory
- Computers have two forms of memory: secondary memory and main memory.
- Main memory holds values of variables during program execution.
- Main memory consists of a list of numbered locations called bytes.
- Each byte contains eight bits.
- Values of most data types require multiple bytes of storage.

### Variables in Memory
- Data items are stored in memory locations.
- Each variable is assigned a memory location.
- Variables of class types store memory addresses or references.

### Class Type Variables Store an Address/Reference
- When a variable is of a class type, only the memory address where its object is located is stored in the variable.
- The object itself is stored in another location in memory.

### References
- Two reference variables can contain the same reference, naming the same object.
- Changes to one object will affect the other if they share the same reference.

### Use == with Variables of a Class Type
- The == operator checks if two class type variables contain the same memory address.
- It doesn't compare the values of the objects themselves.

## The `equals` Method
- Used to check if two objects have the same content.
- Custom implementation required for classes.
- Compares the values of instance variables.

### The Constant `null`
- `null` indicates that a variable has no "real value".
- Used as a placeholder for uninitialized variables.
- Comparison with `null` should use `==` or `!=` instead of `equals`.

### Pitfall: Null Pointer Exception
- Occurs when attempting to invoke a method on a null reference.
- `null` is not an object, but a placeholder for a reference.

## Parameters of Methods in Java
- In Java, all method parameters are call-by-value.
- Primitive type parameters cannot change the value of the original variable.
- Class type parameters can change the values of instance variables of the object passed to the method.

### Class Parameters
- Plugging a value into a class type parameter creates another name for the argument.
- Changes made to the object named by the parameter affect the object named by the argument.

### Differences Between Primitive and Class-Type Parameters
- Methods cannot change the value of a primitive type argument.
- Methods can change the instance variables of a class type argument.

# ELEC 279 Introduction to Objected Oriented Programming: Classes (V)

### Wrapper Classes
- Boxing & unboxing
- Automatic boxing/unboxing
- Static variables in wrapper classes (e.g., `Integer.MAX_VALUE`)
- Static methods in wrapper classes (e.g., `Double.parseDouble("0.015")`, `Integer.parseInt("87")`)

### Variables and Memory
- Primitive-type variables store values.
- Class-type variables store addresses/references

## Parameters of Methods in Java
- In Java, all method parameters are call-by-value.
- A method parameter is a local variable that is set equal to the value of the variable being passed in.
- For a primitive type, any change to the value of the local parameter cannot change the value of the variable being passed in.

### Example:
- When a method’s parameter is a primitive type:
  ```java
  public void setMileage(double iniMileage){
    mileage = iniMileage;
    iniMileage = 100.0;
  }
  ```
  If invoked by:
  ```java
  double myMileage = 50.0;
  car1.setMileage(myMileage);
  ```
  The value of `myMileage` will still be `50.0` after invoking `car1.setMileage(myMileage)`.

### When a Parameter is a Class Type
```java
public boolean equals(BankAccount otherAccount){
  otherAccount.setOwner("Mr. Change");
}
```
Invoked by:
```java
BankAccount accnt1 = new BankAccount("Mr. Simpson",100.0);
BankAccount accnt2 = new BankAccount("Bart",200.0);
Boolean bSameAccount = accnt1.equals(accnt2);
```
Now, the value of `owner` in `accnt2` will be "Mr. Change".

## Let’s develop an example of designing classes…
### Designing the Date Class
- See also Chapter 4 of the textbook.
- Uploaded code available on OnQ.

### Designing the Person Class
- See also Chapter 5 of the textbook.
- Uploaded code available on OnQ.

## Designing a Person Class: Instance Variables
- A simple Person class could contain instance variables representing a person's name, the date of birth, and the date of death.
- These instance variables would all be class types: name of type String, and two dates of type Date.
- Each instance variable would be declared private.
```java
public class Person {
  private String name;
  private Date born;
  private Date died;
  ...
}
```

## Designing a Person Class: Constructor
- A person must have at least a name and a birth date.
- A person who is still alive does not have a date of death.
- The constructor needs to handle a null value for the date of death.
```java
public Person(String initialName, Date birthDate, Date deathDate){
  if (consistent(birthDate, deathDate)){ 
    name = initialName; 
    born = new Date(birthDate); 
    if (deathDate == null)
      died = null;
    else
      died = new Date(deathDate);
  } else { 
    System.out.println("Inconsistent dates.");
    System.exit(0);
  }
}
```

## Designing a Person Class: the Class Invariant
- A statement that is always true for every object of the class.
- For the Person class, the following should always be true:
  - A Person object has a date of birth (not null), and if it has a date of death, then the date of death is equal to or later than the date of birth.
```java
/**
 * Class invariant: A Person always has a date of birth, and if the Person has a date of death, 
 * then the date of death is equal to or later than the date of birth. To be consistent, 
 * birthDate must not be null. If there is no date of death (deathDate == null), 
 * that is consistent with any birthDate. Otherwise, the birthDate must come before or be equal to the deathDate.
 */
private static boolean consistent(Date birthDate, Date deathDate) {
  if (birthDate == null)  
    return false; 
  else if (deathDate == null)  
    return true;
  else  
    return (birthDate.precedes(deathDate) || birthDate.equals(deathDate));
}
```

## Designing a Person Class: the `equals` Method
```java
public boolean equals(Person otherPerson) {
  if (otherPerson == null)
    return false;
  else
    return (name.equals(otherPerson.name) && born.equals(otherPerson.born) && datesMatch(died, otherPerson.died));
}
```

## Designing a Person Class: the `equals` and `datesMatch` Methods
- `equals` includes invocations of `equals` for `String` and `Date`.
- Java determines which `equals` method is being invoked based on the type of its calling object.
- `died` instance variables are compared using the `datesMatch` method to handle null values properly.
```java
private static boolean datesMatch(Date date1, Date date2) {
  if (date1 == null)
    return (date2 == null);
  else if (date2 == null)
    return false;
  else
    return(date1.equals(date2));
}
```

## Designing a Person Class: the `toString` Method
- Similar to `equals`, `toString` includes invocations of `toString` for `Date`.
```java
public String toString( ) {
  String diedString; 
  if (died == null)
    diedString = ""; //Empty string
  else
    diedString = died.toString( );
  return (name + ", " + born + "-" + diedString); 
}
```

## Pitfall: Privacy Leaks
- An incorrect definition of a constructor can result in a privacy leak.
- The problem can also occur with incorrectly defined mutator or accessor methods.
```java
public Date getBirthDate() {
  return born;  //dangerous
}
```
Instead of:
```java
public Date getBirthDate() {
  return new Date(born);  //correct
}
```
- Although it appears the same as some of the previous examples, it is not:  
  - The class String contains no mutator methods that can change any of the data in a String object.
- A class that contains no methods (other than constructors) that change any of the data in an object of the class is called an immutable class.
  - Objects of such a class are called immutable objects.
- It is perfectly safe to return a reference to an immutable object because the object cannot be changed in any way.
  - For example, the String class is an immutable class.
- A class that contains public mutator methods or other public methods that can change the data in its objects is called a mutable class, and its objects are called mutable objects.
  - Never write a method that returns a mutable object. 
- Instead, use a copy constructor to return a reference to a completely independent copy of the mutable object.


# ELEC279 Introduction to Objected Oriented Programming
### Misc. of Java programming basics, Immutable classes & deep copy Java packages

## Mutable/Immutable Classes & Deep Copy
### Privacy Leaks
- The previously illustrated examples from the Person class show how an incorrect definition of a constructor can result in a privacy leak.
- The problem can occur with incorrectly defined mutator or accessor methods.

### Mutable and Immutable Classes
- A class that contains public mutator methods or other public methods that can change the data in its objects is called a mutable class, and its objects are called mutable objects.
  - Never write a method that returns a mutable object.
  - Instead, use a copy constructor to return a reference to a completely independent copy of the mutable object.

### Deep Copy Versus Shallow Copy
- A deep copy of an object is a copy that (with one exception) has no references in common with the original.
  - Exception: References to immutable objects are allowed to be shared.
- Any copy that is not a deep copy is called a shallow copy.
  - Shallow copies can cause dangerous privacy leaks in a program.

## Java Packages
### The package Statement
- To make a package, group all the classes together into a single directory (folder), and add the following package statement to the beginning of each class file:
  ```java
  package package_name;
  ```

### Package Names and Directories
- A package name is the path name for the directory or subdirectories that contain the package classes.
- Java needs two things to find the directory for a package: the name of the package and the value of the CLASSPATH variable.

### Specifying a Class Path When You Compile
- The class path can be manually specified when a class is compiled.
  - Just add –classpath followed by the desired class path.
  - This will compile the class, overriding any previous CLASSPATH setting.
- You should use the –classpath option again when the class is run.

### Import Statements
- A package can be used in other program that includes an import statement that names the package.
  ```java
  import java.util.Scanner;
  ```
- The import statement must be located at the beginning of the program file.
- Only blank lines, comments, and package statements may precede it.
  - If there are both import and package statements, the package statement must precede any import statements.
- The program can be in a different directory from the package.

### Pitfall: Subdirectories Are Not Automatically Imported
- When a package is stored in a subdirectory of the directory containing another package, importing the enclosing package does not import the subdirectory package.

### The Package java.lang
- The package java.lang contains the classes that are fundamental to Java programming.
  - It is imported automatically, so no import statement is needed.
- Classes made available by java.lang include Math, String, and the wrapper classes for the fundamental data types.
- 

# ELEC 279 Introduction to Objected Oriented Programming: Inheritance (I)

## Inheritance
- Inheritance is one of the main techniques of object-oriented programming (OOP).
  - A base class is first defined or it already exists.
    - e.g., the Employee class.
  - Then if needed, a more specialized class (i.e., a derived class) can be defined not by copying the contents of the base class, but by using the following syntax:
    ```java
    public class HourlyEmployee extends Employee {
      /**…*/
    }
    ```

## Inheritance
- A derived class automatically contains all instance variables and some methods that the base class has.
  - From the base class:
    - All instance variables (although private instance variables are not directly accessible).
    - All static variables.
    - All public methods.
  - The derived class does not inherit:
    - Any private methods.

## Inheritance
- You can add additional methods and/or instance variables to the derived class.
  - Any methods or variables that are added to the derived class are not accessible from the base class.
- Inheritance allows code to be reused without explicitly copying it into the definitions of the derived classes.
  - It allows existing, well-tested code to be accessed without having to “cut and paste” (and possibly introduce errors).
  - It allows similar (but not identical) classes to be designed in a way that groups functionality hierarchically.

## Derived Classes
- The class HourlyEmployee inherits from the class Employee:
  - the public methods `getName`, `getHireDate`, `setName`, and `setHireDate`.
- Any object of the class HourlyEmployee can invoke one of these public methods and can access any instance variables.
- The class HourlyEmployee does not inherit from the class Employee:
  - The private instance variables `name` and `hireDate`.
- HourlyEmployee does not have direct access to these instance variables, but they can still be accessed through getter and setter methods.
  
## More Terminology
- A derived class is also called a subclass (or a parent class).
- A base class is also called a superclass (or a child class).
- These relationships are often extended such that a class that is a parent of a parent... of another class is called an ancestor class.
  - If class A is an ancestor of class C, then class C can be called a descendent of class A.

## Inheritance
- When designing certain classes, there is often a natural hierarchy for grouping them, depending on the semantics of your problems/tasks.
  - In a record-keeping program for the employees of a company, there are hourly employees and salaried employees.
  - Hourly employees and salaried employees can be further divided depending on your need.
- Sometimes, you redesign your class hierarchy to reflect the change of the problems you have to solve.

## The super Constructor
- A derived class uses a constructor from the base class to initialize all the data inherited from the base class.
  - In order to invoke a constructor from the base class, it uses a special syntax:
    ```java
    public derivedClass(int p1, int p2, double p3) {
      super(p1, p2);
      this.p3 = p3;
    }
    ```

## Constructors in Derived Classes
[Diagram: Constructors in Derived Classes]

## The super Constructor
- A call to the base class constructor should use the keyword `super` instead of the name of the base class.
- A call to `super` must always be the first action taken in a constructor definition.

## The super Constructor
- If a derived class constructor does not include an invocation of `super`, then the no-argument constructor of the base class will automatically be invoked.
  - This can result in an error if the base class has not defined a no-argument constructor.
- Since the inherited instance variables should be initialized, and the base class constructor is designed to do that, then an explicit call to `super` should always be used.

## The this Constructor
- Within the definition of a constructor for a class, `this` can be used as a name for invoking another constructor in the same class.
  - The same restrictions on how to use a call to `super` apply to the `this` constructor.
- If it is necessary to include a call to both `super` and `this`, the call using `this` must be made first, and then the constructor that is called must call `super` as its first action.

## The this Constructor
- Often, a no-argument constructor uses `this` to invoke an explicit-value constructor.
  ```java
  public HourlyEmployee() {
    this("No name", new Date(), 0, 0);
  }
  ```
- The above constructor will cause the constructor with the following heading to be invoked:
  ```java
  public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours)
  ```

## The Class Object
- In Java, every class is a descendant of the class Object.
  - Every class therefore has Object as its ancestor.
- If a class is not explicitly a derived class of another class, it is still automatically a descendant class of the class Object.
- The class Object is in the package java.lang which is always imported automatically.

# ELEC 279 Introduction to Objected Oriented Programming: Inheritance (II)

### Method Definition in Derived Class
- Remember that a derived class automatically inherits some methods from the base class.
  - Only public base class methods are inherited 
- From a public base class
- In addition, you can add more methods in a derived class, which typically belong to one three scenarios
  - **Scenario 1:** you can add into the derived class a method that has a different name from all methods in the base class or ancestor classes.
### Method Definition in Derived Class
  - **Scenario 2:** you can add a method to a derived class that “overloads” a method in the base class or in ancestor classes.
    - The method has the same name as that of a method in the base or ancestor classes
  - but has a different signature (ordered list of parameter types)
    - When the derived class overloads the base class method, it still inherits the original method from the base class as well

### Method Definition in Derived Class
  - **Scenario 3:** How about if the derived class method signature (method name and ordered list of parameter types) is exactly the same as that of a method in the base or in an ancestor class?
    - We know methods with the same signature are not allowed in the same class. 
  - But it is allowed when one method is in the derived class and another method in the base (or ancestor) class have same signature and return type!!
    - This is called overriding

### Overriding vs. Overloading
- Do not confuse overriding a method in a derived class with overloading a method name
- When a method is overridden, the new method definition given in the derived class has the exact same signature (i.e. method name, and number and types and order of parameters) as in the base class
- When a method in a derived class has a different signature from the method in the base class, then that method is overloaded
  - Note that when the derived class overloads the original (base class) method, it still inherits the original method from the base class as well

### Changing the Return Type of an Overridden Method
- In old versions of Java, the name, parameter types, and return type of an overriding (derived class) method have to be exactly the same as those of the overridden (base class) method. 
  - An overriding method is said to be invariant with respect to parameter types and return type.
- However, starting from Java 5.0, it is allowed that the overriding and overridden methods have same signature but different return types, if:
  1. the return types are class types, and
  2. the return type of the overriding method in the derived class is a descendent class of the return type of the overridden method in the base/ancestor class
    - this is known as a covariant return type
#### Covariant Return Type
```java
class ShapeFactory { public Shape newShape() {return new Shape();} }
class CircleFactory extends ShapeFactory { public Circle newShape() {return new Circle();} }
```
  - Note that this is legal if
    - CircleFactory is a decedent class of ShapeFactory (which is true), and,
    - Circle is a descendent class of Shape.

### Changing the Access Permission of an Overridden Method
- The access permission of an overridden method can be changed from private in the base class to public in the derived class
- However, the access permission of an overridden method cannot be changed from public in the base class to private in the derived class
  - You can be more transparent than your ancestors were, but you can’t hide your past!

#### The final Modifier
- If the modifier final is placed before the definition of a method, then that method cannot be overridden in a derived class.
  - You can still use that final method in the derived class as it is still inherited.
- If the modifier final is placed before the definition of a class, then that class cannot be used as a base class to derive other classes

### An Object of a Derived Class Has More than One Type
- An object of a derived class has the type of the derived class, and it also has the type of the base class
- More generally, an object of a derived class has the type of every one of its ancestor classes
  - Therefore, a derived class object can be used anyplace that an object of any of its ancestor types can be used

## The Class Object
- Since every class is a descendent class of Object, a parameter of type 
Object can be replaced by an object of any class whatsoever
  - For example, some methods accept an argument of type Object so they can be used with an argument that is an object of any class
    - Let’s see a familiar example in the next slide…

### An Object of a Derived Class Has More than One Type
- System.out.println(…)
  - We have called this method and passed many different types of objects as parameters. We can do this because every class in Java is a descendent class of the predefined Object class, and println(…) is defined with the parameter Object.
```java
public void println(Object theObject){
  System.out.println(theObject.toString());
}
```

### An Object of a Derived Class Has More than One Type
- Note, however, that this relationship does not go the other way
  - An ancestor type can not be used in place of one of its derived types.

## Instance Variables in Inheritance
### Use of Private Instance Variables from the Base Class
- An instance variable that is private in a base class is not accessible by name in the definition of a method in any other classes, not even in a method definition of a derived class
  - It is inherited, but it is not directly accessible by the derived class
  - For example, an object of the HourlyEmployee class cannot access the private instance variable hireDate by name, even though it is inherited from the Employee base class. (See an example in toString in HourlyEmployee)
- Instead, a private instance variable of the base class can only be accessed by the public accessor and mutator methods defined in that class
  - An object of the HourlyEmployee class can use the getHireDate or setHireDate methods to access hireDate

### Use of Private Instance Variables from the Base Class
- Why aren’t private instance variables of base classes accessible in derived classes?
  - If private instance variables of a base class were accessible in method definitions of a derived class,
    - then anytime someone wants to access a private instance variable, they would only need to create a derived class,
    - and access it in a method of that class.
 
# ELEC 279 Introduction to Objected Oriented Programming: Inheritance (III)

## An Object of a Derived Class Has More than One Type
- System.out.println(…)
  - We have called this method and passed many different types of objects as parameters. We can do this because every class in Java is a descendent class of the predefined Object class, and println(…) is defined with the parameter Object.
```java
public void println(Object theObject){
  System.out.println(theObject.toString());
}
```

- Note, however, that this relationship does not go the other way
  - An ancestor type can not be used in place of one of its derived types.

## Instance Variables in Inheritance
### Use of Private Instance Variables from the Base Class
- An instance variable that is private in a base class is not accessible by name in the definition of a method in any other classes
  - not even in a method definition of a derived class
  - For example, an object of the HourlyEmployee class cannot access the private instance variable hireDate by name, even though it is inherited from the Employee base class. (See an example in toString in HourlyEmployee)
- Instead, a private instance variable of the base class can only be accessed by the public accessor and mutator methods defined in that class
  - An object of the HourlyEmployee class can use the getHireDate or setHireDate methods to access hireDate

### Use of Private Instance Variables from the Base Class
- If private instance variables of a class were accessible in method definitions of a derived class, then anytime someone wants to access a private instance variable, they would only need to create a derived class, and access it in a method of that class
  - This would allow private instance variables to be changed by mistake or in inappropriate ways (for example, by not using the base type's accessor and mutator methods only)
  - And the behavior of the originally defined base class is therefore not obeyed, which is not good.

## Protected and Package Access
### Protected Modifier
- If a method or instance variable is modified by protected (rather than public or private), then it can be accessed by name
  - Inside its own class definition 
  - Inside any class derived from it
  - In the definition of any class in the same package
- Show an example of modifying instance variables from private to protected in Employee, then the variable is accessible in toString() by name in HourlyEmployee.
- Show an example of modifying instance variables from private to protected in HourlyEmployee, then you can access it in InheritanceDemo

### Protected Modifier
- If a method or instance variable is modified by protected (rather than public or private), then it can be accessed by name
  - Inside its own class definition 
  - Inside any class derived from it
  - In the definition of any class in the same package
- The protected modifier provides very weak protection compared to the private modifier
  - It allows a direct access to any programmer who defines a suitable derived class
  - Therefore, instance variables should normally not be marked protected

### Package Access
- What if we do not use any of private, protected, and public modifiers for an instance variable or a method?
- An instance variable or method definition that is not preceded with a modifier has package access
  - Package access is also known as default or friendly access
- Instance variables or methods having package access can be accessed by name inside the definition of any class in the same package
  - However, neither can be accessed outside the package

### Package Access
- Note that package access is more restricted than protected
  - Package access gives more control to the programmer defining the classes

## Access Levels by Name

## Several More Topics on Classes and Inheritance
### Topic 1: “Is a” Versus “Has a”
- A derived class demonstrates an "is a" relationship between it and its base class
  - Forming an "is a" relationship is one way to make a more complex class out of a simpler class
    - For example, an HourlyEmployee "is an" Employee
  - HourlyEmployee is a more complex class compared to the more general Employee class
- Another way to make a more complex class out of a simpler class is through a "has a" relationship
  - The Employee class contains an instance variable, hireDate, of the class Date, so therefore, an Employee "has a" Date
- Both kinds of relationships are commonly used to create complex classes, often within the same class
  - Since HourlyEmployee is a derived class of Employee, and contains an instance variable of class Date, then HourlyEmployee "is an" Employee and "has a" Date
  - Show an example B.java in which class B “is an” type A, and class B “has a” instance variable of type A.

### Topic 2: Revisit Copy Constructor
#### Revisit Copy Constructors
- Example of copy class in Date.java 
```java
public Date(Date aDate){ 
  month = aDate.month; 
  day = aDate.day; 
  year = aDate.year;
}
```

#### Revisit Copy Constructors
- In a copy constructor, you can access even a private instance variable of the object being passed in as a parameter,
  - if that object is a type of the current class (which is always true for a “copy constructor” by definition).
- Why can we do this in the same class (i.e., accessing even a private variable of an object passed in by name, if that variable is a type of the current class)?
  - Since it is safe to access (even private) instance variables in the same class but that is not necessarily true in derived classes.
  - 
  
# ELEC 279 Introduction to Objected Oriented Programming: Inheritance (IV)

### Topic 3: More Discussion on Overridden Methods

- **More Discussion on Overridden Methods**:
  - Clarified that using an object of a derived class, there is no way to invoke the base class version of an overridden method.
  - However, within the definition of a derived class, the base class version of an overridden method of the base class can still be invoked by prefacing the method name with `super` (and a dot).
  - Provided an example of how `toString()` is defined in `HourlyEmployee`.

- **Super Keyword Usage**:
  - Emphasized that it is only valid to use `super` to invoke a method from a direct parent; repeating `super` will not invoke a method from some other ancestor class.
  - Highlighted that violating this principle can lead to encapsulation violations.

### Topic 4: Implement the Equals Methods

- **Introduction**:
  - Discussed the importance of implementing `toString` and `equals` methods in defined classes.
  - Introduced the concept of overloading `equals` in a derived class.

- **The Right Way to Define Equals**:
  - Stressed that `equals` method should be overridden, not just overloaded, to ensure consistency.
  - Provided a better method for the class `Employee` and explained the conditions it must meet.

- **Usage of getClass() and instanceof**:
  - Compared the usage of `getClass()` and `instanceof` in defining `equals`.
  - Highlighted the potential inconsistencies when `instanceof` is used.

- **The Issue of Using instanceof to Define Equals**:
  - Illustrated the problem with using `instanceof` through a code example.
  - Emphasized that the `equals` operator should be commutative for consistency.
  - 
  
# ELEC 279 Introduction to Objected Oriented Programming: Unified Modelling Language, Programing Errors, Javadoc

## Designing Tools for Programming

- **Pseudocode**:
  - A way of representing a program in a linear and algebraic manner, simplifying design by eliminating programming language syntax details.
- **Graphical representation systems**:
  - Flowcharts and structure diagrams used in program design.
- **Unified Modeling Language (UML)**:
  - Graphical representation formalism designed to reflect the OOP philosophy.
  - Used for designing and documenting OOP software.

### UML Class Diagram

- Classes are central to OOP, and the class diagram is the easiest of the UML graphical representations to understand and use.
- Divided into three sections:
  - Top: Class name
  - Middle: Data (instance variables) specification
  - Bottom: Actions or methods
- Each data specification includes the access type indicated by symbols like `-` (private), `+` (public), `#` (protected), `~` (package).

### Class Interactions

- Class diagrams primarily show interactions among classes rather than just the interface of a class.

### Inheritance Diagrams

- Shows the relationship between a base class and its derived class(es).
- Each base class is drawn above its derived class(es) with an upward pointing arrow indicating the inheritance relationship.

### History of UML

- Developed in 1996 by Brady Booch, Ivar Jacobson, and James Rumbaugh to produce a standardized graphical representation language for object-oriented design and documentation.
- Maintained and certified by the Object Management Group (OMG).

## Javadoc: Introduction to javadoc

- **Unlike C and C++, Java** places both the interface and the implementation of a class in the same file.
- **Javadoc** automatically extracts the interface from a class definition and produces documentation in HTML format.
- Commenting rules and usage for generating Javadoc documentation explained.

### Commenting for javadoc

- Javadoc extracts class headings, some comments, and headings for all public methods, instance variables, and static variables.
- Commenting rules and @tags usage explained.

### Running Javadoc

- Instructions provided for running Javadoc in Eclipse and from the command line.

## Programming Errors

### Three Types of Programming Errors

- **Syntax Errors**:
  - Detected by the compiler.
- **Runtime Errors**:
  - Causes the program to abort.
- **Logic Errors**:
  - Produces incorrect results.

### Debugging

- Logic errors are called bugs, and the process of finding and correcting errors is called debugging.
- Common debugging methods and the use of a debugger utility explained.
- 

# ELEC 279 Introduction to Objected Oriented Programming: Polymorphism, Early and Late Binding

## Today: Polymorphism

### Introduction to Polymorphism

- Object-oriented programming (OOP) comprises three main mechanisms: Encapsulation, Inheritance, and Polymorphism.
- Polymorphism is the focus today:
  - In Greek: "poly" = many, "morph" = shape.

### The Sale DiscountSale Classes

- **DiscountSale extends Sale**
- `Sale` class `lessThan()` method:
  ```java
  public boolean lessThan(Sale otherSale) {
    return (bill() < otherSale.bill());
  }
  ```
- Both `Sale` and `DiscountSale` classes have a `bill()` method.

### Binding

- **Binding**:
  - The process of associating a method definition with a method invocation.
- **Early binding**:
  - Associated at compile time.
- **Late binding** (Dynamic binding):
  - Associated at runtime.

### Polymorphism

- Essentially synonymous with late binding.
- Allows changes in method definitions in derived classes to apply to software written for the base class.

### Early/Static Binding

- Decision made at compile time.
- Java uses early/static binding with private, final, and static methods.

### Example: Late Binding with toString

- Run LateBindingDemo code to demonstrate late binding.
- Late binding demonstrated with `showAdvertisementA()` method.

### No Late Binding for Static Methods

- Static methods invoked directly using class name.
- Static methods demonstrate early/static binding.
- Example provided with `announcement()` method in `Sale` and `DiscountSale` classes.
- 

# ELEC 279 Introduction to Objected Oriented Programming: Assignment 1 - Upcasting & Downcasting

### Late Binding

- **Sale and DiscountSale classes** example.
- Example with **toString** method.

### Early (Static) Binding

- Decision made at compile time.
- Java uses early/static binding with private, final, and static methods.
- Demo illustrating early binding with private method in Sale class.

### No Late Binding for Static Methods

- Example provided with `announcement()` method in `Sale` and `DiscountSale` classes.

## Upcasting and Downcasting

### Upcasting

- Happens when an object of a derived class is assigned to a variable of a base class.
- Example: `Sale simpleItem = discountItem;`

### Downcasting

- Type cast from a base class to a derived class.
- Should be done carefully.
- Example provided with `equals` method in `Employee` class.

### Upcasting/Downcasting and Binding

- Demo showing upcasting and downcasting with `UpDownCastingDemo`.
- Behavior of overridden static methods and late-binding methods discussed.
- 

# ELEC 279 Introduction to Objected Oriented Programming: Abstract Classes and Methods

## Today: Abstract Classes

- In some situations, method definition is postponed to a derived class.
- Example with `samePay` method in `Employee` class.

### Abstract Methods

- Abstract method is declared with `abstract` modifier.
- It has a complete method heading but no method body.
- Abstract class contains at least one abstract method.
- Cannot create instances of an abstract class.

### Abstract Class

- Abstract class must include `abstract` in its heading.
- Derived classes must implement all abstract methods.
- A class with no abstract methods is a concrete class.

### Usage of Abstract Class

- Cannot create instances of an abstract class.
- Can use an abstract class type for variables and method parameters.
- Example demonstrated in `AbstractClassDemo`.

# ELEC 279: Introduction to Objected Oriented Programming - The Clone Methods Interface (I)

## The Clone Method and Interfaces

### The Clone Method:
- **Overview:** The clone method, inherited from the `Object` class, is designed to return a deep copy of the calling object. However, its inherited version is not directly usable and should be overridden for appropriateness.
- **Method Overriding:**
  - Access level can change to more permissive (e.g., from protected to public).
  - Return type can change to the class's type being cloned, utilizing covariant return types.

### Prior to Java 5.0:
- The clone method could only return `Object` as its return type, necessitating type-casting (downcasting) to the specific class type when used.

### Clone Method vs. Copy Constructor:
- While both appear to serve the same function, there are scenarios where only the clone method is appropriate.
- **Example:** If an array contains objects of a derived class (e.g., `DiscountSale`), the copy constructor would only return a plain `Sale` object, not a true copy.

### Interfaces:
- An interface in Java is akin to an extreme case of an abstract class, specifying a set of methods that any implementing class must have.
- Interfaces contain only method headings and constant definitions, no instance variables or complete method definitions.

### Implementing an Interface:
- A class implements an interface by declaring `implements Interface_Name` and must define all methods listed in the interface.
- Interfaces allow for a type of multiple inheritance in Java, where a class can satisfy multiple interfaces.

### Interfaces in Java:
- All method headings and the interface itself should be declared public.
- A method can have a parameter of an interface type, accepting any class that implements the interface as an argument.

# ELEC 279: Introduction to Objected Oriented Programming - Interface (II)

## Interfaces in Java: `Comparable` and `Cloneable`

### Overview
After discussing abstract methods, clone methods, and the basics of interfaces, this lecture delves into two critical Java interfaces: `Comparable` and `Cloneable`.

### The `Comparable` Interface
- Part of the `java.lang` package, automatically available to any Java program.
- Contains a single method `compareTo(Object other)` that must be implemented.
- **Semantics:**
  - `compareTo` returns a negative number if the calling object "comes before" the parameter.
  - Returns zero if the objects are considered equal.
  - Returns a positive number if the calling object "comes after" the parameter.
- **Usage:** Enables sorting and ordering of objects. Classes like `Double` and `String` implement `Comparable`, allowing comparisons between instances.

### The `Cloneable` Interface
- A tag interface (no methods or constants) indicating how the `clone` method inherited from `Object` should be redefined.
- Essential for making deep copies of objects, particularly when they contain mutable instance variables.
- **Implementation Strategies:**
  - **Simple Case:** If an object only contains primitive data or immutable objects, a bit-by-bit copy (shallow copy) is adequate.
  - **Complex Case:** For objects with mutable class types as instance variables, a deeper copy is necessary to prevent privacy leaks. This involves explicitly cloning mutable instance variables.

### Implementing `Cloneable` Interface
- A class implementing `Cloneable` needs to override the `clone` method to ensure a proper deep copy is made.
- **Process:**
  - Invoke `super.clone()` to create a shallow copy.
  - Manually clone mutable instance variables to ensure deep copying.

### Key Points
- The `Comparable` interface allows for defining a natural ordering of objects, making them sortable.
- The `Cloneable` interface facilitates object cloning, crucial for creating independent object copies in Java.
- Implementing these interfaces requires careful consideration of their semantics and the specific needs of your class.

# ELEC 279: Introduction to Objected Oriented Programming - Interface (III)

## Advanced Topics in Interfaces

### Overview
Building on prior discussions about defining and implementing interfaces, this lecture explores more advanced topics, including the `Comparable` interface, the `Cloneable` interface, constants in interfaces, inconsistent interfaces, extending interfaces, and differences between interfaces and abstract classes.

### The `Comparable` Interface
- Concrete classes implementing `Comparable` must define the `compareTo` method.
- `compareTo` establishes a total ordering for lists of objects, intuitive for classes like `Double` and `String`.
- Custom `compareTo` definitions can compare objects based on specific attributes, e.g., employee names, hire dates, or salaries.

### The `Cloneable` Interface
- Discussed as a Java predefined interface with no methods or constants, used as a tag to indicate how the `clone` method should be overridden.

### Constants in Interfaces
- Interfaces can include constants but not regular instance variables.
- Classes implementing the interface have access to these constants.
- Java often uses enum types for similar purposes, but interfaces offer unique advantages.

### Inconsistent Interfaces
- A single class may implement multiple interfaces, leading to potential inconsistencies, such as overlapping constant names or methods with the same name but different return types.

### Extending Interfaces
- Interfaces can be extended, creating "sub-interfaces."
- A concrete class implementing a derived interface must provide definitions for methods in both the derived and base interfaces.

### Differences Between Interfaces and Abstract Classes
- Interfaces support a form of multiple inheritance and cannot contain data members or constructors, while abstract classes can contain incomplete methods and method definitions.

### Key Points
- The `Comparable` and `Cloneable` interfaces are crucial for defining natural ordering and cloning mechanisms in Java objects.
- Constants in interfaces and the possibility of extending interfaces provide flexibility in defining class behaviors.
- The choice between using interfaces or abstract classes depends on the specific needs of the application and whether multiple inheritance is required.

# ELEC 279: Introduction to Objected Oriented Programming - Exception Handling

## Core Concepts of Exception Handling in Java

### Introduction to Exception Handling
- Java uses `try`, `catch`, and `finally` keywords for exception handling.
- Exception handling is essential for managing runtime errors, allowing the program to continue or terminate gracefully.

### Types of Programming Errors
- **Compilation Errors:** Issues found during the compilation process.
- **Runtime Errors:** Problems that occur while the program is running.
- **Logic Errors:** Errors in the program's logic that produce incorrect results.

### Exception Handling Mechanism
- Exception handling is designed to prepare for and manage the occurrence of exceptional conditions during program execution.

### The `try-throw-catch` Mechanism
- **`try` Block:** Contains code that might throw an exception. Execution continues with the `catch` block if an exception occurs.
- **`catch` Block:** Handles exceptions thrown by the `try` block. It acts similarly to a method definition with a parameter of type `Exception`.

### The `catch` Block
- Functions as an exception handler, with the parameter specifying the type of exception it can catch.

### Exception Classes
- Java has a hierarchy of exception classes, with `Exception` being the root. These include both Java-predefined and programmer-defined exception classes.

### Defining Exception Classes
- Exception classes must be derived from an existing exception class. Constructors are crucial for defining how the exception is handled.

### Multiple `catch` Blocks
- Multiple `catch` blocks can be used to handle different types of exceptions thrown within a `try` block.

### Order of `catch` Blocks
- The more specific exceptions should be caught first, as Java will match exceptions to `catch` blocks from top to bottom.

### The `finally` Block
- Executes code regardless of whether an exception was thrown or caught, ensuring that certain cleanup actions are always performed.

### Cases for `finally` Block Execution
- **Case 1:** No exception is thrown; the `finally` block executes after the `try` block.
- **Case 2:** An exception is thrown and caught; the `finally` block executes after the `catch` block.
- **Case 3:** An exception is thrown but not caught; the `finally` block still executes, but the code after it does not.

### Key Takeaways
- Exception handling in Java is a robust mechanism for managing errors and ensuring that your program can handle unexpected situations gracefully.
![Screenshot 2024-03-24 at 4 01 10 PM](https://github.com/IsaiahIruoha/object-oriented-programming/assets/76797894/337adbdf-c046-46c6-8c00-ec9944ce3c2f)


- # ELEC 279: Introduction to Objected Oriented Programming - Exception Handling, Inner Classes

## Advanced Topics: Exception Handling and Inner Classes

### Recap of Last Lecture on Exception Handling
- Introduction to the `try-throw-catch` trio for managing exceptions.
- Emphasis on defining custom exception classes and using multiple `catch` blocks.
- The importance of catching more specific exceptions first and utilizing the `finally` block.

### Exception Handling Continued
- Throwing exceptions within methods without immediate catching, necessitating a `throws` clause in the method signature.
- The "catch or declare rule" and its implications for method design.
- Discussion on unchecked versus checked exceptions, including `ArrayIndexOutOfBoundsException` and custom exception classes.

### Introduction to Inner Classes
- Explanation of inner classes as classes defined within other classes.
- Reasons for using inner classes, including encapsulation benefits and access to the outer class's private members.
- Examples of simple uses of inner classes, such as defining a `Money` class within a `BankAccount` class.

### Detailed Discussion on Inner Classes
- The ability of inner and outer classes to access each other's private members.
- The implications of public versus private inner classes.
- How to reference and instantiate inner classes from outside the outer class.
- Special considerations for static inner classes and the syntax for invoking methods or accessing variables of static inner classes.

### Nested Inner Classes and Inheritance Implications
- Legality and practicality of nesting inner classes.
- How derived classes of an outer class inherit inner classes, affecting object instantiation and method invocation.

### Key Takeaways
- Exception handling in Java provides a robust mechanism to deal with runtime errors and other exceptional conditions.
- Inner classes offer a powerful tool for encapsulation and can significantly enhance the organization and modularity of Java code.

- # W09L1_ELEC279_2024: Android Programming

## Objective
- Introduction to Android programming.
- Setting up the development environment.
- Testing and running Android programs.

## Introduction to Android
- Android is an OS for mobile devices like smartphones, watches, tablets, and TVs.
- Written in Java and C++; it's UNIX-like with a Linux Kernel.
- Developed and maintained by Google and the Open Handset Alliance.
- Uses Java for programming and XML for GUI styling.

## Some Statistics
- Android has been leading the mobile OS market globally since the first quarter of 2011.

## Android Versions
- First released in 2008, versions have unique names like Pie (9.0), Oreo (8.0), Nougat (7.0), and Marshmallow (6.0).

## Android Architecture and App Components
- **Activities:** Manage UI for a single screen.
- **Services:** Handle background tasks.
- **BroadcastReceivers:** React to system-wide broadcast announcements.
- **ContentProviders:** Manage a shared set of app data.

## Activity Lifecycle
- Activities have lifecycle callback methods to manage their state and behavior.
- Callback methods include `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, and `onDestroy()`.

## Getting Started with Android Development
- Install Java Development Kit (JDK) and Android Studio.
- Set up a physical device for testing in developer mode or use an Android Emulator.

## Android Studio and Emulator
- Android Studio is the official IDE for Android development.
- The built-in emulator allows testing on virtual devices.

## Android Development Process
1. Setup development environment (JDK and Android Studio).
2. Set device to developer mode for testing.
3. Create a new project.
4. Test the app on an emulator or physical device.

## Android Project Example
- Steps to create a new Android project and configure it, including setting the language to Java and creating a device emulator.

## Android App Testing
- Running and testing your first Android app on an emulator or a physical device.

## Conclusion
This introduction to Android programming covers the basics of setting up the environment, understanding the core components of Android apps, and the lifecycle of activities. It provides the foundation needed to begin developing Android applications.

# W09L3_ELEC279_2024: Generics

## Overview

Following lectures on Android programming basics and inner classes, this lecture introduces Generics in Java, illustrating how they enhance code reusability and type safety.

### Recap of Previous Lectures
- Basics of Android programming, focusing on UI components like TextViews and Buttons.
- Introduction to inner classes as classes defined within other classes, with examples and explanations on invoking methods of the outer class from an inner class, and vice versa.

### Introduction to Generics
- Generics provide a way to introduce type parameters to classes, interfaces, and methods, enabling code reuse across different data types.

### The ArrayList Class
- Discussion on the `ArrayList` class as an example of Generics in Java.
- Unlike arrays, `ArrayList` can dynamically resize, offering more flexibility and convenience through various methods.

### Defining and Using Generics
- Explanation of how to define and use Generics with the `ArrayList` class, including type parameters and the benefits of type safety and avoiding casting.

### Generic Methods and Classes
- Introduction to defining generic methods and classes, including constructors and the usage of type parameters.

### Key Concepts in Generics
- **Type Parameter:** A symbol that can be replaced by any reference type to create a parameterized type.
- **Parameterized Class:** A class that includes one or more type parameters.

### Using Generics with Custom Classes
- Examples of creating and using custom generic classes, such as an `OrderedPair` class that holds pairs of objects of any type.
- Illustration of constraints with Generics, such as the inability to create instances of a type parameter directly with `new T()`.

### Generics and Collections
- Generics are extensively used in Java Collections Framework to ensure type safety and reduce runtime errors.
- The introduction of the `for-each` loop in Java 5, designed for cycling through Collections like `ArrayList`.

### Pitfalls and Considerations
- Discussion on the limitations and considerations when working with Generics, such as the prohibition of primitive types as type parameters and the rules for defining generic constructors.

## Conclusion
Generics in Java allow for the creation of flexible, reusable, and type-safe classes, interfaces, and methods. This lecture covers the basics of Generics, their application in collections like `ArrayList`, and the construction of custom generic classes.

# W10L1_ELEC279_2024: Generics

## Advanced Concepts in Generics

### Bounded Type Parameters
- Generics can have restrictions or bounds on the type parameters to ensure only specific types can be used.
- Syntax: `public class MyClass<T extends Comparable>` restricts `T` to types that implement `Comparable`.

### Bounded Type Parameter Example
- Example of setting bounds to ensure type safety and leverage polymorphism within generic classes.

### Bounds for Type Parameters
- Bounds can be a class or an interface. When bounded by a class, only that class or its subclasses can be used as the type parameter.

### Multiple Bounds
- A type parameter can have multiple bounds, including both classes and interfaces, using syntax like `T extends Class1 & InterfaceA & InterfaceB`.

### Generic Interfaces
- Interfaces can also be generic, similar to classes, allowing for more flexible interface definitions.

### Generic Methods
- Methods within a generic class can use the class's type parameter, and Java also supports generic methods with their own type parameters.
- Syntax for generic method declaration includes the type parameter before the return type: `public static <T> T myMethod(T[] a)`.

### Inheritance with Generic Classes
- Generic classes can inherit from both non-generic and generic classes. However, genericity does not imply polymorphism between different parameterized types of the same generic class.

### Wildcards in Generics
- Wildcards (`?`) are used when the specific type parameter is unknown or when method parameters can accept multiple types of generics.
- Wildcards can have upper bounds (`? extends SomeClass`) and lower bounds (`? super SomeClass`) to restrict the type parameter further.

### Practical Application of Generics
- Generics enhance code reusability and type safety in Java programming.
- They are particularly useful in collections, allowing for operations on collections of specific types while maintaining compile-time type safety.

### Key Takeaways
- Generics in Java provide a robust mechanism for type-safe operations on objects and collections.
- Bounded type parameters and wildcards introduce flexibility in restricting and utilizing generic types.
- Understanding generics is crucial for designing flexible and type-safe Java applications.




