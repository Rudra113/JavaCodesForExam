package JavaCodesForExam;
public class commandlinearg {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            sum += num;
        }
        System.out.println("The sum of the numbers entered through commandline argument is: " + sum);
    }
}

// Output
// PS E:\Coding Languages\Java Progamming> javac .\commandlinearg.java
// PS E:\Coding Languages\Java Progamming> java commandlinearg 54 8 7 69
// The sum of the numbers enterd through commandline argument is: 138
// PS E:\Coding Languages\Java Progamming>