// Transaction 2d Matrices

import java.util.ArrayList;
import java.util.List;

class Trn {
    public static void run() {
        List<List<Integer>> orgArr = new ArrayList<>();

        orgArr.add(new ArrayList<>());
        orgArr.add(new ArrayList<>());
        orgArr.add(new ArrayList<>());

        orgArr.get(0).add(1);
        orgArr.get(0).add(2);
        orgArr.get(0).add(3);

        orgArr.get(1).add(4);
        orgArr.get(1).add(5);
        orgArr.get(1).add(6);

        orgArr.get(2).add(7);
        orgArr.get(2).add(8);
        orgArr.get(2).add(9);

        System.out.println("orgArr");
        System.out.println(orgArr);

        List<List<Integer>> trnArr = new ArrayList<>();

        System.out.println("trnArr");
        System.out.println(trnArr);

        for (int i = 0; i < orgArr.size(); i++) {
            trnArr.add(i, new ArrayList<>());
            for (int j = 0; j < orgArr.get(0).size(); j++) {
                trnArr.get(i).add(orgArr.get(j).get(i));
            }
        }

        System.out.println("trnArr");
        System.out.println(trnArr);

    }
}


Trn.run();


