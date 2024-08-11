#include <stdio.h>

int main(void)
{
	int N; 
	double score[1000] = { 0, };


	scanf("%d", &N); 


	for (int i = 0; i < N; i++) 
	{
		scanf("%lf", &score[i]);
	}



	double M = score[0];

	for (int i = 0; i < N; i++)
	{
		if (M < score[i]) 
			M = score[i];
	}



	for (int i = 0; i < N; i++)
	{
		score[i] = (double)score[i] / M * 100.0;
	}

	double avg = 0.0;


	for (int i = 0; i < N; i++)
	{
		avg += score[i];
	}

	printf("%lf", avg / (double)N);
}