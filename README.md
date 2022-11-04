# Spring boot boilerplate

# Swagger

http://localhost:8080/swagger-ui/index.html

# Signup

curl POST localhost:8080/api/auth/signup
{
"username": "noman.azeem",
"password": "noman@123",
"email": "noman@nisum.com",
"role": "ADMIN"
}

# Signin 

curl POST localhost:8080/api/auth/signin
{
"username":"noman.azeem",
"password":"noman@123"
}

# Secure call

curl GET localhost:8080/api/secure/hello
Bearer Token : .....

# Public call
curl GET localhost:8080/api/test/all

