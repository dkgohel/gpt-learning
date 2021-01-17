function deepCloning(obj)
{
    //Null checking
    if(obj===null || typeof obj !== 'object') 
    {
        return obj;
    }
    var temp = null;
    if(Array.isArray(obj))
    {
        temp=[];
    }
    else{
        temp={};
    }
    for(var x in obj)
    {
        temp[x] = deepCloning(obj[x]);
    }

    return temp;
}

var originalObject = [25,'darArray',{
    name: 'Darshan',
    age: 21,
    Profession: 'Software Engineer'
}];

var duplicateObject = deepCloning(originalObject);

originalObject[2].name = 'Harsh1111';
console.log(originalObject);
console.log(duplicateObject);

