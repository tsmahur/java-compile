NOTE: all the command are executed from java-compile folder unless specified

---
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

- *NOTE : * Since `StudentReport` class in invoking other class, so we do not need to manually compile other classes
  - Delete the out/student-multiple folder
  - Compile :`javac -sourcepath src/com/tsm/student-multiple -d out/student-multiple src/com/tsm/student-multiple/StudentReport.java` <br>
    `-sourcepath <pathForAlldependentFiles>` specifies path for dependent java files
  - Execute : <br>
    `cd out/student-multiple` <br>
    `java StudentReport`

---
### PACKAGE : [tsm_package](/src/com/tsm_package)
#### Single class : [students](/src/com/tsm_package/students)
- To structure compiled class in packaged based structure just add <br>
`package com.tsm_package.students;`
- then compile `javac -d out src/com/tsm_package/students/Student.java`
- now all the file will be in package structure under out.
- execute `cd out`, `java com.tsm_package.students.Student`

#### Multiple  class : [student-multiple](/src/com/tsm_package/student_multiple)

- To structure compiled class in packaged based structure just add <br>
  `package com.tsm_package.student_multiple;`
- then compile `javac -sourcepath src -d out src/com/tsm_package/student_multiple/StudentReport.java`
  <br>*NOTE :* here with `sourcepath` we only specified root folder not complete directory of dependent java files
- now all the file will be in package structure under out.
- execute `cd out`, `java com.tsm_package.student_multiple.StudentReport`