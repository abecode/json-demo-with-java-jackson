# Example of reading JSON in Java using Jackson

this is an example of reading unstructured json (ie no schema) in Java with Jackson.

Of course you can clone this code, but to learn how to do it from scratch in VS Code follow these steps:

- First start a new project in VS Code (command palette / control shift p, create java project)
- Then add jackson-core and jackson-databind to you pom.xml file (Maven config)
  - you can do this manually by adding this code to the dependencies
  -
    ```
          <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.17.0</version>
        </dependency>

    

        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.17.0</version>
        </dependency>
    ```
  - or you can go down to the bottom of the explorer pane, find maven, open the dependencies tab,
    and then add these dependencies by clicking the plus symbol, then adding them by name
    "jackson-core" and "jackson-databind", then refreshing the dependencies (the loop/refresh icon)
- Then the code should work



## acknowledgements

- [Helpful video](https://www.youtube.com/watch?v=hn1Rgf2mEZ8) that goes over the step by step of
  adding dependencies to the `pom.xml` file and an example of reading a JSON file with a specific schema
- [Stack Overflow example](https://stackoverflow.com/questions/35837604/serialize-json-into-generic-structure-without-schema-using-java-and-jackson)
  showing how to read JSON without a specified schema
