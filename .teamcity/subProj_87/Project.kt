package subProj_87

import subProj_87.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_87")
    name = "subProj 87"

    buildType(subProj_bt_87_1)
    buildType(subProj_bt_87_2)
    buildType(subProj_bt_87_0)
    buildType(subProj_bt_87_5)
    buildType(subProj_bt_87_3)
    buildType(subProj_bt_87_4)
})
