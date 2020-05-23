// Complete the sockMerchant function below.
int sockMerchant(int n, int ar_count, int* ar) 
{
//I am editing this to reflect it in the Termux
   
 
        int i, j,a,count=0;
 
        for (i = 0; i < n; ++i) 
        {
 
            for (j = i + 1; j < n; ++j)
            {
 
                if (ar[i] > ar[j]) 
                {
 
                    a =  ar[i];
                    ar[i] = ar[j];
                    ar[j] = a;
 
                }
 
            }
 
        }
    
        for( i=0;i<n-1;i++){
            if(ar[i]==ar[i+1])
            {
                count=count+1;
                i=i+1;
            }
        }
        return count;
    


}
