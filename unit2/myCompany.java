class Employee {
    private String name;
    private String id;
    Employee() {
        this.id ="0";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class clients {
String name;
String address;
String clientid; //=mycompany_clientname_clientid

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getName() {
        return name;
    }
}
class Products {
String name;
float costProd;
float mrp;

    public void setName(String name) {
        this.name = name;
    }

    public void setCostProd(float costProd) {
        this.costProd = costProd;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
    }

    public float getCostProd() {
        return costProd;
    }

    public float getMrp() {
        return mrp;
    }
}
class Accounts {
    int productsSold[] = new int[100];
    float currProfit;

}


public class myCompany {

    public static void main(String[] args) {
        Employee companyEmployees [] = new Employee[100];
        int index=1;
        for(Employee x:companyEmployees){
            x.setName("abc");
           String baseString="mycompnay";
           String empid= baseString + index;
            x.setId(empid);
            index++;
        }
        clients myClients [] = new clients[10];
        index = 1;
        for(clients x:myClients){
            x.setName("abc");
            x.setAddress("xyz");
            String cliId = "mycompany_"+x.getName()+"_"+index;
            x.setClientid(cliId);
            index++;
        }

        Products myProducts[] = new Products[10];

        for(Products x:myProducts){
            x.setName("abs");
            x.setCostProd(123.0f);
            x.setMrp(456.0f);
        }

        Accounts acc  = new Accounts();
        for(int x:acc.productsSold){
            x=10;
        }
        calcProfi(acc,myProducts);
        System.out.println("Pofits earned are" + acc.currProfit);




    }
    public static void calcProfi(Accounts acc,Products myProducts[]) {



    }

}








