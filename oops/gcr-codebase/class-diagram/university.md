```
+----------------------+
|     University       |
+----------------------+
| - name: String       |
| - departments: List<Department> |
| - faculty: List<Faculty> |
+----------------------+
| + addDepartment()    |
| + removeUniversity() |
+----------------------+
     ⬤           ◇
     | Composition  | Aggregation
     |              |
+------------------+   +------------------+
|   Department     |   |     Faculty      |
+------------------+   +------------------+
| - deptName       |   | - facultyId      |
+------------------+   | - name            |
| + getDetails()   |   | + teach()         |
+------------------+   +------------------+
```