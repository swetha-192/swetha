class DefaultValues {
// Instance variables with default values
byte defaulyByte;
short defaultShort;
int defaultInt;
long defaultLong;
float defaultFloat;
double defaultDouble;
char defaultChar;
boolean defaultBoolean;

public static void main(strings[] args) {
    DefaultValues obj = new DefaultValues();
    System.out.println("Default values of primitive data types:");
    System.out.println("byte: "+ obj.defaultByte);
    System.out.println("short: "+ obj.defaultShort);
    System.out.println("int: " + obj.defaultInt);
    System.out.println("long: "+ obj.defaultLong);
    System.out.println("float: " + obj.defaultFloat);
    System.out.println("double: " + obj.defaultDouble);
    System.out.println("char: [" + obj.defaultChar + "]");
// Empty character 
    System.out.println("boolean: " + obj.defaultBoolean);
  }
}

output :
 Default values of primitive data type in java   
byte : 0
short : 0
int : 0
long : 0
float : 0.0
double : 0.0
char : []
boolean : false 

    