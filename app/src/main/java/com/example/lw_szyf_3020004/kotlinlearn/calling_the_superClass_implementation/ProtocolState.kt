package com.example.lw_szyf_3020004.kotlinlearn.calling_the_superClass_implementation

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}