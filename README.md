Advanced Object-oriented Programming Technics - Prototype vs Factory Method

Write a class PairDatabase storing pairs of numbers : (1,2), (4,0), etc.

It should have at least 3 functions:

put(int number1, int number2); //adding the pair (number1, number2) to the database
remove(int number1, int number2); //removing this pair
boolean contains(int number1, number2); //checking if the given pair is present in the database (so returning "true") or not (returning "false")

Implement it using a class HashMap of lists. Each list is described by the 'number1' (Integer) and contains all possible 'number2's. So the database containing the following pairs: (1,2), (1,5), (1,1), (5,3) should have the form given below:

HashMap<Integer>, List<Integer> > map;

map:

[Integer(1), List{2, 5, 1} ]
[Integer(5), List{3} ]

When you put a new pair 'number1, numbers' (2, 3) , you have to create a new entry in the HashMap, containing this new 'number1' (2) as the key and a new list with the new 'number2' (3) added to this list as the value.


"List" is an interface type and you should use one of 2 real classes: ArrayList or LinkedList. They have the same interface. The decision which class to use should be taken:

Using "FactoryMethod" pattern
Using "Prototype" pattern

ad. 1.
Create one abstract class FMDatabase with all needed methods and inside 'put' method, when you have to create a new list, instead of doing:

List newList=new ArrayList(); or List newList=new LinkedList();
write:

List newList=createList();

where 'protected abstract List createList();' method in the FMDatabase will be finally implemented in 2 subclasses of FMDatabase: ALDatabase, LLDatabase, producing one concrete list object of the corresponding class - it will be the Factory Method

ad. 2
Write one class PrototypeDatabase with all needed methods. During construction, give it as a parameter one object list of a specific list class:

PrototypeDatabase linkedDatabase=new PrototypeDatabase(new LinkedList());
or

PrototypeDatabase arrayDatabase=new PrototypeDatabase(new ArrayList());

This object list will be a prototype for all new lists to create. When you need to create a new list, instead of doing it in the following manner:

List newList=new ArrayList(); or List newList=new LinkedList();
write :

List newList=prototype.clone();