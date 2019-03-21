HTMLElement.prototype.copyProps = function (source) {
    var copyStyle = getComputedStyle(source);
    var property;
    for (var i = 0; i < copyStyle.length; i++) {
        property = copyStyle[i];
        this.style[property] = copyStyle[property];
    }
}

var trie = new Trie();
var ins = ['no stand', 'minor wear', 'cracked screen', 'dead pixels', 'dark spots', 'scratches', 'screen lines'];
for (let i = 0; i < ins.length; i++) {
    trie.add(ins[i]);
}

for (let i = 0; i < ins.length; i++) {
    trie.search(ins[i]);
}

document.getElementById('trie-text').addEventListener('keyup', function(event) {
    console.log(event, event.target);
    var textArea = event.target;
    var div = getTextCopyDiv();
    writeDiv();
    var helperDiv = createHelperDiv();
    fillInvisidiv(textArea.value);
    div.parentElement.removeChild(div);

    function fillInvisidiv(word) {
        helperDiv.innerHTML = '';
        var effiecientWay = trie.findWords(word);
        for (var i = 0; i < effiecientWay.length; i++) {
            helperDiv.innerHTML += '<div>' + effiecientWay[i] + '</div>';
        }
    }

    function writeDiv() {
        var span = document.createElement('span');
        var startAndEnd = getTextAreaValues();
        div.innerHTML = startAndEnd.startVal;
        div.appendChild(span);
        div.innerHTML += startAndEnd.endVal;
    }

    function getTextAreaValues() {
        var value = textArea.value;
        return {
            startVal: value.substring(0, textArea.selectionStart),
            endVal: value.substring(textArea.selectionStart)
        }
        // var startVal = value.substring(0, textArea.selectionStart);
        // var endVal = value.substring(textArea.selectionStart);
    }

    function getSpanOffset() {
        var childSpan = div.querySelector('span');
        return {
            offLeft: childSpan.offsetLeft,
            offTop: childSpan.offsetTop
        }
    }

    function createHelperDiv() {
        var invisidiv = document.getElementById('invisiDiv');
        var offSets = getSpanOffset();
        invisidiv.style.left = offSets.offLeft + 'px';
        invisidiv.style.top = offSets.offTop - textArea.offsetHeight + 'px';
        return invisidiv;
        
    }
    
    function getTextCopyDiv() {
        var div = document.createElement('div');
        div.copyProps(textArea);
        textArea.parentElement.appendChild(div);
        return div;
    }

    function spaceReplace(aString) {
        
        
        
        return aString;
    }
});


