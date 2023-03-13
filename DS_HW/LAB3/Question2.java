package LAB3;

public class Question2 {
    public static void main(String[] args) {

    ObjectE o1 = new ObjectE("O1" , 1);
    ObjectE o2 = new ObjectE("O2" , 2);
    ObjectE o3 = new ObjectE("O3" , 3);

    ObjectE[] obArr = {o1 , o2 , o3};
    ObjectE[] obArrClone = {null , null , null};

    System.out.println("Object Array Elements : ");
        for (int i = 0; i < obArr.length; i++) {
            System.out.println("Name : "+ obArr[i].getName() +"\n ID : "+ obArr[i].getID());
        }

        for (int i = 0; i < obArr.length; i++) {
            obArrClone = obArr.clone();
        }
        System.out.println("Cloned Object Array Elements : ");
        for (int i = 0; i < obArr.length; i++) {
            System.out.println("Name : "+ obArrClone[i].getName() + "\n ID : "+obArrClone[i].getID());
        }
    }
}
