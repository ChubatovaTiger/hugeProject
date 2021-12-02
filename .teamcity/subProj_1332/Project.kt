package subProj_1332

import subProj_1332.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1332")
    name = "subProj 1332"

    buildType(subProj_bt_1332_0)
    buildType(subProj_bt_1332_5)
    buildType(subProj_bt_1332_3)
    buildType(subProj_bt_1332_4)
    buildType(subProj_bt_1332_1)
    buildType(subProj_bt_1332_2)
})
