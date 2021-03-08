#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main(void)
{
	char alphabet[27];
	char word[100] = "";
	printf("영어 단어를 소문자로 입력해주세요 : ");
	scanf("%s", word);

	int i,j;

	for (i = 0; i < 26; i++){
		alphabet[i] = -1;
	}
	for(i = 'a'; i <= 'z'; i++){
		for(j = 0; j < strlen(word); j++){
			
			if (word[j] == i){
				alphabet[i - 'a'] = j;
				break;
			
			}	
		}
	}
	
	for (i = 0; i < 26; i++){
		printf("%d ", alphabet[i]);
	}
	return 0;
}
