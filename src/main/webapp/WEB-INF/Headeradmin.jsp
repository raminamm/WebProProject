<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>NOG | Admin</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
    <link rel="stylesheet" href="css/fontawesome.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/templatemo-style.css">

</head>

<body id="reportsPage">
    <div class="" id="home">
        <nav class="navbar navbar-expand-xl">
            <div class="container h-100">
                <a class="navbar-brand" href=""><!-- index.html -->
                    <h1 class="tm-site-title mb-0"><img style="width: 50px;">NOG Admin</h1>
                </a>
                <button class="navbar-toggler ml-auto mr-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fas fa-bars tm-nav-icon"></i>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mx-auto h-100">
                        
                        <li class="nav-item">
                            <a class="nav-link" href="Addproduct">
                                <i class="fas fa-cart-plus"></i>
                                Add Products
                            </a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="Orderlistadmin">
                                <i class="far fa-id-card"></i>
                                Order List
                            </a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="EditProduct" method="GET">
                                <i class="fas fa-shopping-bag"></i>
                                Product
                            </a>
                        </li>

                    </ul>
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link d-block" href="${admin==null ?'AdminLogin' : 'Logoutadmin'}"><!-- login.html -->
                                Admin, <b>${admin==null ?'Login' : 'Logout'}</b>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

        </nav>

    </div>
</body>
