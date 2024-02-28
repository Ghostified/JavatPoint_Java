package Enscapulation.Example1;

//java class with a fully enscapulated class
//has a private data member with getter and setter methods


public class Student {
//private data member
private String name;

//getter method for name
public String getName () {
    return name ;
}

//setter method for name 
public void setName (String name) {
    this.name=name;
}
}
