<div align="center">

# λ Lambda Expressions in Java

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/Lambda-Expression-in-Java?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/Lambda-Expression-in-Java/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/Lambda-Expression-in-Java?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/Lambda-Expression-in-Java/network/members)

<img src="https://miro.medium.com/max/1400/1*c8wSiQ0WcYcyQFYdgtXLLg.png" alt="Lambda" width="500"/>

### Embrace Functional Programming in Java

*Write concise, readable code with lambda expressions and functional interfaces*

</div>

---

## 🎯 About

Lambda Expressions (Java 8) provide a clear and concise way to implement functional interfaces. Write less code, achieve more!

## 📝 Syntax

```java
// No parameters
() -> System.out.println("Hello!")

// One parameter
x -> x * x

// Multiple parameters  
(x, y) -> x + y
```

## 📚 Examples

```java
// Traditional vs Lambda
Runnable r1 = new Runnable() {
    public void run() { System.out.println("Old way"); }
};

Runnable r2 = () -> System.out.println("Lambda way!");

// Collections
List<String> names = Arrays.asList("Alice", "Bob");
names.forEach(name -> System.out.println(name));
names.forEach(System.out::println); // Method reference
```

## 🔧 Functional Interfaces

| Interface | Method | Purpose |
|-----------|--------|---------|
| Consumer | accept(T) | Takes input, no output |
| Supplier | get() | No input, returns output |
| Function | apply(T) | Input to output |
| Predicate | test(T) | Returns boolean |

## 🛠️ Technologies

Java 8+ | Eclipse/IntelliJ IDE

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Java Lambda Functional-Programming Java8 Stream-API Functional-Interface
