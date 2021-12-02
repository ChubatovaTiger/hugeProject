package subProj_1811

import subProj_1811.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1811")
    name = "subProj 1811"

    buildType(subProj_bt_1811_0)
    buildType(subProj_bt_1811_1)
    buildType(subProj_bt_1811_2)
    buildType(subProj_bt_1811_3)
    buildType(subProj_bt_1811_4)
    buildType(subProj_bt_1811_5)
})
