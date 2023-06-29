# Lambda Expressions in Java () -> {}

![image](https://github.com/Shubh2-0/Lambda-Expression-in-Java/assets/112773220/3acd8e86-ca0b-42c2-8fbd-8e96fa055bf2)


## What are Lambda Expressions? 🤔

Lambda expressions were introduced in Java 8 as a way to write more concise and functional-style code. They provide a way to pass behavior as an argument to a method or constructor, without the need for creating anonymous inner classes.

Lambda expressions are especially useful when working with functional interfaces, which are interfaces that have only one abstract method. They allow you to express instances of these interfaces more compactly and enhance readability.

Java lambda expression is treated as a function, so compiler does not create .class file.
 
# Why use Lambda Expression
1. To provide the implementation of Functional interface.
2. Less coding.


# Java Lambda Expression Syntax
**(argument-list) -> {body}**


**1) Argument-list**: It can be empty or non-empty as well.

**2) Arrow-token**: It is used to link arguments-list and body of expression.

**3) Body:** It contains expressions and statements for lambda expression.


# No Parameter Syntax
```
() -> {  

//Body of no parameter lambda  

} 
```

# One Parameter Syntax
```
(p1) -> {  

//Body of single parameter lambda  

} 
```


# Two Parameter Syntax
```
(p1,p2) -> {  

//Body of multiple parameter lambda  

}  
```


<img src="https://i.ytimg.com/vi/ph-94lsHloo/maxresdefault.jpg" />

# Lambda Expression in Java

🔧 This GitHub repository contains a simple project that demonstrates the implementation of lambda expressions in Java.



## Project Structure 📁

The project in this repository showcases the usage of lambda expressions through a simple example. The code is organized as follows:

```
- Examples/
  - src/
    - com/masai/
      - LambdaExpressionDemo.java
```

📄 The `LambdaExpressionDemo.java` file contains the main class that demonstrates the implementation of lambda expressions. It includes examples of how to use lambda expressions in different scenarios, such as sorting a list and implementing functional interfaces.

## Getting Started 🚀

To run this project locally, follow these steps:

1. Clone this repository to your local machine using the following command:

   ```bash
   git clone https://github.com/Shubh2-0/Lambda-Expression-in-Java.git
   ```

2. Open the `LambdaExpressionDemo.java` file in your favorite Java IDE.

3. Compile and run the `LambdaExpressionDemo.java` file.

4. Observe the output in the console, which demonstrates the functionality and usage of lambda expressions.

## Contributing 🤝

🙌 Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1. Fork the repository.

2. Create a new branch for your feature or bug fix.

3. Make your changes and commit them.

4. Push your changes to your forked repository.

5. Submit a pull request to the original repository, describing your changes in detail.

📝 Please ensure that your contributions adhere to the code standards and guidelines followed in this project.


## Acknowledgments 🙏

I would like to acknowledge the following resources that helped in understanding and implementing lambda expressions in Java:

- Oracle's official Java documentation on lambda expressions
- Online tutorials and examples from various Java programming websites

Thank you for visiting this repository! If you have any questions or suggestions, feel free to reach out. 😊

