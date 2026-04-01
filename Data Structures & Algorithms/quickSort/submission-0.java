// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
      List<Pair> sortedPairs = quickSortHelper(pairs,0,pairs.size()-1);
      return sortedPairs;
    }

    public List<Pair> quickSortHelper(List<Pair> pairs, int s, int e){
        if((e-s)+1 <= 1)
           return pairs;
        Pair pivot = pairs.get(e);
        int p=s;
        for(int i=s; i<e; i++){
            if(pairs.get(i).key < pivot.key ){
                Pair temp = pairs.get(p);
                pairs.set(p, pairs.get(i));
                pairs.set(i,temp);
                p++;
            }
        }
        pairs.set(e,pairs.get(p));
        pairs.set(p,pivot);

        quickSortHelper(pairs,s,p-1);
        quickSortHelper(pairs,p+1,e);

        return pairs;
    }
}
