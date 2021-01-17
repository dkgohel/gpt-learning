function deepCloning(obj)
{
    //Null checking
    if(obj===null || typeof obj !== 'object') 
    {
        return obj;
    }
    var temp = {};
    for(var x in obj)
    {
        temp[x] = deepCloning(obj[x]);
    }

    return temp;
}

var originalObject = {
    name: 'Darshan',
    age: 21,
    Profession: 'Software Engineer'
};

var duplicateObject = deepCloning(originalObject);

originalObject.name = 'Harsh1111';
console.log(originalObject);
console.log(duplicateObject);

