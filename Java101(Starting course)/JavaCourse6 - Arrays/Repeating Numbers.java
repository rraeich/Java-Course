public class JavaKurs {
    public static void main(String[] args) {

        int[] nlist = {3,5,1,17,8,17,10,6,17,6,14,59,14};
        int[] clist = new int[nlist.length];

        for (int i=0,x=0; i < nlist.length; i++){
            for(int j=0; j <nlist.length; j++){
                control: if (nlist[i] == nlist[j] && (i != j && nlist[i] % 2 ==0)){
                    for(int a : clist) {
                        if(a == nlist[i]) {
                            break control;
                        }
                    }
                    clist[x++] = nlist[i];
                    System.out.println("This number repeating: " + nlist[i]);
                    break;
                }
            }
        }
    }
}