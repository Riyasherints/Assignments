function wordReverse(sentence) {
  let reversedSentence = "";
  let currentWord = "";

  for (let i = 0; i < sentence.length; i++) {
      if (sentence[i] !== ' ') {
          currentWord = sentence[i] + currentWord;
      } else {
          reversedSentence += currentWord + ' ';
          currentWord = "";
      }
  }

 
  reversedSentence += currentWord;

  return reversedSentence;
}

const inputSentence = "How are You";
const reversed = wordReverse(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversed);