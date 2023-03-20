package Seminar_4_HW;

public class App {
    public static void main(String[] args) {
        
        ArrList<Integer> intList = new ArrList<>();
        intList.add(37); 
        intList.add(47);
        intList.add(27);
        intList.add(55);
        intList.add(87);
        intList.add(12);
        
        intList.printArray(); 

        intList.delForIdx(3); 
    
        intList.printArray();

        intList.deleteData(12); 
      
        intList.printArray();

        System.out.println(intList.minData()); 
        System.out.println(intList.maxData()); 
        System.out.println(intList.sumData()); 
        System.out.println(intList.multData()); 
        System.out.println(intList.findData(87)); 
        System.out.println(intList.findData(874));  
                                                   
        try {
            intList.BubbleSort();
            System.out.print("Результат:"); 
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrList<String> stringList = new ArrList<>();
        stringList.add("GB"); 
        stringList.add("Seminar");
        stringList.add("Nomer");
        stringList.add("Four");
        stringList.add("HW");
   
        stringList.printArray(); 
        stringList.delForIdx(1);
        stringList.printArray();


    }
}
