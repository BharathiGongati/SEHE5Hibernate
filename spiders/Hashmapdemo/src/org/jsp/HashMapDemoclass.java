package org.jsp;

public class HashMapDemoclass {
	static int[] hashmap;
	static void createMap(int size) {
		hashmap=new int[size];
		for(int i=0;i<hashmap.length;i++) {
			hashmap[i]=-1;
		}
		System.out.println("hashmap had been created with size :"+size+" successfully");
	}
	static void put(int ele) {
		int in=ele%hashmap.length;
		if(hashmap[in]!=-1) {
			System.out.println("key is already occupied..!");
		}
		else {
			hashmap[in]=ele;
			System.out.println(ele+" had been stored in hashmap with the key value:"+in);
		}
	}
	static void remove(int ele) {
		int in=ele%hashmap.length;
		if(hashmap[in]==ele) {
			hashmap[in]=-1;
			System.out.println(ele+"data had been removed");
			
		}
		else {
			System.out.println("value not found..");
		}
		
	}
	static void display() {
		for(int ele:hashmap) {
			if(ele!=-1) {
				System.out.println(ele);//hash map does not maintain order
			}
		}
	}
	public static void main(String[] args) {
		createMap(5);
		put(99);//in->4
		put(32);//2
		put(8);//3
		put(101);//1
		put(220);//0
		put(67);//2
		remove(42);//2
		remove(32);//2
		put(67);//2
		display();
	}

}
