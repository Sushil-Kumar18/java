public class selection {
    public static void bubbleSort(int a[]) {
        for(int i=0;i<a.length-1;i++){
int minipos=i;
for(int j=i+1;j<a.length;j++){
    if(a[minipos]>a[j]){
     minipos=j;
    }
}
int temp=a[minipos];
a[minipos]=a[i];
a[i]=temp;
        }
    }
    public static void Printa(int a[]) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,6,8,4,9};
        bubbleSort(a);
        Printa(a);
    }
}
