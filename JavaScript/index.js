function innerFuntion(innervalues){

    function outerF(outervalue){
        return innervalues+" "+outervalue;
    }

    return outerF;

}


const closure = innerFuntion("Neeraj");

const result = closure("Manivarnan");

console.log(result)