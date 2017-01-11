package com.aleksm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MusicShuffler {
	static List<String> allSongs = new ArrayList<>();
	static List<String> unplayedSongs = new LinkedList<>();
	static Stack<String> playedSongs = new Stack<>();
	
	public static void main(String[] args) {
		for (String s : allSongs) {
			unplayedSongs.add(s);
		}
	}
	
	public static String getNextSong() {
		int index = getRandomInt(unplayedSongs.size());
		String nextSong = unplayedSongs.get(index);
		playedSongs.add(nextSong);
		unplayedSongs.remove(index);
		return nextSong;
	}
	
	public static String getPrevSong() {
		return playedSongs.pop();
	}

	private static int getRandomInt(int max) {
		return 4;
	}
	
	public static String getCurrentSong() {
		return "";
	}
}
