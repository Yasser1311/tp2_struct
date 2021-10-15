public class main {
    public static void main(String args[]){
        squareSubMatrice matriceTest = new squareSubMatrice(3, new int[3][3],0,0,2,2);
        System.out.println(matriceTest);
        matriceTest.fillOne();
        /*System.out.println(matriceTest);
        matriceTest.fillRand();
        System.out.println(matriceTest);
        squareSubMatrice matriceclone;
        matriceclone = matriceTest.clone();
        System.out.println(matriceclone);

         */
        matriceTest.set(1,1,2);
        System.out.println(matriceTest);
        System.out.println(matriceTest.get(1,0));



    }
}
