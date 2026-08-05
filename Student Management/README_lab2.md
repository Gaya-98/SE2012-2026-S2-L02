# SE2031 Practical 2 - Student Management System

# How to Compile and Run

## Option A: Part 1 (without packages)
Run these commands from the folder containing `Main.java`:

    javac Student.java Course.java Main.java
    java Main

## Option B: Part 2 (with packages)
Run these commands from the project root (`StudentManagement/`):

    javac models/*.java services/*.java mainapp/Main.java
    java mainapp.Main

## JavaDoc Generation

    javadoc -d docs models/*.java services/*.java

Then open `docs/index.html` in a browser.
