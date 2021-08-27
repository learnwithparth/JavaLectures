public class OperatorDemo {
    public static void main(String[] args) {
        // Operators
        // Conditional Operators/Relational operators <, >, <=, >=, !=, == Numeric data, character data. You can use != and == with the object reference
        String str1 = new String("abc");
        String str2 = new String ("abc");
//        // compareTo method returns integer positive, negative or zero "xyz".compateTo("abc") "abc".compareTo("xyz") "abc.compareTo("abc")
//        if(str1.equals(str2)){
//            System.out.println("Both are referring to same location");
//        } else {
//
//            System.out.println("Both are not referring to same location");
//        }
        // ternary operator condition? true part: false part;
        String value = str1.equals(str2) ? "Both are referring to same location" : "Both are not referring to same location";

        // Arithmetic operators +, -, *, /, % - Numeric data, character data
        // Compound operators +=, -=, *=, /=, %=
        int x = 10;
        x = x + 10;
        x += 10;

        // ++ --

        int i = 10;
        //                  12 + 10  + 13
        System.out.println(++i + i++ + ++i);
        // Shift operators Right shift >>, left shift <<, unsigned right shift operator
        int var = -11;
        System.out.println(var << 1);
        // Binary operators
        // instance of operator
        // equals methods
    }
}
