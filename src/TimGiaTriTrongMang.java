import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {


        String[] listStudent= {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh ");
        String student=scanner.nextLine();
        int i=0;
        boolean check=false;
        for(String x:listStudent)
        { i++;
            if(x.equals(student))
            {
                System.out.print("Ten"+listStudent[i-1]+" o vi tri "+i);
                check=true;
            }
        }
        if(!check)
        {
            System.out.print("Khong co Student");
        }
    }
}