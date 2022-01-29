public class Scope {
    //What is Scope?
    // Scope: Where we can access our variable.
    public static void main(String[] args) {
        //Function Scope
        //If we define any variable inside a function then, we can only access those inside the function
        int a = 10;
//        System.out.println(num); // We can't access num because num variable is defined inside the random function.

        //Block Scope
        //If we define any variable in the block then we can't access that value outside the block
        {
//            int a = 10; //already initialized outside the block in the same method, hence you can not initialise again.
            a  = 12; //but we can modify/reassign the value of a.
            int c =101;
            System.out.println(a);
        }
//        System.out.println(c); //We can't access value of c because c is not initialized in this block.
        System.out.println(a);
//        c = 10; // we can not update c, because it is initialized inside the block
        int  c = 10;
        System.out.println(c);
        //Anything initialized outside the block can be updated inside the block but anything inside the block can not be updated outside the block.
        //Example: int a =100; then we can update the value inside the block by writing a = 100;
        //But: int c =101; then we can not update the value outside the block by writing c = 10;

        //Anything initialized outside the block can not be initialized again inside the block but anything initialized inside the block can be initialized outside the block.
        //Example: int a =10; then we can not write int a = 100; inside the block
        //But: int c = 101; then we can also write int c = 10; outside the block
    }
    static void random(){
        int num = 100;
        System.out.println(num);
    }
}
