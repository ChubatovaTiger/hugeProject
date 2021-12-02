package subProj_143

import subProj_143.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_143")
    name = "subProj 143"

    buildType(subProj_bt_143_5)
    buildType(subProj_bt_143_4)
    buildType(subProj_bt_143_3)
    buildType(subProj_bt_143_2)
    buildType(subProj_bt_143_1)
    buildType(subProj_bt_143_0)
})
