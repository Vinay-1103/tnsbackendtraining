public class forEachLoop {
        
        public static void main(String[] args) {
            int[] number=new int[]{4,8,9,7,6,5};
            for (int n : number){
                System.out.println(n);
            }
            //printing sum of all elements of an integer array
            int[] numbers=new int[]{4,8,9,7,6,5};
            int sum=0;
            for (int n : numbers){
                sum +=n;
            }
            System.out.println(sum);

            //count of characters
            char[] ch={'a','b','c','a','b','a'};
            char tar='b';
            int count=0;
            for (char i:ch){
                if(i == tar){
                    count++;
                }
            }
            System.out.println(count);

//        print all even no.s from array
            for (int num:numbers){
                if (num%2==0){
                    System.out.print(num+" ");
                }
            }
        }
    }

