package test_task6;

class Prime {
	
	public void checkPrime(int... nums) {
		
		for (int i : nums) {
			
			if (i == 1 || i < 2) {

				System.out.print("");

			} else if (i == 2) {
				
				System.out.print(i + " ");
				
			} else {
				
				int sum = 1;
				
				for (int y = 2; y < i; y++) {
					
					if (i % y == 0) {
						sum = 0;
						break;
						
					}
				}
				
				if (sum == 1) {
					System.out.print(i + " ");
				}

			}

		}
		
		System.out.println("");
		
	}
}