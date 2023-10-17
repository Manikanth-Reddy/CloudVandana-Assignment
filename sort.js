function sortInDecending() {
    let a = [5, 7, 9, 0, 3, 7, 10, 19];
    Bubblesorting(a);
    console.log(a)
}

function Bubblesorting(a) {
    for (let i = 0; i < a.length - 1; i++) {
        for (let j = 0; j < a.length - 1 - i; j++) {
            if (a[j] > a[j + 1]) {
                let temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}

sortInDecending();