def call(Map param = [:]) {
    Map config  = [
            start            : true,
    ]
    config << param

    timestamps {
        print("started")
        print(config)
    }
}