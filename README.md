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
