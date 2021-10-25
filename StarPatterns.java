/*
STAR PATTERNS
1.left increasing triangle 
2.left decreasing triangle
3.square shape 
4.Right increasing triangle
5.Right Decreasing triangle
6.triangle shape 
7.Reverse triangle shape 
8.Diamond shape Pattern
9.left pascal pattern
10.Right pascal pattern
*/


public class StarPatterns
{
public static void main(String args[])
{
System.out.println("left increasing triangle");
int n=10;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println("left decreasing triangle");
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println("square shape pattern");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println("Right increasing triangle");
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
System.out.println("Right decreasing triangle");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int j=i;j<=n;j++){
System.out.print("*");
}
System.out.println();
}
//my own-right increasing + space added = triangle
System.out.println("triangle shape pattern");
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*");
System.out.print(" ");
}
System.out.println();
}
//my own-right decreasing + space added = reverse triangle
System.out.println("Reverse triangle pattern");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int j=i;j<=n;j++){
System.out.print("*");
System.out.print(" ");
}
System.out.println();
}
//my own-Triangle + Reverse Triangle = Diamond Pattern
System.out.println("Diamond shape Pattern");
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*");
System.out.print(" ");
}
System.out.println();
}
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int j=i;j<=n;j++){
System.out.print("*");
System.out.print(" ");
}
System.out.println();
}
//my own-right increasing + right decreasing = left pascal pattern
System.out.println("left pascal pattern");
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int j=i;j<=n;j++){
System.out.print("*");
}
System.out.println();
}
//my own-left increasing + left decreasing = right pascal pattern
System.out.println("Right pascal pattern");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print("*");
}
System.out.println();
}
}
}