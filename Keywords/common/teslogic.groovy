package common
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

public class teslogic {

	@Keyword
	def minimumBusesRequired2(String families, String member) {
		int jumlahFamily = families.toInteger()
		int[] jumlahAnggotaDiSetiapFamily = member.split(" ").collect { it.toString().toInteger() }

		if (jumlahFamily != jumlahAnggotaDiSetiapFamily.length) {
			WS.comment("Input must be equal with count of family")
			return
		}

		int totalMembers = jumlahAnggotaDiSetiapFamily.sum()
		int minimumBuses = (totalMembers / 4) + (totalMembers % 4 == 0 ? 0 : 1)
		WS.comment("Minimum bus required is : $minimumBuses")
	}

	@Keyword
	def SortCharacter(String word) {
		word = word.replaceAll(' ', '').toLowerCase()
		String[] arrWord = word.toCharArray()
		def vowel = []
		def consonant = []
		for (int i=0; i<arrWord.length;i++) {
			switch (arrWord[i]) {
				case 'a':
				case 'i':
				case 'u':
				case 'e':
						case 'o': vowel << arrWord[i]; break
				default: consonant << arrWord[i]; break
			}
		}
		WS.comment("Vowel Characters : " + vowel.sort().join(''))
		WS.comment("Consonant Characters : " + consonant.sort().join(''))
	}
}
