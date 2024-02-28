package RuntimePolymorphism;
// /*
//  *Only methods are overrriden not data members
//  */

//  /*
//   * In the example below both classes have data member - speedLimit
//   We are accessing the data member by reference variable of parent class which:
//   refers to the subclass object

//   We access the data member is not overridden hence:
//   it would acess the parent class always


  class Bike7 {
    int speedLimit = 90;
  }

  class HarleyDavidSon extends Bike7 {
    int speedLimit = 220;
  }
public class RuntimePolymorphismWithDataMember {

    public static void main(String[] args) {
        Bike7 objects = new HarleyDavidSon();
        System.out.println(objects.speedLimit); //90
    }
}

//outputs 90
