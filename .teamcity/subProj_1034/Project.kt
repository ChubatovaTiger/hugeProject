package subProj_1034

import subProj_1034.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1034")
    name = "subProj 1034"

    buildType(subProj_bt_1034_2)
    buildType(subProj_bt_1034_3)
    buildType(subProj_bt_1034_4)
    buildType(subProj_bt_1034_5)
    buildType(subProj_bt_1034_0)
    buildType(subProj_bt_1034_1)
})
