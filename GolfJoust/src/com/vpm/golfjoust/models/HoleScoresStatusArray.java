package com.vpm.golfjoust.models;

import java.util.List;


public class HoleScoresStatusArray {

	public Integer currentHole;

	//change to 9 or 18 later
	public HoleScoreStatus[] elements = new HoleScoreStatus[18];

	public void HoleScoreArray() {
	}

	public void initialize(List<HoleScore> holeScores) {
		//change to 9 or 18 holes later
		for (int i = 0; i < 18; i++) {

			// Don't create a new score status element if it already exists
			if (elements[i] == null) {
				elements[i] = new HoleScoreStatus();
			}

			// set the parameters of the element
			if (holeScores != null && i < holeScores.size()
					&& holeScores.get(i) != null) {
				setHoleScoreArrayElement(holeScores.get(i).getHoleNumber(),
						holeScores.get(i).getGrossScore(), holeScores.get(i)
								.getFairwayHit(), holeScores.get(i).getGir(),
						holeScores.get(i).getUpDown(), holeScores.get(i)
								.getSandSave(), holeScores.get(i)
								.getTotalPutts());
				elements[i].scoreUploaded = true;
			} else {
				elements[i].holeScore = null;
				elements[i].scoreUploaded = false;
			}
		}

		if (holeScores == null) {
			currentHole = Integer.valueOf(1);
		} else {
			currentHole = holeScores.size() + 1; // +1 because we need to select
													// the next hole whose score
													// should be uploaded
		}

	}

	public void setHoleScoreArrayElement(final Integer currentHole,
			final Integer score, final Integer fairHit, final Integer gir,
			final Integer upDown, final Integer sandSave,
			final Integer totalPutts) {
		if (elements[currentHole - 1].holeScore == null) {
			elements[currentHole - 1].holeScore = new HoleScore();
		}

		// Store the hole score
		elements[currentHole - 1].holeScore.setHoleNumber(currentHole);
		elements[currentHole - 1].holeScore.setGrossScore(score);
		elements[currentHole - 1].holeScore.setFairwayHit(fairHit);
		elements[currentHole - 1].holeScore.setGir(gir);
		elements[currentHole - 1].holeScore.setUpDown(upDown);
		elements[currentHole - 1].holeScore.setSandSave(sandSave);
		elements[currentHole - 1].holeScore.setTotalPutts(totalPutts);
		elements[currentHole - 1].scoreUploaded = true;
	}

	public void clearScores() {
		initialize(null);
	}

}
