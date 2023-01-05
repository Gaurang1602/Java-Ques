class PrintSubarrays{
    public static void Subarray(int numbers[]){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};

    }
}