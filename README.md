# Problem

Determine the type of a triangle when you have the lengths of the triangle's three sides as input. The 3 types of triangles are:
* Equilateral
* Isosceles
* Scalene

# Assumptions

To solve this problem I'm assuming the following things:
* `Triangle` is the base object from which the others type of triangles will extend from;
* If the `Triangle` class requirement changes it will affect the other type of triangles:
  * For instance, if we have a requirement to calculate the perimeter on all types of triangles we can implement this method in the `Triangle` class;
  * In the same way if we want to all type of triangles implement a kind of method, we only have to declare it on `Triangle` as abstract method;
* The `TriangleBuilder` is the object that deals with the construction of the type of `Triangle`. Here is decided the type of triangle. Centralizing it here is easier to control the building logic.
* There will be no other type of shapes like squares, circles, etc.
* Triangle can't be transform on other shape it will have always 3 sides.

# Usage

## Local Building and running

#### Build

```
> mvn clean package
```

##### Running jar

Run the application by

```
> java -jar target/triangle-1.0-SNAPSHOT.jar
```

and type the sides along the way

###### or

using shell command to determine the type of triangle
```
> java -jar target/triangle-1.0-SNAPSHOT.jar 10 10 10
```


## Docker

###### Build docker image
```
> docker build -t triangle-app .
```

###### Running docker image

Using shell command to determine the type of triangle
```
> docker run -it --rm triangle-app 10 10 10
```

or you can just simple run

```
> docker run -it --rm triangle-app
```

and type the sides along as they are asked for.
