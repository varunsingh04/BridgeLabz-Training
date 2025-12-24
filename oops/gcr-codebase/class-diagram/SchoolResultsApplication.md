```
+--------------------+
|      Student       |
+--------------------+
| - studentId : int  |
| - name : String    |
| - subjects : List<Subject> |
+--------------------+
| + addSubject(s: Subject)   |
| + getSubjects() : List<Subject> |
+--------------------+
          ◇
          | Aggregation (has)
          |
+--------------------+
|      Subject       |
+--------------------+
| - subjectCode : String |
| - subjectName : String |
| - marks : int          |
+--------------------+
| + getMarks() : int     |
+--------------------+


+-----------------------------+
|     GradeCalculator         |
+-----------------------------+
|                             |
+-----------------------------+
| + calculateTotal(s: Student) : int |
| + calculateAverage(s: Student) : double |
| + calculateGrade(s: Student) : char |
+-----------------------------+
              |
              | Uses
              ↓
           Student

```