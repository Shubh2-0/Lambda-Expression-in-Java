# Lambda Expressions in Java

Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.

The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.


# Why use Lambda Expression
1. To provide the implementation of Functional interface.\
2. Less coding.


# Java Lambda Expression Syntax
** (argument-list) -> {body} **


1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.


# No Parameter Syntax

() -> {  

//Body of no parameter lambda  

} 


# One Parameter Syntax

(p1) -> {  

//Body of single parameter lambda  

} 



# Two Parameter Syntax

(p1,p2) -> {  

//Body of multiple parameter lambda  

}  



<img src="https://i.ytimg.com/vi/ph-94lsHloo/maxresdefault.jpg" />
