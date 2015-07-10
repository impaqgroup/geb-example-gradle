# Preconditions
1. Java: http://www.oracle.com/technetwork/java/javase/downloads
2. IDE, e.g.: https://www.jetbrains.com/idea/download/
3. SCM https://git-scm.com/download/win
# Usage

The following commands will launch the tests with the individual browsers:
    
    ./gradlew chromeTest
    ./gradlew firefoxTest
    ./gradlew phantomJsTest

To run with all, you can run:

    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

# References
- [Geb documentation](http://www.gebish.org/manual/current/)
- [Original example](https://github.com/geb/geb-example-gradle)
