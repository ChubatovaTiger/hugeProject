package subProj_955

import subProj_955.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_955")
    name = "subProj 955"

    buildType(subProj_bt_955_4)
    buildType(subProj_bt_955_3)
    buildType(subProj_bt_955_5)
    buildType(subProj_bt_955_0)
    buildType(subProj_bt_955_2)
    buildType(subProj_bt_955_1)
})
