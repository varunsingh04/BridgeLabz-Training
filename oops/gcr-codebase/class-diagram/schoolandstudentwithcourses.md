```
+------------------+
|     School       |
+------------------+
| - name: String   |
| - students: List<Student> |
+------------------+
| + addStudent()   |
| + getStudents()  |
+------------------+
        ◇
        | Aggregation
        |
+------------------+      <------ Association ------>    +------------------+
|     Student      |                                    |      Course      |
+------------------+                                    +------------------+
| - studentId:int  |                                    | - courseCode     |
| - name:String    |                                    | - courseName     |
| - courses: List<Course> |                             | - students: List<Student> |
+------------------+                                    +------------------+
| + enrollCourse() |                                    | + addStudent()   |
| + viewCourses()  |                                    | + viewStudents() |
+------------------+                                    +------------------+
```