// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
       List<List<Pair>> stateList = new ArrayList<List<Pair>>();
       stateList.add(pairs);
       List<Pair> pairsTemp = new ArrayList<Pair>();
       for(int i =0; i<pairs.size(); i++){
        pairsTemp.add(pairs.get(i));
       }
       for(int i=1; i<pairs.size(); i++){
           boolean stChg = false;
           int j = i-1;
           while(j>=0 && pairsTemp.get(j+1).key < pairsTemp.get(j).key){
              stChg = true;
              Pair temp = pairsTemp.get(j+1);
              pairsTemp.set(j+1,pairsTemp.get(j));
              pairsTemp.set(j,temp);
              j--;
           } 
           if(i !=pairs.size()-1 && stChg == false ){
             stateList.add(pairs);
           }else{
            stateList.add(pairsTemp);
           }
       }
       
       return stateList;
    }
}
