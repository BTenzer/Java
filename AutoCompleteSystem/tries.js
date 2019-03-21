function Trie() {
    function TrieNode(letter){
        this.children = {};
        this.endOfWord = false;
        this.letter = letter;
    }

    this.root = new TrieNode('');
    
    this.add = function(word) {
        var current = this.root;

        for (var i = 0; i < word.length; i++) {

            if (!current.children[word[i]]) { 

                current.children[word[i]] = new TrieNode(word[i]);

            }
            current = current.children[word[i]]; 

        }
        current.endOfWord = true;
        
    };

    this.search = function(word) {
        console.log('Searching...');
        var current = this.root;
        for (var i = 0; i < word.length; i++) {
            if (!current.children[word[i]]) {
                return false;
            }
            current = current.children[word[i]];
        }
    };

    this.findWords = function(word) {
        console.log('Finding words...');
        var current = this.root;
        var wordList = [];
        var stack = [];
        var wordStack = [];

        for (var i = 0; i < word.length; i++) { // check that input word is in trie
            if (current.children[word[i]]) {
                current = current.children[word[i]];
            } else {
                return wordList; // if it is not in the trie, retrun an emplty word list 
            }
        }

        stack.push(current);
        wordStack.push(word);

        while (stack.length > 0) {
            var popped = stack.pop();
            var wordPopped = wordStack.pop();
            for (var child in popped.children) {
                stack.push(popped.children[child]);
                wordStack.push(wordPopped + child);
            }
            if (popped.endOfWord) {
                wordList.push(wordPopped);
            }
        }

        return wordList; 
    };  
}

// create instance
// var trie = new Trie();

// // insert common monitor comments
// var ins = ['no stand', 'minor wear', 'cracked screen', 'dead pixels', 'dark spots', 'scratches', 'screen lines'];
// for (let i = 0; i < ins.length; i++) {
//     trie.add(ins[i]);
// }

// for (let i = 0; i < ins.length; i++) {
//     trie.search(ins[i]);
// }




        // for (var i = 0; i < word.length; i++){ // iterates through each char in word // read comment at end of for
        //     if (curr.children[word[i]]) { // if word[i] exists in curr's map, run
        //         // set curr to be the node that word[i] points to in map
        //         curr = curr.children[word[i]]; 
        //     }
        // } // this loop just checks to see if the input word is in the trie, do not use it to do anything else
        // // do the next level of shit after we finish this loop. aWord is already set to be the input word so we don't
        // // have to add anything that we just iterated through in the for loop

        // // here you are left at the end of the input word, you still need to add each possible word from this point
        // // in fact I don't think you actually need to keep what you worked on today
        // // maybe aWord should start as being identical to word (the argument taken in), then you need to concat all
        // // possible extensions once you've confirmed that word exists in the trie
        // // this means, that after the for loop runs, you
        // for (var i = 0; i < curr.children.length; i++) { // now starting from the end of the input word in our trie we
        //     // want to look through the child map of our current node
        //     if (curr.children[i]) { // if an item exists at children[i]
        //         curr = curr.children[i]; // make curr become the child element at [i]
                
        //         // also want to now concat THE CHAR represented by our current node to 'aWord'
        //         // this is where I ended at the library on 3/12/19
        //     }

        // }

        // writing what is above from scratch 