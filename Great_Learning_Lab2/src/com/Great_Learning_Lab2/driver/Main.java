package com.Great_Learning_Lab2.driver;

import java.util.Scanner;

import com.Great_Learning_Lab2.service.MergeSortImpl;
import com.Great_Learning_Lab2.service.NotesCount;

public class Main {

	public static void main(String[] args) {

		MergeSortImpl mergeSortImpl = new MergeSortImpl();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int[] notes = new int[size];
			System.out.println("enter the currency denominations value");
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			System.out.println("enter the amount you want to pay");
			int amount = sc.nextInt();
			mergeSortImpl.sort(notes, 0, notes.length - 1);
			notesCount.notesCountImplementation(notes, amount);
		}
	}
}
