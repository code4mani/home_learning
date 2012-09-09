
package com.prime;

import java.io.*;
import com.prime.FileList;
import java.util.List;
import java.util.ArrayList;
import com.prime.Human;
import com.prime.Human.Gender;
import java.util.Comparator;
import java.util.Collections;
import com.prime.HumanLoader;

public class Agesort{
	public static void main(String [] args){
		List<Human> li = HumanLoader.load("resources/namelist.txt");
		Collections.sort(li, new Comparator<Human>() {
			public int compare(Human h1,Human h2) {
				//if(h1.getAge() == h2.getAge());{
				return(h1.getAge() - h2.getAge());
			}
		} );
				/*}
				else if(h1.getAge() < h2.getAge());{
					return -1;
				}
				else  if(h1.getAge() > h2.getAge());{
					return 1;
				}


			}*/
		//});
		System.out.println("sorted human age");
		for(Human st :li){
			System.out.println(st.getName());
		}
		
	}
}