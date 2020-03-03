package epamcom.newyeargift;
import java.util.*;
import java.util.HashMap;
public class newYear {
static Scanner sc = new Scanner(System.in);
static Map<String, Integer> map = new HashMap<String, Integer>() {{ 
                 put("milkybar", 0); put("fivestar", 0); put("munch", 0); put("kitkat", 0); put("KajuBarfi", 0); put("Jalebi", 0); put("Shrikhand", 0); 
}};

public static void main(String args[]) {
//objects creation and initialization
Sweet KajuBarfi = new Sweet();
KajuBarfi.setWeight(50);
Sweet Jalebi = new Sweet();
Jalebi.setWeight(40);
Sweet Shrikhand  = new Sweet();
Shrikhand.setWeight(30);
//object creation
milkybar mb = new milkybar();
fivestar fs = new fivestar();
munch m = new munch();
kitkat kk = new kitkat();

char More = 'y';
System.out.println("Chocolates: \n1.Milkybar\n2.Fivestar\n3.Munch\n4.Kitkat\nSweets:\n5.Kajubarfi\n6.Jalebi\n7.Shrikhand");
while (More == 'y') {
System.out.println("Enter numbers corresponding to the preffered item: ");
       int n = sc.nextInt();
       switch(n) {
       case 1: map.put("milkybar", map.get("milkybar")+1); break;
       case 2: map.put("fivestar", map.get("fivestar")+1); break;
       case 3: map.put("munch", map.get("munch")+1); break;
       case 4: map.put("kitkat", map.get("kitkat")+1); break;
       case 5: map.put("KajuBarfi", map.get("KajuBarfi")+1); break;
       case 6: map.put("Jalebi", map.get("Jalebi")+1); break;
       case 7: map.put("Shrikhand", map.get("Shrikhand")+1); break;
       }
       System.out.println("Do you need any other chocolate/sweet? (y/n): ");
       More = sc.next().charAt(0);
}
sc.close();
//number of candies(chocolates and sweets) and weight calc
double totalWt = mb.calculateWeight(map.get("milkybar")) + fs.calculateWeight(map.get("fivestar")) + m.calculateWeight(map.get("munch")) + kk.calculateWeight(map.get("kitkat"));
totalWt += KajuBarfi.calculateWeight(map.get("KajuBarfi")) + Jalebi.calculateWeight(map.get("Jalebi")) + Shrikhand.calculateWeight(map.get("Shrikhand"));
System.out.println("Total gift weight: " + totalWt);
int quantity = 0;
System.out.println("Number of chocolates/sweets purchased individually: ");
for (String candy : map.keySet()) {
System.out.println(candy + " : " + map.get(candy));
quantity += map.get(candy);
}
System.out.println("Total number of chocolates and sweets: " + quantity);
}
}

