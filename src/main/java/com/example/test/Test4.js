/**
 *đầu tiên khởi tạo lớp Person có : thuộc tính name: string
 * và một hàm khởi tạo có tham số đầu vào name: string
 */
class Person {
    name: string;
    constructor(name: string) {
        this.name = name;
    }
}

/**
 * hàm này nhận tham số đầu vào là 1 đối tượng Person hoặc string
 * biểu thức điều kiện if else if xảy ra: nếu tham số đầu vào là một đối tượng person thuộc kiểu Person thì
 * in ra màn hình: Hello,${person.name}!
 * ${person.name} : có thể hiểu là thuộc tính name của đối tượng person được truyền vào = string
 * nếu tham số đầu vào là person có giá trị và kiểu giống với 'string' thì sẽ in ra màn hình: Hello,${person}!
 * ${person} : có thể hiểu là: = person
 * @param person
 */
function greet(person: Person | string): void {
    if (person instanceof Person) {
        console.log(`Hello, ${person.name}!`);
    } else if (typeof person === 'string') {
        console.log(`Hello, ${person}!`);
    }
}

/**
 * Hàm này nhận tham số đầu vào là một giá trị value là string hoặc number
 * Biểu thức điều kiện if else if dược gọi nếu value truyền vào có giá trị là string và cùng kiểu với 'string' thì :
 * in ra màn hình The value is a string: ${value}
 * ${value} có thể hiểu là: = value
 * nếu kiểu của value được truyền vào có giống với kiểu của 'number'
 * thì sẽ in ra màn hình: The value is a number: ${value}
 * ${value} có thể hiểu = value
 * @param value
 */
function printValue(value: string | number): void {
    if (typeof value === 'string') {
        console.log(`The value is a string: ${value}`);
    } else if (typeof value === 'number') {
        console.log(`The value is a number: ${value}`);
    }
}