package build;

public class day3Loop_break_continue {

		public static void main(String[] args) {
			// for loop  --- break and continue
			
//			for(intialization ; conditionCheck ; increment/decrement) {
//				// statements
//			}
			
			
			// program 1
			
			for(int  i = 1 ; i <=3 ; i++) { // 2 // 3 // 4
				 
				System.out.println(i); //1 //2 // 3
			}
			
			// program 2 
			// print 'hello' 3 times 
			
			for(int i = 1 ; i <= 3 ; i++) {  // 2 // 3 // 4
				System.out.println("hello"); // hello // hello // hello
			}
			
			// program 3
			// print 1 to 5
			
			for(int i = 1 ; i <= 5 ; i++) {
				System.out.println(i);
			}
			
			// program 4 
			// print 5 to 1 
			
			for(int i = 5 ; i >=1 ; i--) { // 4 // 3  // 2 // 1 // 0
				
				System.out.println(i); // 5 // 4 // 3 // 2 // 1
				
			}
			
			// program 5
			for(int i = 2 ; i<=20 ; i= i+2) { // 4 // 6 -----// 22
				System.out.println(i); // 2 // 4 ------ //20
			}
			
			// program6
			
			for(int i = 50 ; i >= 5 ; i = i - 5) { // 45 ------ 0
				
				System.out.println(i); // 50 // 45 ------- 5
				
			}
			
			// program 7
			
			for(int i = 1 ; i <= 5 ; i++) { // 2 // 3
				if(i == 3) {
					break;
				}
				System.out.println(i); // 1 // 2
				
			}
			
			// program 8
			
			for(int i = 1 ; i <= 5 ; i++) {  //2 // 3 // 4 // 5 // 6
				
				if(i == 3) {
					continue;
				}
				System.out.println(i);  // 1 // 2 // 4 // 5
				
			}
			
			// program 9 
			
			// initialization 
			//while(condition){
				// statement
				// increment / decrement
			//}
			
			
			int t1 = 1;
			
			while(t1 <= 3) {
				System.out.println(t1);
				t1++;
			}
			
			// program 10
			// print "hello" three tyms
			
			int t2 = 1;
			
			while(t2 <= 3) {
				System.out.println("hello");
				t2 ++;
			}
			
			// program 11
			
			int t3 = 5;
			while(t3 >= 1) {
				System.out.println(t3);
				t3 --;
			}
			
			// program 12
			
			int t4 = 2 ; 
			while(t4 <= 20) {
				System.out.println(t4);
				t4 = t4 + 2;
			}
			
			
			// program 13
			
			int t5 = 50;
			while(t5 >= 5) {
				System.out.println(t5);
				t5 = t5 -  5;
			}
			
			
			// program 14
			
			int t6 = 1;
			
			while(t6 <= 5) {
				if(t6 == 3) {
					break ; 
				}
				System.out.println(t6);
				t6 ++;
			}
			
			
			// program 15 
			
			int t7 = 1;
			
			while(t7 <= 5) {
				if(t7 == 3) {
					t7++; //4
					continue ; 
				}
				System.out.println(t6); // 1 // 2 // 4 // 5
				t7 ++; // 2 // 3 // 5 // 6
			}
			
		
				
	
			// while loop  -- break and continue

		}

	}