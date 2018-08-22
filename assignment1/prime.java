class prime{
public static void main(String[] args) 
{
int n=Integer.parseInt(args[0]);;
int i, c = 0;
for (i = 1; i <= n; i++) {
if (n % i == 0) {
c++;
}
}
if (c == 2) {
System.out.println("n is a Prime number");
}
else {
System.out.println("n is not a Prime number");
}   
}
}
