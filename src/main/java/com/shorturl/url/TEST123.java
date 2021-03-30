package com.shorturl.url;

public class TEST123
{
    public static void main(String[] args) {
        try{
            Test124 test124=new Test124();
            test124.validate();

        }catch (Exception e){
            System.out.println("Unknown error occurred  {}"+e.fillInStackTrace());
            System.out.println("Unknown error occurred message {}"+e.getMessage());
            System.out.println("Unknown error occurred get cause {}"+e.getCause());
            System.out.println("Unknown error occurred  stacktrace{}"+e.getStackTrace());
        }
    }


}
class Test124{
    public void validate() {
        int p=11/0;
        System.out.println(p);
    }
}