package BitManipulation;

//Minimum number of developers.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class minimumNumberOfDevelopers {

	static ArrayList<Integer> sol = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of skills: ");
		int n = sc.nextInt();
		
		HashMap<String, Integer> smap = new HashMap<String, Integer>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter skill " + (i+1) + ":");
			smap.put(sc.next(), i);
		}
		
		System.out.println("Enter the no. of person: ");
		int np = sc.nextInt();
		int[] people = new int[np];
		
		for(int i = 0; i < np; i++) {
			
			System.out.println("Enter the no. of skills of person "+ (i+1) + ":");
			int personSkill = sc.nextInt();
			
			for(int j = 0; j < personSkill; j++) {
				
				System.out.println("Enter skill " + (j+1) + ":");
				String skill = sc.next();
				
				int snum = smap.get(skill);
				
				people[i] = people[i] | (1 << snum);
			}
		}
		solution(people, n, 0, new ArrayList<>(), 0);
		
		System.out.println(sol);
	}

	private static void solution(int[] people, int n, int cp, 
			ArrayList<Integer> onesol, int smask) {
		
		if(cp == people.length) {
			
			if(smask == ((1 << n) - 1)) {
				
				if(sol.size() == 0 || onesol.size() < sol.size()) {
					
					sol = new ArrayList<>(onesol);
				}
			}
			return;
		}
		solution(people, n, cp + 1, onesol, smask);
		
		onesol.add(cp);
		
		solution(people, n, cp + 1, onesol, (smask | people[cp]));
		
		onesol.remove(onesol.size()-1);
	}
}