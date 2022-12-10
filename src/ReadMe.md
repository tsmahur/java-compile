NOTE: all the command are executed from java-compile folder unless specified

### Single class : [students](/src/com/tsm/students)
- Compile the class: <br>
  `javac -d <outputDirectory> <javaFilePath>` <br>
  `-d <directory>` => Specify where to place generated class files <br>
  e.g. `javac -d out src/com/tsm/students/Student.java`

- Execute the compiled class: <br>
  Open the out folder : `cd out` <br>
  Run compiled class : `java <ClassName>` e.g. `java Student`

### Multiple  class : [student-multiple](/src/com/tsm/student-multiple)
`StudentReport` -> main class <br>
`StudentGradeCalculator`, `StudentMarksPrinter` are called in the main `StudentReport` class

- Compile all classes : <br>
  `javac -d <outputDirectory> <javaFilePath1> <javaFilePath2> <javaFilePath3>`
  <br> e.g. `javac -d out/student-multiple src/com/tsm/student-multiple/StudentReport.java src/com/tsm/student-multiple/StudentGradeCalculator.java src/com/tsm/student-multiple/StudentMarksPrinter.java`

- Execute the compiled main class: <br>
  Open the out folder :  `cd out/student-multiple` <br>
  Run compiled class : `java <mainClassName>` <br> 
  e.g. `java StudentReport`

- *Note:* Since `StudentReport` class in invoking other class, so we do not need to manually compile other classes
  - Delete the out/student-multiple folder
  - Compile :`javac -sourcepath src/com/tsm/student-multiple -d out/student-multiple src/com/tsm/student-multiple/StudentReport.java ` <br>
    `-sourcepath <pathForAlldependentFiles>`
  - Execute : <br>
    `cd out/student-multiple` <br>
    `java StudentReport`