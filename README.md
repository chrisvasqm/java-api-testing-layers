# API Testing Demo

Demo project to showcase how we could do API Testing with a few layers to promote Separation of Concerns in our code to 
make the code more maintainable.

The layers are:

1. `Test`
2. `Service`
3. `API Client`

This allows us to make changes at the `Service` or `API Client` level with little to no effects to the `Consumer` of 
the API, in this case the `Test` file.