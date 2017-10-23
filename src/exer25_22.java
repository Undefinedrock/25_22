import java.util.Arrays;
import java.util.ArrayList;
public class exer25_22 {

    public static void main(String args[]){

        final java.util.Scanner input= new java.util.Scanner(System.in);
        new java.util.Scanner(System.in);
        System.out.print("please enter the number of objects: ");
        final int [] items= new int[input.nextInt()];
        System.out.print("please enter the weight of objects ");
        for (int i=0;i< items.length;i++){
            items[i]= input.nextInt();

        }
        Arrays.sort(items);
        ArrayList<Bin>containers =new ArrayList<Bin>();
        for (int j=items.length-1;j>=0;j--){
            boolean addedbooleanbin=false;
            for (int i=0;i<containers.size();i++){
              if (containers.get(i).additem(items[j])){

                  addedbooleanbin=true;
                  break;



              }



            }
if(!addedbooleanbin){

                Bin bin= new Bin(10);
                bin.additem(items[j]);
                containers.add(bin);
}





        }
        for (int i=0;i<containers.size();i++){

            System.out.println("container"+ (i+1)+"contains objects with the weight of " +containers.get(i));


        }}
        static class Bin{private ArrayList<Integer> objects= new ArrayList<Integer>();

        private int maxweight=10;
        private int totalweight=0;
            public Bin(){}
            public Bin(int maxweight){this.maxweight=maxweight;}

            public boolean additem(int weight){
                if (totalweight+weight<=maxweight){

                    objects.add(weight);
                     totalweight+=weight;
                    return true;
                }
                else {return false;}
            }
            public int getNumberofObjects(){
                return  objects.size();}public String toString() {
                String output= "";
                for(Integer weight:objects)output+=weight+"";




                return output;
            }






        }




}




