package com.qa.Blackjack;

public class Blackjack {

	public static void main(String[] args) {
	}

	public int play(int player, int dealer) {
		if ((player > 31 || player < 1) || (dealer > 31 || dealer < 1)) {
			return 0;
		}else {
			if (dealer < 22 && player < 22) {
				return 21 - Math.min(Math.abs(21-dealer), Math.abs(21-player));
			} else {
				if (dealer > 21 && player < 22) {
					return player;
				} else if (dealer < 22 && player > 21) {
					return dealer;
				} else {
					return 0;
				}
			}
		}
	}
	
	public int fact(int num) {
		return num <=1 ? num : num * fact(num-1);
	}
	
	public int playTern(int player, int dealer) {
		if ((player <= 31 && player >= 1) && (dealer <= 31 && dealer >= 1)) {
			return Math.max(dealer > 21 ? 0 : dealer, player > 21 ? 0 : player);
		}
		return 0;
	}
}
