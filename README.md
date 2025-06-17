✅ Selecting Multiple Objects using Spring JDBC
🧠 Goal:
Fetch all rows from the Student table using Spring JDBC and map them to a List<Student>.

🔧 1. Query to Fetch All
sql
Copy code
SELECT * FROM Student;
📦 Files Required (Same structure as before):
File	Role
Student.java	POJO class
StudentDao.java	Interface
StudentDaoImpl.java	Implementation
StudentRowMapper.java	RowMapper logic
App.java	Main runner
config.xml	Spring config

You already have Student.java, config.xml, and StudentRowMapper.java.
Let’s just update StudentDao, StudentDaoImpl, and App.java.

✅ Step-by-Step Code
✅ StudentDao.java
✅ StudentDaoImpl.java
✅ App.java
queryForObject()	For single row
query()	For multiple rows
