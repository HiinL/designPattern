##装饰模式
###一.定义
Attach additional
responsibilities to an object dynamically keeping the same interface.Decorators provide a flexible
alternative to subclassing for extending functionality.（动态地给一个对象添加一些额外的职责。
就增加功能来说，装饰模式相比生成子类更为灵活。）
###二.通用类图
![](.readMe_images/adb6337d.png)
###三.角色
####1.Component抽象构件
Component是一个接口或者是抽象类，就是定义我们最核心的对象，也就是最原始的对
象，如上面的成绩单。
####2.ConcreteComponent 具体构件
ConcreteComponent是最核心、最原始、最基本的接口或抽象类的实现，你要装饰的就是
它。
####3.Decorator装饰角色
一般是一个抽象类，做什么用呢？实现接口或者抽象方法，它里面可不一定有抽象的方
法呀，在它的属性里必然有一个private变量指向Component抽象构件。
####4.具体装饰角色
ConcreteDecoratorA和ConcreteDecoratorB是两个具体的装饰类，你要把你最核心的、最
原始的、最基本的东西装饰成其他东西，上面的例子就是把一个比较平庸的成绩单装饰成家
长认可的成绩单。
###四.装饰模式的优点
####1.装饰类和被装饰类可以独立发展，而不会相互耦合。
换句话说，Component类无须知道Decorator类，Decorator类是从外部来扩展Component类的功能，而Decorator也不用知道具
体的构件。
####2.装饰模式是继承关系的一个替代方案。
我们看装饰类Decorator，不管装饰多少层，返
回的对象还是Component，实现的还是is-a的关系。
####3.装饰模式可以动态地扩展一个实现类的功能，这不需要多说，装饰模式的定义就是如此。
###五.装饰模式的缺点
对于装饰模式记住一点就足够了：多层的装饰是比较复杂的。为什么会复杂呢？你想想
看，就像剥洋葱一样，你剥到了最后才发现是最里层的装饰出现了问题，想象一下工作量
吧，因此，尽量减少装饰类的数量，以便降低系统的复杂度。
