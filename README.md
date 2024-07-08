# Java_21_Inh_3

Write a Java program using the classes Student, Undergraduate (extended from Student), and PhDStudent (extended from Student).  

The constructor of Student has 2 parameters:  name and a long student number, 

The constructor of Undergraduate has 4 parameters: name, number, major program and year of studies. 

The constructor of PhDStudent has 4 parameters: name, number, supervisor name, yearly fee.

All 3 classes have the method _toString() _

Class Undergraduate uses method_ calculateFees()_, which returns the fees to be paid by the student assuming that his/her course load is 5.0. Suppose that for students generally, the fees are $800/course, and that for undergraduates, there is an additional incidental charge of $100 for first year students and $150 for students in later years.
Class PhDStudent has the method _getFee()_ to return to _main()_ the yearly fee.

Create an array of Student objects and store in it 3 Undergrad objects and 1 PhDStudent object.

Write a loop which displays the objects using the methods _toString(),_ _getFee()_ and _calculateFees()_.

