public class Main {
public static void main(String[] args) 
{ Task obj = new Task(); obj.withdrawn("Mahin", 40000);
obj.deposit("Aamna", 95000);
obj.withdrawn("Hammad", 40000);
obj.deposit("Hassan", 65000);
}
}

public class Task {
int total = 100000;
synchronized void withdrawn(String name, int withdrawal)
{
if (total >= withdrawal) {
System.out.println(name + " withdrawn: " + withdrawal); total = total - withdrawal;
System.out.println("Balance after withdrawal: " + total);
try { Thread.sleep(1000);
}
catch (InterruptedException e) { e.printStackTrace();
}
}
else {
System.out.println(name + " you can not withdraw: " + withdrawal); System.out.println("your balance is: " + total);
try { Thread.sleep(1000);
}
catch (InterruptedException e) { e.printStackTrace();
}
}
}
synchronized void deposit(String name, int deposit) { System.out.println(name + " deposited: " + deposit); total = total + deposit;
System.out.println("Balance after deposit: " + total);
try { Thread.sleep(1000);
}
 
catch (InterruptedException e) { e.printStackTrace();
}
}
}


