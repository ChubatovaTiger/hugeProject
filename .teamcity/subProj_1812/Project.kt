package subProj_1812

import subProj_1812.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1812")
    name = "subProj 1812"

    buildType(subProj_bt_1812_0)
    buildType(subProj_bt_1812_1)
    buildType(subProj_bt_1812_2)
    buildType(subProj_bt_1812_3)
    buildType(subProj_bt_1812_4)
    buildType(subProj_bt_1812_5)
})
