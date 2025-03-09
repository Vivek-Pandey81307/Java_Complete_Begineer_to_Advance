
public class label {

    public static void main(String[] args) {
        study_group : {
        for(int i = 0,j=100,k = 50;i<=50 &&k>=0 &&j>=0;i++,k--,j-=3){
            System.out.println(i+"="+j+"="+k);
            if(i==j && j==k)break study_group;
        }
        }

        // step_found:
        // {
        //     for (int k = 2; k <= 10; k++) {
        //         for (int i = 0, j = 100; i <= 50 && j >= 0; i++, j -= k) {
        //             if(i==j){
        //                 System.out.println("k ==" + k);
        //                 break step_found;
        //             }
        //         }
        //     }
        // }

    }
}
