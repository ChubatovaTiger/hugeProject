package subProj_1523

import subProj_1523.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1523")
    name = "subProj 1523"

    buildType(subProj_bt_1523_5)
    buildType(subProj_bt_1523_0)
    buildType(subProj_bt_1523_3)
    buildType(subProj_bt_1523_4)
    buildType(subProj_bt_1523_1)
    buildType(subProj_bt_1523_2)
})
