package com.sch.customer1;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);
    boolean flag =true ;
    public void enterMainmenu(){
        Cusomer cust = new Cusomer("1",'1',12,"1","1");
        Cusomer cust2 = new Cusomer("233",'2',12,"1","1");
        customerList.addCustomer(cust);
        customerList.addCustomer(cust2);
        do {
            System.out.println("---------- 信息统计 ----------");
            System.out.println("--------------1添加--------------");
            System.out.println("--------------2删除--------------");
            System.out.println("--------------3修改--------------");
            System.out.println("--------------4遍历--------------");
            System.out.println("--------------5退出--------------");
            int select = CMUtility.readChar();
            switch (select) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    deleteCustomer();
                    break;
                case '3':
                    modifyCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    flag = false;
                    break;
            }
        }while (flag ==true);
    }
    private void addNewCustomer(){
        System.out.println("-------------------");

        System.out.print("1");
        String name = CMUtility.readString(10,"1");
        System.out.print("2");
        char gender = CMUtility.readChar('1');
        System.out.print("3");
        int age = CMUtility.readInt(10);
        System.out.print("4");
        String  phone = CMUtility.readString(20,"1");
        System.out.print("5");
        String email = CMUtility.readString(20,"1");
        Cusomer c= new Cusomer(name,gender,age,phone,email);
        boolean flag = customerList.addCustomer(c);
        if (flag == true){
            System.out.println("------------------成功");
        }else{
            System.out.println("失败");
        }
    }

    /**
     * 修改
     */
    private void modifyCustomer(){
        System.out.println("---输入修改编号--------");
        int num = CMUtility.readInt();
        if(num<0 || num >customerList.getAllCustomers().length) {
            return;
        }else{
                System.out.print("姓名1");
                String name = CMUtility.readString(10,"1");
                System.out.print("2");
                char gender = CMUtility.readChar('1');
                System.out.print("3");
                int age = CMUtility.readInt(10);
                System.out.print("4");
                String phone = CMUtility.readString(20,"1");
                System.out.print("5");
                String email = CMUtility.readString(20,"1");
                Cusomer c = new Cusomer(name, gender, age, phone, email);
            boolean flag =customerList.replaceCustomer(num,c);
            System.out.println(flag +"修改了第" + (num)+"项，修改为 "+ c.getName() );
            }

        //找谁去替换
//        1
    }
    private void deleteCustomer(){
        System.out.println("请输入你想要删除的项目");
        int num = CMUtility.readInt();
        if(num<0 || num >customerList.getAllCustomers().length) {
            return;
        }else {
            customerList.deleteCustomer(num);
        }

    }
    private void listAllCustomer(){
        System.out.println("--------------------");
        Cusomer[] c = customerList.getAllCustomers();
        for (int i = 0 ; i<c.length;i++){
            System.out.println(i+"\t"+c[i].getName());
        }
        System.out.println("列表循环结束");
    }

    public static void main(String[] args) {
    CustomerView cv= new CustomerView();
    cv.enterMainmenu();
    }
}
