package subProj_1233

import subProj_1233.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1233")
    name = "subProj 1233"

    buildType(subProj_bt_1233_1)
    buildType(subProj_bt_1233_2)
    buildType(subProj_bt_1233_3)
    buildType(subProj_bt_1233_4)
    buildType(subProj_bt_1233_5)
    buildType(subProj_bt_1233_0)
})
