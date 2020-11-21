public class Programmingpattern13
 {
    public static void main(String args[])
{
int i,j,c;
c=65;

for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}
for(j=5;j>=i;j--)
{
System.out.print((char)c);
}
c++;
System.out.println();
}
}
}
