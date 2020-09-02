package com.sch.customer1;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);
    boolean flag =true ;
    public void enterMainmenu(){
        do {
            System.out.println("---------- 信息统计 ----------");
            System.out.println("--------------1--------------");
            System.out.println("--------------2--------------");
            System.out.println("--------------3--------------");
            System.out.println("--------------4--------------");
            System.out.println("--------------5--------------");
            int select = CMUtility.readChar();
            switch (select) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    flag = false;
                    break;
            }
        }while (flag ==true);
    }
    private void addNewCustomer(){
        System.out.print("1");
        String name = CMUtility.readString(10);
        System.out.print("2");
        char gender = CMUtility.readChar('1');
        System.out.print("3");
        int age = CMUtility.readInt(10);
        System.out.print("4");
        String  phone = CMUtility.readString(20);
        System.out.print("5");
        String email = CMUtility.readString(20);
        Cusomer c= new Cusomer(name,gender,age,phone,email);
        customerList.addCustomer(c);
    }
    private void modifyCustomer(){

    }
    private void deleteCustomer(){}
    private void listAllCustomer(){

    }

    public static void main(String[] args) {
    CustomerView cv= new CustomerView();
    cv.enterMainmenu();
    }
}
