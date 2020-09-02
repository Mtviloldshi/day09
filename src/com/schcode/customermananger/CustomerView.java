package com.schcode.customermananger;
//客户信息管理系统主界面类(视图)
public class CustomerView {
    private CustomerList customers = new CustomerList(10);

    /**
     * 主菜单
     */
    public void enterMainMenu(){
        boolean loopFlag = true;
        do{
        System.out.println("-----------------客户信息管理软件-----------------");
        System.out.println("-----------------1添加-----------------");
        System.out.println("-----------------2修改-----------------");
        System.out.println("-----------------3删除-----------------");
        System.out.println("-----------------4遍历-----------------");
        System.out.println("-----------------5退出-----------------");
        System.out.println("\t\t\t\t请输入数字：");
        char c = CMUtility.readMenuSelection();

        switch (c) {
            case '1':
                //添加用户
                addNewCustomer();
                break;
            case '2':
                modifyCustomer();
                //修改用户
                break;
            case '3':
                deleteCustomer();
                //删除用户
                break;
            case '4':
                //用户列表
                listAllCustomers();
                break;
            case '5':
                //退出
                System.out.println("确认是否退出Y/N");
                char yn = CMUtility.readChar();
                if(yn == 'Y'){
                    loopFlag = false;
                }
                break;
        }


        }while (loopFlag==true);
    }

    /**
     * 添加用户
     */
    public void addNewCustomer(){
        System.out.println("----------------------------");
        System.out.print("姓名:");
        String name = CMUtility.readString(10,"张三");
        System.out.print("性别:");
        char gender = CMUtility.readChar('m');
        System.out.print("年龄:");
        int age = CMUtility.readInt(10);
        System.out.print("电话:");
        String phone = CMUtility.readString(20,"123456879");
        System.out.print("email:");
        String emial = CMUtility.readString(30,"794690923@qq.com");
        //把客户信息封装到对象
        Customer c = new Customer(name,gender,age,phone,emial);
        //把对象添加到数组中
        boolean flag = customers.addCustomer(c);
        if (flag){
            System.out.println("-------------成功-------------");
        }else{
            System.out.println("无法添加，添加失败，容量溢出");
        }
    }

    /**
     * 修改客户
     */
    public void modifyCustomer(){
        System.out.println("--------------------------");
        System.out.println("请选择修改客户的编号从1开始");
        //跳出来接受新的名字
        Customer customer =null;
        int id = 1;
        //无限循环
        for(;;) {
            if(id == -1){
                //不给值的return直接结束方法
                return;
            }
            id = CMUtility.readInt(10);
            //判断编号的客户是否存在（否则会进入死循环）
             customer = customers.getCustomer(id - 1);
            if(customer == null){
                System.out.println("无法找到指定用户");
            }else{
                break;
            }
        }

        System.out.print("姓名"+customer.getName()+":");
        String name = CMUtility.readString(20,customer.getName());
        System.out.println(name);
        System.out.print("性别"+customer.getGender()+":");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.println(gender);
        System.out.print("年龄:"+customer.getAge()+":");
        int age = CMUtility.readInt(customer.getAge());
        System.out.println(age);
        System.out.print("电话:"+customer.getPhone()+":");
        String phone = CMUtility.readString(20,customer.getPhone());
        System.out.println(phone);
        System.out.print("email:"+customer.getEmail()+":");
        String emial = CMUtility.readString(30,customer.getEmail());
        System.out.println(emial);
        //把用户信息封装成对象
        Customer custr = new Customer(name,gender,age,phone,emial);
        boolean flag = customers.replaceCustomer(id-1,custr);
        if(flag){
            System.out.println("修改成功");

        }

        //把客户信息封装到对象
        //获取新对象的信息
        customers.replaceCustomer(id -1,custr);

    }

    /**
     * 删除客户
     */
    public void deleteCustomer(){
        System.out.println("--------------------------");
        System.out.println("请选择删除客户的编号从1开始");
        //跳出来接受新的名字
        Customer customer =null;
        int id = 1;
        //无限循环
        for(;;) {
            if(id == -1){
                //不给值的return直接结束方法
                return;
            }
            id = CMUtility.readInt(10);
            //判断编号的客户是否存在（否则会进入死循环）
            customer = customers.getCustomer(id - 1);
            if(customer == null){
                System.out.println("无法找到指定用户");
            }else{
                break;
            }
        }
        System.out.println("确认是否删除Y/N");
        char yn= CMUtility.readChar();
        if(yn =='Y'){
            customers.deletecustomer(id-1);
            System.out.println("删除完成");
        }
    }

    /**
     * 查看用户列表
     */
    private  void  listAllCustomers(){
        System.out.println("--------------------客户列表--------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        Customer[] allcust = customers.getAllCustomers();
        if (allcust == null){return;}
        for(int i = 0 ;i<allcust.length;i++){

                System.out.print(i + 1 + "\t" + allcust[i].getName() +
                        "\t" + allcust[i].getAge() + "\t" + allcust[i].getGender() + "\t" + allcust[i].getPhone() + "\t" + allcust[i].getEmail());
            }

        System.out.println("\n客户列表完成");

    }

    public static void main(String[] args) {
        CustomerView vie = new CustomerView();
        vie.enterMainMenu();
    }
}
