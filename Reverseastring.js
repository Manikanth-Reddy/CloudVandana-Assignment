function reverseWords(s1) {
  
    let s2 = "";
    let words = s1.split(" ");

    for (let i = 0; i < words.length; i++) {
        let temp = "";
        let demo = words[i];
        for (let j = demo.length - 1; j >= 0; j--) {
            temp += demo.charAt(j);
        }
        s2 += temp + " ";
    }

    console.log(s2.trim());
}

reverseWords("This is a sunny day");
