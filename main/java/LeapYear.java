public class LeapYear {


    public static  void  main(String[] args){


        System.out.println(LeepYear(2018));




    }
    public static boolean LeepYear(int year){
        boolean flag=false;
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            flag=true;
        }else {
            flag=false;
        }
        return  flag;   


    }
}
