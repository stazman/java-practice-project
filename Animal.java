// https://www.youtube.com/watch?v=WPvGqX-TXP0&t=579s

import java.util.Scanner;

import jdk.jshell.spi.ExecutionControl;

import java.util.*;
   

public class Animal {

  public static final double FAVNUMBER = 1.6180;

  private String name;
  private int weight;
  private boolean hasOwner = false;
  private byte age;
  private long uniqueID;
  private char favoriteChar;
  private double speed;
  private float height;

  protected static int numberOfAnimals = 0;

  static Scanner userInput = new Scanner(System.in);

  public Animal() {
    numberOfAnimals++;

    int sumOfNumbers = 5 + 1;
    System.out.println("5 + 1 = " + sumOfNumbers);

    int diffOfNumbers = 5 - 1;
    System.out.println("5 - 1 = " + diffOfNumbers);

    int multOfNumbers = 5 * 1;
    System.out.println("5 * 1 = " + multOfNumbers);
    
    int divOfNumbers = 5 / 1;
    System.out.println("5 / 1 = " + divOfNumbers);

    int modOfNumbers = 5 % 3;
    System.out.println("5 % 3 = " + modOfNumbers);

    System.out.print("Enter the name: \n");

    if (userInput.hasNextLine()){
    
      this.setName(userInput.nextLine());
    }

    this.setFavoriteChar();
    this.setUniqueID();

  }

  public String getName() {
    return name;
  }
  
  public void setName(String name){
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }
  
  public void setWeight(int weight){
    this.weight = weight;
  }

  public boolean getHasOwner() {
    return hasOwner;
  }
  
  public void setHasOwner(boolean hasOwner){
    this.hasOwner = hasOwner;
  }

  public byte getAge(byte age) {
    return age;
  }
  
  public void setAge(byte age){
    this.age = age;
  }

  public long getUniqueID(long uniqueID){
    return uniqueID;
  }

  public void setUniqueID(long uniqueID){
    this.uniqueID = uniqueID;
    System.out.println("Unique ID set to: " + this.uniqueID);
  }

  public void setUniqueID(){
    long minNumber = 1;
    long maxNumber = 1000000;

    this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));
    // could have had int and not long for 1000000, but Devin just did it :)

    String stringNumber = Long.toString(maxNumber);

    int numberString = Integer.parseInt(stringNumber);

    System.out.println("Unique ID set to: " + this.uniqueID);

  }

  public char getFavoriteChar(char favoriteChar){
    return favoriteChar;
  }

  public void setFavoriteChar(char favoriteChar){
    this.favoriteChar = favoriteChar;
  }

  public void setFavoriteChar(){
    int randomNumber = (int) (Math.random() * 126) + 1;
    //+1 to avoid zero

    this.favoriteChar = (char) randomNumber;
    //(char) converts randomNumber into a number here

    if (randomNumber == 32){
      System.out.println("Favorite character set to Space");
    } else if (randomNumber == 10) {
      System.out.println("Favorite character set to new line");
    } else {
      System.out.println("Favorite character set to " + this.favoriteChar);
    }

    if ((randomNumber > 97) && (randomNumber < 122)){
      System.out.println("Favorite character is a lowercase letter");
    }

    if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))){
      System.out.println("Favorite character is a letter");
    }

    if (!false){
      System.out.println("I turned false to " + !false);
    }

    int whichIsBigger = (50 < randomNumber) ? 50 : randomNumber;

    switch(randomNumber){
      case 8: 
        System.out.println("Favorite character set to backspace");
        break;
      
      case 9: 
        System.out.println("Favorite character set to horizontal tab");
        break;

      case 10:
      case 11:
      case 12:
        System.out.println("Favorite character set to something else weird");
        break;

        default :
          System.out.println("Favorite character is set to " + this.favoriteChar);
      // single quotes for char and double quotes for string
    }
  }

  public double getSpeed(double speed){
    return speed;
  }

  public void setSpeed(double speed){
    this.speed = speed;
  }

  public float getHeight(float height){
    return height;
  }
  
  public void setHeight(float height){
    this.height = height;
  }

  protected static int getNumberOfAnimals(){
    return numberOfAnimals;
  }

  public void setNumberOfAnimals(int numberOfAnimals){
    Animal.numberOfAnimals = numberOfAnimals;
  }

  protected static void countTo(int startingNumber){
    for(int i = startingNumber; i <= 100; i++){
      if(i == 90) continue;
      System.out.println(i);
    }
  }

  protected static String printNumbers(int maxNumbers){
    int i = 1;

    while(i < (maxNumbers / 2)){
      System.out.println(i);
      i++;

      if(i == (maxNumbers/2)) break;

    }

    Animal.countTo(maxNumbers/2);

    return "End of printNumbers";

  }


  protected static void guessMyNumber(){
    
    int number;

    do {

      System.out.println("Guess Number up to 100");

      while(!userInput.hasNextInt()){

        String numberEntered = userInput.next();

        System.out.printf("%s is not a number\n", numberEntered);
      }

      number = userInput.nextInt();

    } while(number != 50);
    //50 is our secret number here
    
      System.out.println("Yay! You guessed the number");
  
  }

  //POLYMORPHISM ... overriding the Animal method

  public String makeSound(){

    return "Grrr";

  }

  public static void speakAnimal(Animal randAnimal){
    System.out.println("Animal says " + randAnimal.makeSound());
  }

  // Execution

  public static void main(String[] args){

    // Animal theAnimal = new Animal();

    Animal theDog = new Animal();

    System.out.println("The animal is named " + theDog.getName());

    System.out.println(Animal.printNumbers(100));

    Animal.countTo(100);

    Animal.guessMyNumber();


    int[] favoriteNumbers = new int[20];;

    favoriteNumbers[0] = 100;

    String[] stringArray = {"Random", "Words", "Here"};

    for(String word : stringArray){

      System.out.println(word);
    }

    // String[][][] arrayName = { { { "000" }, { "100" }, { "200" }, { "300" } }, { { "010" }, { "110" }, { "210" }, { "310" } }, 
    // { { "020" }, { "120" }, { "220" }, { "320" } }};

//LEFT OFF HERE

  }

}