public class bubble {
    public static void BubbeSort(int a[]) {
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }
        }
    }
    public static void Printa(int a[] ) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,3,5,6,9,4};
        BubbeSort(a);
        Printa(a);
    }
    
}
