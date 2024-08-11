#include <stdio.h>

int main(void)
{
	int array[9];
	int i, index;
    int max = 0;

	for (i = 0; i < 9; i++)
	{
		scanf("%d\n", &array[i]);

		if (array[i] > max)
		{
			max = array[i];
			index = i;
		}			
	}

	printf("%d\n%d", max, index + 1);
}