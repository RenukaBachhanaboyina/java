package CSE5;

public class GasStation {
	static int canCompleteCircuit(int[] gas, int[] cost) {
		int totalGas = 0;
		int CurrentGas = 0;
		int start = 0;
		for(int i = 0; i< gas.length;i++) {
			int difference = gas[i] - cost[i];
			totalGas += difference;
			CurrentGas += difference;
			if(CurrentGas < 0) {
				start = i + 1;
				CurrentGas = 0;
			}
		}
		if(totalGas < 0) {
			return -1;
		}
		return start;
	}
	public static void main(String[] args) {
		int[] gas = {1, 2, 3, 4, 5};
		int[] cost = {3, 4, 5, 1, 2};
		System.out.println("Starting station = " + canCompleteCircuit(gas, cost));
		}
		
	}

