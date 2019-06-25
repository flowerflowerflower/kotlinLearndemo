package com.example.lw_szyf_3020004.kotlinlearn.instance


/**
 * lazy mode
 */
class SingletoDemo private constructor() {
    companion object {
        private var instance: SingletoDemo? = null
            get() {
                if (field == null) {
                    field = SingletoDemo()
                }
                return field
            }

        fun get(): SingletoDemo {
            return instance!!
        }
    }
}


/**
 * lazy mode   synchronized
 */
class SingletoDemo2 private constructor() {

    companion object {
        private var instance: SingletoDemo2? = null
            get() {
                if (field == null) {
                    field = SingletoDemo2()
                }
                return field
            }

        @Synchronized
        fun get(): SingletoDemo2 {
            return this.instance!!
        }
    }
}




