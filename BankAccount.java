public class BankAccount {
    private String name;
    private int age;
     private long accnumber;
    private long accbalance;
    private long deposit;
   
    
    public String getName(){
        return name;
    }
     public int getAge(){
        return age;
    }
      public long getAccbal(){
        return accbalance;
    }
       public long getAccnum(){
        return accnumber;
    }
        public long getDep(){
        return deposit;
    }
      
    public void setName(String name){
        this.name = name;
        System.out.println("Name: " + this.name);
    }
     public void setAge(int age){
        this.age = age;
        System.out.println("Age: " + this.age);
    }
       public void setAccnum(long accnum){
        this.accnumber = accnum;
        System.out.println("Account Number: " + this.accnumber);
    }
      public void setAccbal(long accbal){
        this.accbalance = accbal;
        System.out.println("Balance: " + this.accbalance);
      }
        public void setDep(long dep){
            this.deposit = dep;
            System.out.println("Deposit: " + this.deposit);
    }
        public void Summary(){
            this.accbalance = this.accbalance + this.deposit;
            System.out.println("Balance Remaining: " + this.accbalance);
        }
}
class Main{
    public static void main(String[] args){
        
        BankAccount q= new BankAccount(); 
        BankAccount qq= new BankAccount(); 
        
        q.setName("Lorena Dacool");
        q.setAge(27);
        q.setAccnum(010101);
        q.setAccbal(200000);
        q.setDep(20000);
        q.Summary();
        
        System.out.println("");
        
        qq.setName("Gelo Jones");
        qq.setAge(30);
        qq.setAccnum(222223);
        qq.setAccbal(600000);
        qq.setDep(30000);
        qq.Summary();
    }
}

