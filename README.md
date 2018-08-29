The primary use case of the project is to enable user to interact online  with doctors and pharmacist for their regular 
health checkups or medications.

Structure of the project:
Packages :
domain: will contain the domain classes which is basically the mapping of domain objects : doctor, pateint, pharmacist, medicine, prescription and 
their abstraction.

pattern: this is the interface needed to support the behaviour of the domain objects.



Basic flow of application : This project supports the feature where the patient can record their visit/intent to doctor/pharmacist
and then the visited doctor/pharmacist asks the patient for their prescription or current medication records.
Patient approve the request adn sends their record to doctor/pharmacist or can deny the request as well.

Application.java : This class adds the basic flow of the application described above.

ApplicationTest: Unit test to test the process flow specified by Application.java.


