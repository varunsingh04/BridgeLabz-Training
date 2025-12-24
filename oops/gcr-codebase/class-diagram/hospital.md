```
+------------------+
|     Hospital     |
+------------------+
| - name: String   |
| - doctors: List<Doctor> |
| - patients: List<Patient> |
+------------------+
| + addDoctor()    |
| + addPatient()  |
+------------------+

+------------------+     <---- Association ---->    +------------------+
|      Doctor      |                               |     Patient      |
+------------------+                               +------------------+
| - doctorId:int   |                               | - patientId:int  |
| - name:String    |                               | - name:String    |
+------------------+                               +------------------+
| + consult(p: Patient) |                          | + getDetails()   |
+------------------+                               +------------------+
```