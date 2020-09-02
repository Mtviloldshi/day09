package com.sch.customer1;

public class CustomerList {
    private Cusomer[] customers;
    private int total = 0 ;
    public CustomerList(int totalCustomer){
        customers = new Cusomer[totalCustomer];
    }
    public boolean addCustomer(Cusomer cusomer){
        if(total > customers.length){
            return false;
        }
        customers[total] = cusomer;
        total++;
        return true;
    }
    public boolean replaceCustomer(int index,Cusomer cust){
        if(index <0 || index >total-1){
            return false;
        }
        customers[index] = cust;
        return true;

    }
    public boolean deleteCustomer(int index){
        if(index <0 || index >total-1){
            return false;
        }
        for(int i = index; i <total -1;i++){
            customers[i] =customers[i+1];
        }

        customers[--total] = null;
        return  true;
    }
    public Cusomer[] getAllCustomers() {
        if (total == 0) {
            return null;
        } else {
            Cusomer[] newcust = new Cusomer[total];
            for (int i = 0; i < total; i++) {
                newcust[i] = customers[i];
            }
            return newcust;
        }
    }
    public Cusomer getCustomer(int index){
        if(index !=total-1){
            return null;
        }else{
            return customers[index];
        }
    }

    public static void main(String[] args) {
        Cusomer cust = new Cusomer("1",'1',12,"1","1");
        Cusomer cust2 = new Cusomer("233",'2',12,"1","1");

        CustomerList custl = new CustomerList(10);
        boolean flag = custl.addCustomer(cust);
        custl.addCustomer(cust2);
        System.out.println(flag+cust.getName() +"\t" +
                cust.gender()+"\t" +cust.geTage()+"\t"+ cust.getPhone());
        Cusomer[] newcst = custl.getAllCustomers();
        for (int i = 0;i < newcst.length;i++){
            System.out.println(newcst[i].getName());
        }
        System.out.println(custl.getCustomer(1).getName());
    }
}
