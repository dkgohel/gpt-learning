function deepCloning(obj,temp)
{
    if(obj===null || typeof obj !== 'object') 
    {
        return obj;
    }
    if (obj.constructor != Object && obj.constructor != Array) return obj;
    
    if (obj.constructor == Date || obj.constructor == RegExp || obj.constructor == Function ||
        obj.constructor == String || obj.constructor == Number || obj.constructor == Boolean)
        return new obj.constructor(obj);
    temp = new obj.constructor();
    //var temp={};
    // if(Array.isArray(obj))
    // {
    //     temp=[];
    // }
    // else{
    //     temp={};
    // }
    // for(var x in obj)
    // {
    //     temp[x] = deepCloning(obj[x]);
    // }

    for(var x in obj)
    {
        temp[x] = (typeof temp[x] == 'undefined') ? deepCloning(obj[x], null) : temp[x];
    }

    return temp;
}

var originalObject = [25,'darArray',{
    name: 'Darshan',
    age: 21,
    Profession: 'Software Engineer',
    list: ["one","two","three"],
    fun: function(test){ return 1+test }
}];

var duplicateObject = deepCloning(originalObject);

originalObject[2].name = 'Harsh1111';
console.log(originalObject);
console.log(duplicateObject);

