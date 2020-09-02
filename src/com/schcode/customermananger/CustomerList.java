package com.schcode.customermananger;
/*Customer[] customers：用来保存客户对象的数组
int total = 0    ：记录已保存客户对象的数量*/

import org.omg.CORBA.PUBLIC_MEMBER;

public class CustomerList {
    private Customer[] customers;//容器
    private int total = 0;
    //初始化Customer[]↓
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加客户功能
     * @param customer 要添加的客户
     * @return 添加是否成功
     */
    public boolean addCustomer(Customer customer){
        if(total >=customers.length){
            return false;
        }
        customers[total] =customer;
        total++;
        return  true;
    }

    /**
     * 替换指定位置的客户对象
     * @param index 数组中要替换的索引位置
     * @param cust  替换者客户
     * @return  替换成功与否
     */
    public boolean replaceCustomer(int index ,Customer cust){
        if(index < 0 || index >total-1){
            return false;
        }
        customers[index] = cust;

        return true;

    }

    /**
     * 删除客户
     * @param index 要删除的客户
     * @return 删除成功与否
     */
    public boolean deletecustomer(int index){
        if(index <0 || index >total -1){

        }
        for(int i = index ; i <total-1;i++){
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     *获取所有的用户对象
     * @return 所有用户的对象数组
     */
    public Customer[] getAllCustomers(){
        if (total == 0){
            return null;
        }else {
            Customer[] newCusts = new Customer[total];

            for (int i = 0; i < total; i++) {
                newCusts[i] = customers[i];
            }
            return newCusts;
        }
        }

    /**
     * 获取一个客户对象
     * @param index 指定的索引位置
     * @return
     */
    public Customer getCustomer(int index){
        if(index < 0 || index > total -1){
            return  null;
        }
        return customers[index];
    }

    public static void main(String[] args) {
        CustomerList cl = new CustomerList(5);
        Customer c1 = new Customer("tom",'m',18,"123456789","tom@123.com");
        Customer c2 = new Customer("jack",'m',18,"123456789","tom@123.com");
        cl.addCustomer(c1);
        cl.addCustomer(c2);
        Customer[] allCusomers = cl.getAllCustomers();
            for(int i = 0;i <allCusomers.length; i++){
                System.out.println(allCusomers[i].getName());
            }
         boolean b = cl.replaceCustomer(1,c1);
         System.out.println(b);
         boolean a = cl.deletecustomer(0);
         System.out.println(a);
         Customer name = cl.getCustomer(0);
         System.out.println(name.getName());
    }


}
