/*
 * Copyright 2015 Diogo Bernardino
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.pharmegic.PocketYoga.linechart;

import android.os.Handler;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.android.pharmegic.R;


public class CardController {


	private ImageButton asan1, asan2, asan3, asan4, asan5;
	private final ImageButton mUpdateBtn;

	private final Runnable unlockAction = new Runnable() {
		@Override
		public void run() {

			new Handler().postDelayed(new Runnable() {
				public void run() {

					unlock();
				}
			}, 500);
		}
	};

	protected boolean firstStage;

	private final Runnable showAction = new Runnable() {
		@Override
		public void run() {

			new Handler().postDelayed(new Runnable() {
				public void run() {

					show(unlockAction);
				}
			}, 500);
		}
	};


	protected CardController(CardView card) {

		super();

		RelativeLayout toolbar = (RelativeLayout) card.findViewById(R.id.chart_toolbar);

		mUpdateBtn = (ImageButton) toolbar.findViewById(R.id.update);
		asan1 = toolbar.findViewById(R.id.asan1);
		asan2 = toolbar.findViewById(R.id.asan2);
		asan3 = toolbar.findViewById(R.id.asan3);
		asan4 = toolbar.findViewById(R.id.asan4);
		asan5 = toolbar.findViewById(R.id.asan5);
		asan1.setOnClickListener(v -> Log.d("Asan1", "Logged"));
		asan2.setOnClickListener(v -> Log.d("Asan2", "Logged"));
		asan3.setOnClickListener(v -> Log.d("Asan3", "Logged"));
		asan4.setOnClickListener(v -> Log.d("Asan4", "Logged"));
		asan5.setOnClickListener(v -> Log.d("Asan5", "Logged"));



		mUpdateBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				update();
			}
		});
	}


	public void init() {

		show(unlockAction);
	}


	protected void show(Runnable action) {

		lock();
		firstStage = false;
	}


	protected void update() {

		lock();
		firstStage = !firstStage;
	}


	protected void dismiss(Runnable action) {

		lock();
	}


	private void lock() {

		mUpdateBtn.setEnabled(false);
	}


	private void unlock() {

		mUpdateBtn.setEnabled(true);
	}
}
