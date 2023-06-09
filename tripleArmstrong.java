//write a java program to generate all the triple digit armstrong number
public class tripleArmstrong{
public static void main(String[] args) {
int num, temp, remainder, result = 0;
System.out.println("Armstrong Numbers between 100 and 999 are: ");
for(num = 100; num <= 999; num++) {
temp = num;
while (temp != 0) {
remainder = temp % 10;
result += Math.pow(remainder, 3);
temp /= 10;
}
if(result == num) {
System.out.println(num);
}
result = 0;
}
}
}